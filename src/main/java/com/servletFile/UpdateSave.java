package com.servletFile;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.helper.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet("/updateSave")
public class UpdateSave extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		int noteId = Integer.parseInt(req.getParameter("noteId"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		Session session = Connection.getFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("Update Notes Set title=:title,content=:content where noteId=:id");
		query.setParameter("title", title);
		query.setParameter("content", content);
		query.setParameter("id", noteId);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		res.sendRedirect("allNotes");
	}
}
