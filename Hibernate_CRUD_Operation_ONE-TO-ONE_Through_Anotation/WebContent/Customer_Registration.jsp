<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Process</title>
</head>
<body>
<center>
	<h1>Customer Registration Form</h1>
	<table>
		<form action="Customer_Controller" method="post" name="frm">
			<tr>
				<th>First Name :</th>
				<td><input type="text" name="fname" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><input type="text" name="lname" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Contact Number :</th>
				<td><input type="text" name="mno" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Email ID :</th>
				<td><input type="text" name="email" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Password :</th>
				<td><input type="password" name="password" autocomplete="off" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" name="action" value="Submit" /></th>
			</tr>
		</form>
	</table>
</center>
<br/><br/><br/>
<% List<Customer_bean> list1 = CustomerDao.getAllCustomers();  %>
<center>
	<h1>This is a Customer Table :</h1>
	<table border="1">
		<tr>
			<th>Customer ID :</th>
			<th>Customer First Name :</th>
			<th>Customer Last Name :</th>
			<th>Customer Contact Number :</th>
			<th>Email ID :</th>
			<th>Password :</th>
			<th>Update Operation :</th>
			<th>Delete Operation :</th>
		</tr>
		<% for(Customer_bean customer : list1) { 
				Customer_Informations_bean cust_info = customer.getCust_info();
			%>
			<tr>
				<td><%= customer.getCid() %></td>
				<td><%= cust_info.getFname() %></td>
				<td><%= cust_info.getLname() %></td>
				<td><%= cust_info.getMno() %></td>
				<td><%= customer.getEmail() %></td>
				<td><%= customer.getPassword() %></td>
				<td>
					<form action="Customer_Controller" method="post">
						<input type="hidden" name="cid" value="<%= customer.getCid() %>" />
						<input type="submit" name="action" value="EDIT" />
					</form>
				</td>
				<td>
					<form action="Customer_Controller" method="post">
						<input type="hidden" name="cid" value="<%= customer.getCid() %>" />
						<input type="submit" name="action" value="DELETE" />
					</form>
				</td>
			</tr>
		<% }  %>
	</table>
</center>
</body>
</html>