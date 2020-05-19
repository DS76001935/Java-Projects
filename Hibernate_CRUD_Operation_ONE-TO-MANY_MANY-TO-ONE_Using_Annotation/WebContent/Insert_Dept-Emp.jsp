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
<title>Insertion Of All Departments</title>
</head>
<body>
<center>
	<h1>Insertion Of Each And Every Departments :</h1>
	<table>
		<form action="Emp_Dept_Controller" method="post">
			<tr>
				<th>Department Name :</th>
				<td><input type="text" name="dept_name" autocomplete="off" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Insert" /></center></td>
			</tr>
		</form>
	</table>
</center>
<br/><br/><br/><br/>
<center>
	<% List<DepartmentBean> list1=EmpDept_Dao.getAllDept(); %>
	<h1>Insertion Of Employees :</h1>
	<table>
		<form action="Emp_Dept_Controller" method="post">
			<tr>
				<th>Select Your Department :</th>
				<td>
					<select name="department">
						<option>All Department</option>
						<% for(DepartmentBean dept : list1) { %>
						<option value="<%= dept.getDept_id() %>"><%= dept.getDept_name() %></option>
						<% } %>
					</select>
				</td>
			</tr>
			<tr>
				<th>Employee Name :</th>
				<td><input type="text" name="emp_name" autocomplete="off" /></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" name="action" value="Save" /></center></td>
			</tr>
		</form>
	</table>
</center>
<br/><br/><br/><br/>
<center>
	<% List<EmployeeBean> list2 = EmpDept_Dao.getAllEmp(); %>
	<table border="1">
		<tr>
			<th>Employee ID :</th>
			<th>Employee Name :</th>
			<th>Department Name :</th>
			<th>Update Operation :</th>
			<th>Delete Operation :</th>
		</tr>
	<% for(EmployeeBean emp : list2) {
		DepartmentBean dept = emp.getDept();
		%>
		<tr>
			<td><%= emp.getEmp_id() %></td>
			<td><%= emp.getEmp_name() %></td>
			<td><%= dept.getDept_name() %></td>
			<td>
				<form action="Emp_Dept_Controller" method="post">
					<input type="hidden" name="emp_id" value="<%= emp.getEmp_id() %>" />
					<input type="submit" name="action" value="EDIT" />
				</form>
			</td>
			<td>
				<form action="Emp_Dept_Controller" method="post">
					<input type="hidden" name="emp_id" value="<%= emp.getEmp_id() %>" />
					<input type="submit" name="action" value="DELETE" />
				</form>
			</td>
		</tr>
	<% } %>
	</table>
</center>
</body>
</html>