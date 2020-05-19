package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.customer_details;
import com.dao.customerDao;
import com.dao.employeedao;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equalsIgnoreCase("Register"))
		{
			System.out.println("Register Now Button Is Clicked !");
			customer_details cust = new customer_details();
			cust.setFname(request.getParameter("fname"));
			cust.setLname(request.getParameter("lname"));
			cust.setMno(request.getParameter("mno"));
			cust.setEmail(request.getParameter("email"));
			cust.setPassword(request.getParameter("password"));
			
				try {
					customerDao.insert_customer(cust);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("EDIT"))
		{
			System.out.println("EDIT BUTTON IS CLICKED !");
			int custid = Integer.parseInt(request.getParameter("custid"));
			System.out.println("Customer Id => " + custid);
			customer_details cust = customerDao.getAllCustmerById(custid);
			request.setAttribute("MyCustomer", cust);
			request.getRequestDispatcher("update_customer.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("Update"))
		{
			System.out.println("Update Button Is Clicked !");
			int custid = Integer.parseInt(request.getParameter("custid"));
			customer_details cust = new customer_details();
			
			cust.setId(custid);
			cust.setFname(request.getParameter("fname"));
			cust.setLname(request.getParameter("lname"));
			cust.setMno(request.getParameter("mno"));
			cust.setEmail(request.getParameter("email"));
			cust.setPassword(request.getParameter("password"));
			
			try {
				customerDao.updation(cust);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			response.sendRedirect("view_customer.jsp");
		}
		else if(action.equalsIgnoreCase("DELETE"))
		{
			System.out.println("DELETE BUTTON IS CLICKED !");
			int custid = Integer.parseInt(request.getParameter("custid"));
			System.out.println("Customer Id => " + custid);
			customer_details cust = new customer_details();
			cust.setId(custid);
			
			try {
				customerDao.deletion(cust);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("view_customer.jsp");
		}
		else if(action.equalsIgnoreCase("login"))
		{
			customer_details cust = new customer_details();
			String emailid = request.getParameter("email");
			String password = request.getParameter("password");
			cust.setEmail(emailid);
			cust.setPassword(password);
			try {
				customer_details customer = customerDao.checkLogin(cust);
				if(emailid.equalsIgnoreCase("") || password.equalsIgnoreCase(""))
				{
					out.println("Please Enter Valid Ypur Email ID And Password !");
					request.getRequestDispatcher("customer_login.jsp").forward(request, response);
				}
				else if(customer == null)
				{
					out.println("Your Email ID And Password Is Not Valid , So Please Enter Correct Email ID And Password !");
					request.getRequestDispatcher("customer_login.jsp").forward(request, response);
				}
				else
				{
					HttpSession session = request.getSession();
					session.setAttribute("customer", customer);
					//boolean remember = Boolean.parseBoolean(request.getParameter("remember"));
					
					System.out.println(request.getParameter("remember"));
					if(request.getParameter("remember").equalsIgnoreCase("remember"))
					{
						Cookie ck1 = new Cookie("email",emailid);
						Cookie ck2 = new Cookie("password",password);
						response.addCookie(ck1);
						response.addCookie(ck2);
					}
					request.getRequestDispatcher("customer_home1.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(action.equalsIgnoreCase("Logout"))
		{
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("customer_login.jsp");
		}
	}
}