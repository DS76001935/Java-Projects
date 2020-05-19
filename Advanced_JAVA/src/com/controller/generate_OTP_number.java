package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/generate_OTP_number")

public class generate_OTP_number extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		
		String generate = request.getParameter("generate");
		String fullname = request.getParameter("fullname");
		int age = Integer.parseInt(request.getParameter("age"));
		
		int random_number = (int)(Math.random()*9000)+1000;
		String random = String.valueOf(random_number);
		
		if(generate.equalsIgnoreCase("Generate"))
		{	
			out.print("<center><h1 style='color:orange;'>Hello "+fullname+", You Are "+age+" Years Old !</h1></center>");
			out.print("<center><h1 style='color:brown;'>"+fullname+" Your Random Number Is =>"+random+"</h1></center>");
			request.getRequestDispatcher("generate_OTP_number.jsp").include(request, response);
		}
		
		String verify = request.getParameter("verify");
		
		if(verify.equalsIgnoreCase("Verify"))
		{
			String otp = request.getParameter("otp");
			
			if(otp == "")
			{
				System.out.println("OTP Field Is Empty !");
			}
			else
			{
				if(random.equals(otp))
				{
					System.out.println("Your OTP Number Is Verified Successfully !");
					out.print("<center><h1 style='color:green;'>"+fullname+" Your OTP Number Is Verified Successfully !</h1></center>");
				}
				else
				{
					System.out.println(" Your OTP Number Is Wrong, Please Try Again !");
					out.print("<center><h1 style='color:red;'>Sorry, "+fullname+" Your OTP Number Is Wrong, Please Try Again !</h1></center>");
				}
				request.getRequestDispatcher("generate_OTP_number.jsp").include(request, response);
			}
		}
	}

}
