<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.controller.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject Allocation Process</title>
</head>
<body>
<center>
	<h1 style="color:red;">SUBJECT ALLOCATION PROCESS</h1>
	<table>
		<form action="subject_controller" method="post">
			<tr>
				<th>Enter The Subject Code :</th>
				<td><input type="text" name="subject_code" /></td>
			</tr>
			<tr>
				<th>Enter The Subject Name :</th>
				<td><input type="text" name="subject_name" /></td>
			</tr>
			<tr>
				<th>Enter The Subject Credit :</th>
				<td><input type="text" name="subject_credit" /></td>
			</tr>
			<tr>
				<th>Enter The Faculty Name :</th>
				<td><input type="text" name="faculty_name" /></td>
			</tr>
			<tr>
				<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" name="allocate" value="Allocate" /></th>
			</tr>
		</form>
	</table>
</center>
<br/><br/><br/>
<% List<All_Subjects_Details> list = Subject_Dao.getAllSubjects();  %>
<center>
	<table>
		<tr>
			<th>Subject Code :</th>
			<th>Subject Name :</th>
			<th>Subject Credit :</th>
			<th>Faculty Name :</th>
		</tr>
		<% for(All_Subjects_Details subject : list) {  %>
			<tr>
				<td><%= subject.getSubject_code()  %></td>
				<td><%= subject.getSubject_name()  %></td>
				<td><%= subject.getSubject_credit()  %></td>
				<td><%= subject.getFaculty_name()  %></td>
			</tr>
			<% }  %>
	</table>
</center>
<center><h1>If You're Perform Another Task Than Go back To This Site =><a href="All_Small_Applications.jsp">All Small Applications</a></h1></center>
</body>
</html>