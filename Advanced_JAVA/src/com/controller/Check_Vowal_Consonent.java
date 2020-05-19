package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Check_Vowal_Consonent")

public class Check_Vowal_Consonent extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Check"))
		{
			String word = request.getParameter("word");
			char ch = word.charAt(0);
			
			
			if(ch == 'A' && ch == 'E' && ch == 'I' && ch == 'O' && ch == 'U' && ch == 'a' && ch == 'e' && ch == 'i' && ch == 'o' && ch == 'u')
			{
				request.getRequestDispatcher("Check_Vowal_Consonent.jsp").include(request, response);
				System.out.println("Your Word Is Vowal !");
				out.print("<center><h1 style='color:green;'>Your Word Is Vowal !</h1></center>");
			}
			else
			{
				request.getRequestDispatcher("Check_Vowal_Consonent.jsp").include(request, response);
				System.out.println("Your Word Is Consonent !");
				out.print("<center><h1 style='color:red;'>Your Word Is Consonent !</h1></center>");
			}
		}
		
	}

}
