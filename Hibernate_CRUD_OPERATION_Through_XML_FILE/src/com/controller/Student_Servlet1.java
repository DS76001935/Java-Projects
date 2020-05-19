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

@WebServlet("/Student_Servlet1")

public class Student_Servlet1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Save"))
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			int age = Integer.parseInt(request.getParameter("age"));
			String mno = request.getParameter("mno");
			String stream = request.getParameter("stream");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Student_Informations student = new Student_Informations();
			
			student.setFname(fname);
			student.setLname(lname);
			student.setAge(age);
			student.setMno(mno);
			student.setStream(stream);
			student.setEmail(email);
			student.setPassword(password);
			
			StudentDao.insertStudent(student);
			
			out.print("<center><h1 style='color:green;'>Congratulations, You're Registered In Our Site !</h1></center>");
			request.getRequestDispatcher("Student_Registration.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			int sid = Integer.parseInt(request.getParameter("sid"));
			System.out.println("You Are Press Edit Button !");
			System.out.println("Your Id Is =>"+sid);
			Student_Informations student = StudentDao.getStudentsById(sid);
			request.setAttribute("student", student);
			request.getRequestDispatcher("Student_Updation.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			Student_Informations student = new Student_Informations();
			int sid = Integer.parseInt(request.getParameter("sid"));
			System.out.println("You Are Press Delete Button !");
			System.out.println("Your Id Is =>"+sid);
			student.setSid(sid);
			StudentDao.deleteStudent(student);
			response.sendRedirect("Student_Registration.jsp");
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			int sid = Integer.parseInt(request.getParameter("sid"));
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			int age = Integer.parseInt(request.getParameter("age"));
			String mno = request.getParameter("mno");
			String stream = request.getParameter("stream");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Student_Informations student = new Student_Informations();
			
			student.setSid(sid);
			student.setFname(fname);
			student.setLname(lname);
			student.setAge(age);
			student.setMno(mno);
			student.setStream(stream);
			student.setEmail(email);
			student.setPassword(password);
			
			StudentDao.updateStudent(student);
			
			System.out.println("This Student Details Are Updated Successfully !");
			response.sendRedirect("Student_Registration.jsp");
			
		}
		
	}

}
