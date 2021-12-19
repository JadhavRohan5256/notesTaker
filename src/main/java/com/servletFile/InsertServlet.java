package com.servletFile;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.helper.Connection;
import com.notesInserting.Notes;


public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }
    /**
     * Collecting all data in Obj formate 
     * and then sending data into mysql 
     * throw the hibernate framework
     */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
	   try {
		   Date date = new Date();
		   Notes note = new Notes(req.getParameter("title"),req.getParameter("content"),date);
		   Session session = Connection.getFactory().openSession();
		   session.beginTransaction();
		   session.save(note);
		   session.getTransaction().commit();
		   session.close();
		   out.print("<h1 style='text-align:center;'>Data Successfuly Inserted</h1>");
		   res.sendRedirect("allNotes");
	   } catch(Exception e) {
		   e.printStackTrace();
		   out.print("Some Error Occured! ");
	   }
	}

}
