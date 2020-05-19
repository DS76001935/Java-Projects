package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Student_Controller")

public class Student_Registration_Validation implements Filter
{

	public void destroy()
	{}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
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
		
		if(fname.equals(""))
		{
			String msg1 = "** Required Field";
			request.setAttribute("msg1", msg1);
		}
		if(lname.equals(""))
		{
			String msg2 = "** Required Field";
			request.setAttribute("msg2", msg2);
		}
		if(age.equals(""))
		{
			String msg3 = "** Required Field";
			request.setAttribute("msg3", msg3);
		}
		if(mno.equals(""))
		{
			String msg4 = "** Required Field";
			request.setAttribute("msg4", msg4);
		}
		if(stream.equals(""))
		{
			String msg5 = "** Required Field";
			request.setAttribute("msg5", msg5);
		}
		if(email.equals(""))
		{
			String msg6 = "** Required Field";
			request.setAttribute("msg6", msg6);
		}
		if(password.equals(""))
		{
			String msg7 = "** Required Field";
			request.setAttribute("msg7", msg7);
		}
		if(cpassword.equals(""))
		{
			String msg8 = "** Required Field";
			request.setAttribute("msg8", msg8);
		}
		if(mno.length() != 10)
		{
			String msg9 = "** Contact Number Must Be 10 Digits Only.";
			request.setAttribute("msg9", msg9);
		}
		if(!(password.length() > 8))
		{
			String msg10 = "** Password Must Be More Than 8 Characters.";
			request.setAttribute("msg10", msg10);
		}
		if(!(password.equals(cpassword)))
		{
			String msg11 = "** Your Actual Password And Confirm Password Can't Be Matched.";
			request.setAttribute("msg11", msg11);
		}
		if(fname.equals("") || lname.equals("") || age.equals("") || mno.equals("") || stream.equals("") || email.equals("") || password.equals("") || cpassword.equals("") || mno.length() != 10 || !(password.length() > 8) || !(password.equals(cpassword)))
		{
			request.getRequestDispatcher("Student_Register.jsp").forward(request, response);
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException
	{}

}
