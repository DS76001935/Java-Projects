package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		String search = request.getParameter("search");
		if(search.equalsIgnoreCase("Search"))
		{
			String searchKey = request.getParameter("searchKey");
			response.sendRedirect("https://www.youtube.com/#q="+searchKey);
		}
	}
}
