package com.servletFile;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.query.Query;
import org.hibernate.Session;
import com.helper.Connection;
import com.notesInserting.Notes;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/allNotes")
public class FetchingServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Fetching data from mysql dataBase and
	 *  after fetching data sending to the  showNote.jsp file from ArrayList;
	 */
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Session session = Connection.getFactory().openSession();
		Query query = session.createQuery("from Notes");
		List<Notes> lists = query.list();
		req.setAttribute("list", lists);
		session.close();
		req.getRequestDispatcher("showNotes.jsp").forward(req, res);
	}
}
