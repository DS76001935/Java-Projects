package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/module5_que1_servlet1")

public class module5_que1_servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("Submit"))
		{
			String keyword = request.getParameter("keyword");
			out.print("<h1>Hello ,<u>"+keyword+"</u> Welcome In This Servlet1 Of Module 5 ...</h1>");
		}
		
	}

}
