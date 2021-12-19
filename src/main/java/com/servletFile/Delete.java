package com.servletFile;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.helper.Connection;
@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Deleting data from the mysql 
     */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		int noteId = Integer.parseInt(req.getParameter("noteId"));
		Session session = Connection.getFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("Delete from Notes where noteId=:id");
		query.setParameter("id", noteId);
		int result = query.executeUpdate();
		session.getTransaction().commit();
		res.sendRedirect("allNotes");
	}

}
