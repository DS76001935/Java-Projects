package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/module5_que2_servlet2")
public class module5_que2_servlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("submit");
		if(submit.equalsIgnoreCase("Submit"))
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");
			String gender = request.getParameter("gender");
			String hobby = request.getParameter("hobby");
			String byear = request.getParameter("byear");
			String bmonth = request.getParameter("bmonth");
			String bdate = request.getParameter("bdate");
			String uname = request.getParameter("uname");
			String password = request.getParameter("password");
			String cpassword =request.getParameter("cpassword");
			
			out.print("<h1 style='color:brown;'>Hello, "+fname+" "+ lname +" Thank You For Registrating In Our Site !<br/><br/>Your Whole Details Are As Below :</h1>");
			
			out.print("<h1 style='color:green;'>Your City Is => "+city+"<br/>Your State Is => "+state+"<br/>Your Country Is => "+country+
						"<br/>Your Respected Gender Is => "+gender+"<br/>Your Hobbies Is => "+hobby+"<br/>Your Birth Year => "+byear+
						"<br/>Your Birth Month Is => "+bmonth+"<br/>Your Birth Date Is => "+bdate+"<br/>Your User Name => "+uname+"<br/></h1>");
		}
		
	}

}