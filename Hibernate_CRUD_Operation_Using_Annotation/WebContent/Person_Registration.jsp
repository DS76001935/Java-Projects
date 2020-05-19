<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.util.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Registration Process</title>
</head>
<body>
<center>
	<h1>Person Registration Form</h1>
	<table>
		<form name="frm" action="Person_Controller" method="post">
			<tr>
				<th>Name :</th>
				<td><input type="text" name="name" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Email ID :</th>
				<td><input type="email" name="email" autocomplete="off" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Submit" /></center></td>
			</tr>
		</form>
	</table>
</center>
<center>
	<% List<PersonBean> list = PersonDao.getAllPersons(); %>
	<table border="1">
		<tr>
			<th>Person ID :</th>
			<th>Person Name :</th>
			<th>Person Email ID :</th>
			<th>Update Operation :</th>
			<th>Delete Operation :</th>
		</tr>
	<% for(PersonBean person : list) { %>
		<tr>
			<td><%= person.getPid() %></td>
			<td><%= person.getName() %></td>
			<td><%= person.getEmail() %></td>
			<td>
				<form action="Person_Controller" method="post">
					<input type="hidden" name="pid" value="<%= person.getPid() %>" />
					<input type="submit" name="action" value="EDIT" />
				</form>
			</td>
			<td>
				<form action="Person_Controller" method="post">
					<input type="hidden" name="pid" value="<%= person.getPid() %>" />
					<input type="submit" name="action" value="DELETE" />
				</form>
			</td>
		</tr>
	<% }  %>
	</table>
</center>
</body>
</html>