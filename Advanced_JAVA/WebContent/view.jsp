<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.bean.*" %>
    <%@page import="java.util.*" %>
    <%@page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employee Records</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<style>
	#insertbtn
	{
		width:250px;
		height:70px;
		cursor:pointer;
		position:relative;
		left:1250px;
		bottom:70px;
		font-size:20px;
	}
	#editbtn
	{
		width:160px;
		height:50px;
		cursor:pointer;
	}
	#deletebtn
	{
		width:160px;
		height:50px;
		cursor:pointer;
	}
</style>
</head>
<body>

	<%
		List<employee_details> list = employeedao.getAllEmp();
	%>
	<br/><br/><h1 class="text-primary  text-uppercase text-center" id="h1_1">AJAX SERVER SIDE OPERATION <u>(INSERT,UPDATE,DELETE INFORMATIONS)</u></h1><br/><br/>
	<table class="table table-bordered table-striped text-center">
	<br/><br/>
	<form action="insert_form.jsp" method="post" name="insertform">
		<input type="submit" name="action" value="Insert Employee Records" class="btn btn-primary" id="insertbtn" />
	</form>
	<tr>
		<th style="text-align:center;font-size:20px;">Employee ID:</th>
		<th style="text-align:center;font-size:20px;">Employee First Name:</th>
		<th style="text-align:center;font-size:20px;">Employee Last Name:</th>
		<th style="text-align:center;font-size:20px;">Employee Age:</th>
		<th style="text-align:center;font-size:20px;">Employee Email ID:</th>
		<th style="text-align:center;font-size:20px;">Employee Salary:</th>
		<th style="text-align:center;font-size:20px;">Employee Contact Number:</th>
		<th style="text-align:center;font-size:20px;">EDIT OPERATION:</th>
		<th style="text-align:center;font-size:20px;">DELETE OPERATION:</th>
	</tr>
	<% for(employee_details e : list)
		{
	%>
		<tr>
			<td style="text-align:center;font-size:20px;"><%= e.getEid() %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getFname()  %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getLname()  %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getAge()  %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getEmail()  %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getSalary()  %></td>
			<td style="text-align:center;font-size:20px;"><%= e.getContact_no()  %></td>
			<td>
				<form action="servlet1" name="editform" method="post">
					<input type="hidden" name="eid" value="<%= e.getEid() %>" />
					<input type="submit" name="action" value="EDIT" class="btn btn-warning" id="editbtn" />
				</form>
			</td>
			<td>
				<form action="servlet1" name="deleteform" method="post">
					<input type="hidden" name="eid" value="<%= e.getEid() %>" />
					<input type="submit" name="action" value="DELETE" class="btn btn-danger" id="deletebtn" />
				</form>
			</td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>