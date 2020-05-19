package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student_Informations;
import com.dao.StudentDao;

@WebServlet("/Student_Controller")

public class Student_Controller extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String save = request.getParameter("save");
		if(save.equalsIgnoreCase("Save"))
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String age = request.getParameter("age");
			String mno = request.getParameter("mno");
			String stream = request.getParameter("stream");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Student_Informations student = new Student_Informations();
			StudentDao.insertStudent(student);
			
			out.print("<center><h1 style='color:green;'>Your All Data Are Saved Successfully !</h1></center>");
			out.print("<center><h1 style='color:red;'>If You Are Show Your All Details Than Click Here =><a href='Show_Students_Details.jsp'>SHOW</a></h1></center>");
		}
	}

}
