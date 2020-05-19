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
<title>Person Updation Process</title>
</head>
<body>
<center>
	<h1>Person Updation Form</h1>
	<% PersonBean person = (PersonBean)request.getAttribute("person");  %>
	<table>
		<form action="Person_Controller" method="post">
			<input type="hidden" name="pid" value="<%= person.getPid() %>" />
			<tr>
				<th>Name :</th>
				<td><input type="text" name="name" value="<%= person.getName()  %>" /></td>
			</tr>
			<tr>
				<th>Email ID :</th>
				<td><input type="email" name="email" value="<%= person.getEmail() %>" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Update" /></center></td>
			</tr>
		</form>
	</table>
</center>
</body>
</html>