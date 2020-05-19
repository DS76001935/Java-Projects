package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;
import com.dao.EmpDept_Dao;

@WebServlet("/Emp_Dept_Controller")

public class Emp_Dept_Controller extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Insert"))
		{
			String dept_name = request.getParameter("dept_name");
			DepartmentBean dept = new DepartmentBean();
			
			dept.setDept_name(dept_name);
			
			EmpDept_Dao.InsertDept(dept);
			
			out.print("<center><h1 style='color:green;'>Congratulations, Department Was Inserted Successfully !</h1></center>");
			request.getRequestDispatcher("Insert_Dept-Emp.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("Save"))
		{
			int dept_id = Integer.parseInt(request.getParameter("department"));
			String emp_name = request.getParameter("emp_name");
			EmployeeBean emp = new EmployeeBean();
			DepartmentBean dept = new DepartmentBean();
			
			dept.setDept_id(dept_id);
			emp.setEmp_name(emp_name);
			emp.setDept(dept);
			
			EmpDept_Dao.InsertEmp(emp);
			
			out.print("<center><h1 style='color:green;'>Congratulations, Employee Was Saved Successfully !</h1></center>");
			request.getRequestDispatcher("Insert_Dept-Emp.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			EmployeeBean emp = EmpDept_Dao.getEmpById(emp_id);
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("Update_Dept-Emp.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			EmployeeBean emp = EmpDept_Dao.getEmpById(emp_id);
			DepartmentBean dept = emp.getDept();
			dept.setDept_name(request.getParameter("dept_name"));
			emp.setEmp_name(request.getParameter("emp_name"));
			emp.setDept(dept);
			EmpDept_Dao.updateEmp(emp);
			out.print("<center><h1 style='color:green;'>This Employee's Data Was Updated Successfully !</h1></center>");
			request.getRequestDispatcher("Insert_Dept-Emp.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			int emp_id = Integer.parseInt(request.getParameter("emp_id"));
			EmployeeBean emp = EmpDept_Dao.getEmpById(emp_id);
			DepartmentBean dept = emp.getDept();
			EmpDept_Dao.deleteDept(dept);
			EmpDept_Dao.deleteEmp(emp);
			out.print("<center><h1 style='color:red;'>This Employee's Data Was Deleted Successfully !</h1></center>");
			request.getRequestDispatcher("Insert_Dept-Emp.jsp").include(request, response);
		}
		
	}

}
