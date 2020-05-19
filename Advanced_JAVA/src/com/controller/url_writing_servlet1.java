package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url_writing_servlet1")
public class url_writing_servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit = request.getParameter("submit");
		PrintWriter out = response.getWriter();
		if(submit.equalsIgnoreCase("Send"))
		{
			String username = request.getParameter("username");
			out.print("<h1>Hello "+ username + ", Welcome In This Servlet 1 Page !</h1><br/>");
			out.print("<h1>If You Are Visit The Servlet 2 Page Than Click Here =>  <a href='url_writing_servlet2?username="+username+"'>Servlet 2 Page</a></h1>");
		}
	}

}
