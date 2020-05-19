	package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student_Controller")

public class Student_Controller extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String mno = request.getParameter("mno");
		String stream = request.getParameter("stream");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		
		request.getRequestDispatcher("Student_Register.jsp").include(request, response);
		
		out.println("<center><h1 style='color:green;'>Congratulations, Your  Informations Are Successfully Saved.</h1></center>");
		
		/*out.println("<center><h1>First Name =>"+fname+"<br/>"
				+ "Last Name =>"+lname+"<br/>"
						+ "Age => "+age+"<br/>"
								+ "Contact Number => "+mno+"<br/>"
										+ "Stream => "+stream+"<br/>"
												+ "Email ID => "+email+"</h1></center>");*/
	}

}
