package com.tejas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i=(request.getParameter("user"));
		String j=(request.getParameter("pass"));
		String k=i+j;
		response.sendRedirect("welcome.jsp");
		//System.out.println("WELCOM");
   	}

	
}
