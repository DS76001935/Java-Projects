<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Updation Process</title>
</head>
<body>
<center>
	<% Customer_bean customer = (Customer_bean)request.getAttribute("customer");
		Customer_Informations_bean cust_info = customer.getCust_info();
	%>
	<h1>Customer Updation Form</h1>
	<table>
		<form action="Customer_Controller" method="post">
			<input type="hidden" name="cid" value="<%= customer.getCid() %>" />
			<tr>
				<th>Customer First Name :</th>
				<td><input type="text" name="fname" value="<%= cust_info.getFname() %>" /></td>
			</tr>
			<tr>
				<th>Customer Last Name :</th>
				<td><input type="text" name="lname" value="<%= cust_info.getLname() %>" /></td>
			</tr>
			<tr>
				<th>Customer Contact Number :</th>
				<td><input type="text" name="mno" value="<%= cust_info.getMno() %>" /></td>
			</tr>
			<tr>
				<th>Customer Email ID :</th>
				<td><input type="tect" name="email" value="<%= customer.getEmail() %>" /></td>
			</tr>
			<tr>
				<th>Customer Password :</th>
				<td><input type="password" name="password" value="<%= customer.getPassword() %>" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Update" /></center></td>
			</tr>
		</form>
	</table>
</center>
</body>
</html>