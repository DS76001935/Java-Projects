package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.employee_details;
import com.dao.employeedao;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equalsIgnoreCase("Insert"))
		{
			System.out.println("Insert Button Is Clicked !");
			
			employee_details e = new employee_details();
			
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setAge(Integer.parseInt(request.getParameter("age")));
			e.setEmail(request.getParameter("email"));
			e.setSalary(Float.parseFloat(request.getParameter("salary")));
			e.setContact_no(request.getParameter("mno"));
			
			try {
				employeedao.insertion(e);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			response.sendRedirect("view.jsp");
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			int eid = Integer.parseInt(request.getParameter("eid"));
			employee_details e = employeedao.getAllEmpById(eid);
			
			request.setAttribute("Myemp", e);
			request.getRequestDispatcher("update_form.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("Update"))
		{
			employee_details e = new employee_details();
			int eid = Integer.parseInt(request.getParameter("eid"));
			
			e.setEid(eid);
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setAge(Integer.parseInt(request.getParameter("age")));
			e.setEmail(request.getParameter("email"));
			e.setSalary(Float.parseFloat(request.getParameter("salary")));
			e.setContact_no(request.getParameter("mno"));
			
			try {
				employeedao.updation(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			response.sendRedirect("view.jsp");
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			employee_details e = new employee_details();
			
			int eid = Integer.parseInt(request.getParameter("eid"));
			
			e.setEid(eid);
			
			try {
				employeedao.deletion(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			response.sendRedirect("view.jsp");
		}
	}
}