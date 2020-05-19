package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mathemetical_Operations")
public class Mathemetical_Operations extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String operation = request.getParameter("operation");
		System.out.println(operation);
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		if(operation.equalsIgnoreCase("ADD"))
		{
			System.out.println("You Have CLicked ADD Button !");
			
			int sum = (number1 + number2);
			System.out.println("Addition Of This Two Numbers Is =>" + sum);
			
			request.getRequestDispatcher("All_Mathemetical_Operations.jsp").include(request, response);
			
			out.print("<center><h1 style='color:green;'>Addition Of This Numbers Are :"+  sum+"</h1></center>");
		}
		else if(operation.equalsIgnoreCase("MINUS"))
		{
			System.out.println("You Have CLicked MINUS Button !");
			
			int minus = (number1 - number2);
			System.out.println("Subtrection Of This Two Numbers Is =>" + minus);
			
			request.getRequestDispatcher("All_Mathemetical_Operations.jsp").include(request, response);
			
			out.print("<center><h1 style='color:orange;'>Subtrection Of This Numbers Are :  "+minus+"</h1></center>");
		}
		else if(operation.equalsIgnoreCase("MULTIPLY"))
		{
			System.out.println("You Have CLicked MULTIPLY Button !");
			
			int multiply = (number1 * number2);
			System.out.println("Multiplication Of This Two Numbers Is =>" + multiply);
			
			request.getRequestDispatcher("All_Mathemetical_Operations.jsp").include(request, response);
			
			out.print("<center><h1 style='color:brown;'>Multiplication Of This Numbers Are :  "+multiply+"</h1></center>");
		}
		else if(operation.equalsIgnoreCase("DIVIDE"))
		{
			System.out.println("You Have CLicked MULTIPLY Button !");
			
			int divide = (number1 / number2);
			System.out.println("Division Of This Two Numbers Is =>" + divide);
			
			request.getRequestDispatcher("All_Mathemetical_Operations.jsp").include(request, response);
			
			out.print("<center><h1 style='color:blue;'>Division Of This Numbers Are :  "+divide+"</h1></center>");
		}
		else if(operation.equalsIgnoreCase("MODULUS"))
		{
			System.out.println("You Have CLicked MULTIPLY Button !");
			
			int modulus = (number1 % number2);
			System.out.println("Modulation Of This Two Numbers Is =>" + modulus);
			
			request.getRequestDispatcher("All_Mathemetical_Operations.jsp").include(request, response);
			
			out.print("<center><h1 style='color:red;'>Modulation Of This Numbers Are :  "+modulus+"</h1></center>");
		}
	}

}
