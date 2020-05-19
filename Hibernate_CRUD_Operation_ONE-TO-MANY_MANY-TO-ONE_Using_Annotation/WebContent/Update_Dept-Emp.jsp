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
<title>Updation Of Department And Employee Details</title>
</head>
<body>
<center>
	<% EmployeeBean emp = (EmployeeBean) request.getAttribute("emp");
		DepartmentBean dept = emp.getDept();
	%>
	<h1>Updation Process Of Both Department And Employee :</h1>
	<table>
		<form action="Emp_Dept_Controller" method="post">
			<input type="hidden" name="emp_id" value="<%= emp.getEmp_id() %>" />
			<tr>
				<th>Employee Name :</th>
				<td><input type="text" name="emp_name" value="<%= emp.getEmp_name() %>" /></td>
			</tr>
			<tr>
				<th>Department Name :</th>
				<td><input type="text" name="dept_name" value="<%= dept.getDept_name() %>" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Update" /></center></td>
			</tr>
		</form>
	</table>
</center>
</body>
</html>