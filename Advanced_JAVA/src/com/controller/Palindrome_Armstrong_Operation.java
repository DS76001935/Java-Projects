package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Palindrome_Armstrong_Operation")

public class Palindrome_Armstrong_Operation extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String operation = request.getParameter("operation");
		int number = Integer.parseInt(request.getParameter("number"));
		int temp_number1 = number;
		
		if(operation.equalsIgnoreCase("Find Palindrome Number Or Not?"))
		{
			int rem = 0,rev = 0;
			
			while(number > 0)
			{
				rem = number % 10;
				rev = (rev * 10) + rem;
				number = number / 10;
				
			}
			
			request.getRequestDispatcher("Palindrome_Armstrong_Operation.jsp").include(request, response);
			
			if(temp_number1 == rev)
			{
				out.print("<center><h1 style='color:green;'>This Your Number Is a Palindrom Number !</h1></center>");
			}
			else
			{
				out.print("<center><h1 style='color:red;'>This Your Number Is Not a Palindrom Number !</h1></center>");
			}
		}
		else if(operation.equalsIgnoreCase("Find Armstrong Number Or Not?"))
		{
			int rem = 0,sum = 0;
			
			while(number > 0)
			{
				rem = number % 10;
				sum = sum + (rem*rem*rem);
				number = number / 10;
				
			}
			
			request.getRequestDispatcher("Palindrome_Armstrong_Operation.jsp").include(request, response);
			
			if(temp_number1 == sum)
			{
				out.print("<center><h1 style='color:green;'>This Your Number Is a Armstrong Number !</h1></center>");
			}
			else
			{
				out.print("<center><h1 style='color:red;'>This Your Number Is Not a Armstrong Number !</h1></center>");
			}
		}
		
	}

}
