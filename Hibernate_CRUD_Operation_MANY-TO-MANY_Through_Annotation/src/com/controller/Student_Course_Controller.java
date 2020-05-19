package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CourseBean;
import com.bean.StudentBean;
import com.dao.Student_Course_Dao;

@WebServlet("/Student_Course_Controller")

public class Student_Course_Controller extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Insert"))
		{
			StudentBean student = new StudentBean();
			CourseBean course1 = new CourseBean();
			CourseBean course2 = new CourseBean();
			CourseBean course3 = new CourseBean();
			
			course1.setCourse_name(request.getParameter("core"));
			course2.setCourse_name(request.getParameter("core_elective"));
			course3.setCourse_name(request.getParameter("foundation"));
			
			student.setFname(request.getParameter("fname"));
			student.setLname(request.getParameter("lname"));
			
			Collection<CourseBean> list = new ArrayList<CourseBean>();
			list.add(course1);
			list.add(course2);
			list.add(course3);
			
			student.setCourses(list);
			
			Student_Course_Dao.InsertStudent(student);
			Student_Course_Dao.InsertCourse(course1);
			Student_Course_Dao.InsertCourse(course2);
			Student_Course_Dao.InsertCourse(course3);
			
			out.print("<center><h1 style='color:green;'>Congratulations, Your All Personal And Course Details Was Saved Successfully !</h1></center>");
			request.getRequestDispatcher("Insert_Students_Courses.jsp").include(request, response);
		}
			
	}

}
