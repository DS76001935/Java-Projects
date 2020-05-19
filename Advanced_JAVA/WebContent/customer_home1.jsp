<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<%@ page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home Page</title>
</head>
<body>
	<%
		
		customer_details cust = null;
		if(session != null)
		{
			if(session.getAttribute("customer") != null)
			{
				cust = (customer_details)session.getAttribute("customer");
				%>
				<h1>Welcome <%= cust.getFname() %> <%= cust.getLname() %> In Our Site.</h1>
				<h4>If You Are Go To For Log Out Than Click Here =>
					<form action="servlet2" method="post" style="position:relative; bottom:20px;left:350px;">
						<input type="submit" value="Logout" name="action" id="logout" />
					</form>
				</h4>
				<%
			}
			else
			{
				response.sendRedirect("customer_login.jsp");
			}
		}
		else
		{
			response.sendRedirect("customer_login.jsp");
		}
	
	%>
</body>
</html></html>