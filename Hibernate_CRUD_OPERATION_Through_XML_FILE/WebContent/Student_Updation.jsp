<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Updation Process</title>
</head>
<body>
<% Student_Informations student = (Student_Informations)request.getAttribute("student"); %>
<center>
	<h1>Student Updation Process</h1>
	<table>
		<form action="Student_Servlet1" method="post" name="frm">
			<input type="hidden" name="sid" value="<%= student.getSid() %>" />
			<tr>
				<th>First Name :</th>
				<td><input type="text" name="fname" value="<%= student.getFname() %>" /></td>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><input type="text" name="lname" value="<%= student.getLname() %>" /></td>
			</tr>
			<tr>
				<th>Age :</th>
				<td><input type="text" name="age" value="<%= student.getAge() %>" /></td>
			</tr>
			<tr>
				<th>Contact Number :</th>
				<td><input type="text" name="mno" value="<%= student.getMno() %>" /></td>
			</tr>
			<tr>
				<th>Stream :</th>
				<td><input type="text" name="stream" value="<%= student.getStream() %>" /></td>
			</tr>
			<tr>
				<th>Email ID :</th>
				<td><input type="text" name="email" value="<%= student.getEmail() %>" /></td>
			</tr>
			<tr>
				<th>Password :</th>
				<td><input type="password" name="password" value="<%= student.getPassword() %>" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" name="action" value="Update" /></th>
			</tr>
		</form>
	</table>
</center>
</body>
</html>