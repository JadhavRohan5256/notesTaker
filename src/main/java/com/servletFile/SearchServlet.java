package com.servletFile;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.helper.Connection;
import com.notesInserting.Notes;

import java.util.List;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	/**
	 * collecting search data and then retrieving all data related search data
	 */
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String search = req.getParameter("search");
		Session session = Connection.getFactory().openSession();
		Query<Notes> query = session.createQuery("from Notes where title LIKE '%"+search+"%' OR content LIKE '%"+search+"%'");
		List<Notes> list = query.list();
		System.out.println(list);
		session.close();
		req.setAttribute("list", list);
		req.getRequestDispatcher("showNotes.jsp").forward(req, res);
	}
}
