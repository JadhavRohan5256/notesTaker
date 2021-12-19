package com.servletFile;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet("/update")
public class Update extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		int noteId = Integer.parseInt(req.getParameter("noteId"));
		req.setAttribute("noteId", noteId);
		req.getRequestDispatcher("update.jsp").forward(req, res);
	}
	
}
