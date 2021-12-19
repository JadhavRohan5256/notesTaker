package com.servletFile;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp"); 
		dispatcher.forward(req, res);
	}
}

