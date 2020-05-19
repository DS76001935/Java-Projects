package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Counter_Operation")

public class Counter_Operation extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int i,j,count1 = 0,evenCount = 0,oddCount = 0,count2 = 0,count3 = 0;
		String action = request.getParameter("action");
		int limit = Integer.parseInt(request.getParameter("limit"));
		
		if(action.equalsIgnoreCase("Counter"))
		{
			for(i = 0;i<=limit;i++)
			{
				for(j = 2;j<=i;j++)
				{
					if(i % j == 0)
					{
						break;
					}
				}
				if(j == i)
				{
					count1++;
				}
				if(i % 2 == 0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
				if(i % 7 == 0)
				{
					count2++;
				}
				if(i % 5 == 0)
				{
					count3++;
				}
			}
			request.getRequestDispatcher("Counter_Operation.jsp").include(request, response);
			out.print("<center><h1 style='color:brown;'>Total Numbers Of Prime Members Are => "+count1+"</h1></center>");
			out.print("<center><h1 style='color:green;'>Total Numbers Of Even Members Are => "+evenCount+"</h1></center>");
			out.print("<center><h1 style='color:red;'>Total Numbers Of Odd Members Are => "+oddCount+"</h1></center>");
			out.print("<center><h1 style='color:orange;'>Total Numbers Of Members Divisable By 7 => "+count2+"</h1></center>");
			out.print("<center><h1 style='color:blue;'>Total Numbers Of Divisable By 5 => "+count3+"</h1></center>");
		}
	}
}
