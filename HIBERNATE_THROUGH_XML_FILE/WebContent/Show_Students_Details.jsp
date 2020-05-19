<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.*" %>
<%@ page import="com.dao.*" %>
<%@ page import ="com.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.controller.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Students Details</title>
</head>
<body>
<h1>Show All Students Details :</h1>
<%List<Student_Informations> list = StudentDao.getAllStudents(); %>
<table>
	<tr>
		<th>Student ID:</th>
		<th>Student First Name:</th>
		<th>Student Last Name:</th>
		<th>Student Age:</th>
		<th>Student Contact Number:</th>
		<th>Student Stream Name:</th>
		<th>Student Email ID:</th>
	</tr>
	<%for(Student_Informations student:list) { %>
			<tr>
				<td><%=student.getSid() %></td>
				<td><%= student.getFname() %></td>
				<td><%= student.getLname() %></td>
				<td><%= student.getAge() %></td>
				<td><%= student.getMno() %></td>
				<td><%= student.getStream() %></td>
				<td><%= student.getEmail() %></td>
			</tr>
	<% }  %>
</table>
</body>
</html>