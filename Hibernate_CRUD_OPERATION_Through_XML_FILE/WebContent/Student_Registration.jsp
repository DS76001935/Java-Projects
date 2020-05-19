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
<title>Student Registration Form</title>
<style>
	#edit
	{
		width:135px;
		height:40px;
		color:white;
		background-color: green;
	}
	#edit:hover
	{
		background-color: lightgreen;
	}
	#delete
	{
		width:135px;
		height:40px;
		color:white;
		background-color: red;
	}
	#delete:hover
	{
		background-color: orange;
	}
</style>
</head>
<body>
<center>
	<h1>Student Registration Form</h1>
	<table>
		<form action="Student_Servlet1" method="post" name="frm">
			<tr>
				<th>First Name :</th>
				<td><input type="text" name="fname" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><input type="text" name="lname" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Age :</th>
				<td><input type="text" name="age" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Contact Number :</th>
				<td><input type="text" name="mno" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Stream :</th>
				<td><input type="text" name="stream" autocomplete="off" /></td>
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
				<th colspan="2"><input type="submit" name="action" value="Save" /></th>
			</tr>
		</form>
	</table>
</center>
<% List<Student_Informations> list = StudentDao.getAllStudents();  %>
<center>
	<h1>All The Student's Informations :-</h1>
	<table border="1">
		<tr>
			<th>Student ID :</th>
			<th>Student First Name :</th>
			<th>Student Last Name :</th>
			<th>Student Age :</th>
			<th>Student Contact Number :</th>
			<th>Student Stream Name :</th>
			<th>Student Email ID :</th>
			<th>Update Operation :</th>
			<th>Delete Operation :</th>
		</tr>
		<% for(Student_Informations student : list) {  %>
			<tr>
				<td><%= student.getSid()  %></td>
				<td><%= student.getFname() %></td>
				<td><%= student.getLname() %></td>
				<td><%= student.getAge() %></td>
				<td><%= student.getMno() %></td>
				<td><%= student.getStream() %></td>
				<td><%= student.getEmail() %></td>
				<td>
					<form action="Student_Servlet1" method="post">
						<input type="hidden" name="sid" value="<%= student.getSid() %>" />
						<input type="submit" id="edit" name="action" value="EDIT" />
					</form>
				</td>
				<td>
					<form action="Student_Servlet1" method="post">
						<input type="hidden" name="sid" value="<%= student.getSid() %>" />
						<input type="submit" id="delete" name="action" value="DELETE" />
					</form>
				</td>
			</tr>
		<% } %>
	</table>
</center>
</body>
</html>