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
<title>Insertion Operation For Students And Courses</title>
</head>
<body>
<center>
	<h1>Insertion Operation For Students :</h1>
	<table>
		<form action="Students_Courses_Controller" method="post">
			<tr>
				<th>Student First Name :</th>
				<th></th>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<th>Student Last Name :</th>
				<th></th>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<th>Course 1 :</th>
				<th>Android :</th>
				<td><input type="radio" name="core" value="Android" /></td>
				<th>iPhone OS (iOS) :</th>
				<td><input type="radio" name="core" value="IOS" /></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<th>Course 2 :</th>
				<th>Joomla :</th>
				<td><input type="radio" name="core_elective" value="Joomla" /></td>
				<th>Ruby On Rails (ROR) :</th>
				<td><input type="radio" name="core_elective" value="ROR" /></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<th>Course 3 :</th>
				<th>Management Information System (MIS) :</th>
				<td><input type="radio" name="foundation" value="MIS" /></td>
				<th>Enterprise Resource Planning (ERP) :</th>
				<td><input type="radio" name="foundation" value="ERP" /></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td colspan="5"><center><input type="submit" name="action" value="Insert" /></center></td>
			</tr>
		</form>
	</table>
</center>
</body>
</html>