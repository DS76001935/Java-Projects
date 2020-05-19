package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.All_Subjects_Details;
import com.dao.Subject_Dao;

@WebServlet("/subject_controller")

public class subject_controller extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String allocate = request.getParameter("allocate");
		
		if(allocate.equalsIgnoreCase("Allocate"))
		{
			String subject_code = request.getParameter("subject_code");
			String subject_name = request.getParameter("subject_name");
			int subject_credit = Integer.parseInt(request.getParameter("subject_credit"));
			String faculty_name = request.getParameter("faculty_name");
			
			All_Subjects_Details subject1 = new All_Subjects_Details();
			
			subject1.setSubject_code(subject_code);
			subject1.setSubject_name(subject_name);
			subject1.setSubject_credit(subject_credit);
			subject1.setFaculty_name(faculty_name);
			
			try {
				Subject_Dao.insert_Subjects(subject1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("Subject_Allocation.jsp").include(request, response);
		}
		
	}

}
