package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer_Informations_bean;
import com.bean.Customer_bean;
import com.dao.CustomerDao;

@WebServlet("/Customer_Controller")

public class Customer_Controller extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("Submit"))
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String mno = request.getParameter("mno");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Customer_Informations_bean cust_info = new Customer_Informations_bean();
			cust_info.setFname(fname);
			cust_info.setLname(lname);
			cust_info.setMno(mno);
			CustomerDao.insertCustomerInformations(cust_info);
			
			Customer_bean customer = new Customer_bean();
			customer.setEmail(email);
			customer.setPassword(password);
			customer.setCust_info(cust_info);
			CustomerDao.insertCustomer(customer);
			out.print("<center><h1 style='color:green;'>Congratulations, Your Data Was Successfully Saved !</h1></center>");
			request.getRequestDispatcher("Customer_Registration.jsp").include(request, response);
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			int cid = Integer.parseInt(request.getParameter("cid"));
			Customer_bean customer = CustomerDao.getCustomerById(cid);
			request.setAttribute("customer", customer);
			request.getRequestDispatcher("Customer_Updation.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			int cid = Integer.parseInt(request.getParameter("cid"));
			Customer_bean customer = CustomerDao.getCustomerById(cid);
			Customer_Informations_bean cust_info = customer.getCust_info();
			cust_info.setFname(request.getParameter("fname"));
			cust_info.setLname(request.getParameter("lname"));
			cust_info.setMno(request.getParameter("mno"));
			customer.setEmail(request.getParameter("email"));
			customer.setPassword(request.getParameter("password"));
			customer.setCust_info(cust_info);
			CustomerDao.UpdateCustomer(customer);
			out.print("<center><h1 style='color:green;'>Your Data Are Updated !</h1></center>");
			request.getRequestDispatcher("Customer_Registration.jsp").include(request, response);
			
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			int cid = Integer.parseInt(request.getParameter("cid"));
			Customer_bean customer = CustomerDao.getCustomerById(cid);
			Customer_Informations_bean cust_info_bean = customer.getCust_info();
			CustomerDao.DeleteCustomer(customer);
			CustomerDao.DeleteCustomerinformations(cust_info_bean);
			out.print("<center><h1 style='color:red;'>This Customer Is Deleted !</h1></center>");
			request.getRequestDispatcher("Customer_Registration.jsp").include(request, response);
		}
		
	}
}
