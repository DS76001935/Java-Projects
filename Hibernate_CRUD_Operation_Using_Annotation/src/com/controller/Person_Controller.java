package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.PersonBean;
import com.dao.PersonDao;

@WebServlet("/Person_Controller")

public class Person_Controller extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Submit"))
		{
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			PersonBean person = new PersonBean();
			person.setName(name);
			person.setEmail(email);
			
			try
			{
				PersonDao.InsertPerson(person);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			out.print("<center><h1 style='color:green;'>Congratulations, One Person Was Successfully Saved In Your Database.</h1></center>");
			request.getRequestDispatcher("Person_Registration.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			int pid = Integer.parseInt(request.getParameter("pid"));
			System.out.println("Your ID Is =>" + pid);
			System.out.println("EDIT Button Is Clicked !");
			PersonBean person = PersonDao.getPersonById(pid);
			request.setAttribute("person", person);
			request.getRequestDispatcher("Person_Updation.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int pid = Integer.parseInt(request.getParameter("pid"));
			
			PersonBean person = new PersonBean();
			person.setPid(pid);
			person.setName(name);
			person.setEmail(email);
			
			PersonDao.UpdatePerson(person);
			out.print("<center><h1 style='color:green;'>This Person Was Successfully Updated !</h1></center>");
			request.getRequestDispatcher("Person_Registration.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			int pid = Integer.parseInt(request.getParameter("pid"));
			System.out.println("Your Id Is =>" + pid);
			System.out.println("DELETE Button Is Pressed !");
			
			PersonBean person = new PersonBean();
			person.setPid(pid);
		
			PersonDao.DeletePerson(person);
			out.print("<center><h1 style='color:red;'>This Person Was Removed !</h1></center>");
			request.getRequestDispatcher("Person_Registration.jsp").include(request, response);
			
		}
		
	}

}
