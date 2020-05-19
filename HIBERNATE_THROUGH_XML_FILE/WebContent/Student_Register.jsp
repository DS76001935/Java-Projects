<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<center>
	<h1>Student Registration Form</h1>
	<table>
		<form action="Student_controller" method="post">
			<tr>
				<th>First Name:</th>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<th>Age:</th>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<th>Contact Number:</th>
				<td><input type="text" name="mno" /></td>
			</tr>
			<tr>
				<th>Stream:</th>
				<td><input type="text" name="stream" /></td>
			</tr>
			<tr>
				<th>Email ID:</th>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" name="save" value="Save" /></th>
			</tr>
		</form>
	</table>
	</center>
</body>
</html>