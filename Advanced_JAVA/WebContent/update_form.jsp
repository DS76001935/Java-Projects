<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<title>Updation Operation</title>
</head>
<body>
	<% employee_details e = (employee_details)request.getAttribute("Myemp"); %>
	<br/><br/><h1 class="text-primary  text-uppercase text-center" id="h1_1">AJAX SERVER SIDE OPERATION <u>(UPDATION)</u></h1><br/><br/>
		<table class="table table-bordered table-striped text-center">
			<form action="servlet1" method="post">
				
				<input type="hidden" name="eid" value="<%= e.getEid()  %>" />
				
				<tr>
					<th><label for="fname">First Name:</label></th>
					<td><input type="text" class="form-control" name="fname" id="fname" autocomplete="off" value="<%= e.getFname() %>" /></td>
				</tr>
				<tr>
					<th><label for="lname">Last Name:</label></th>
					<td><input type="text" class="form-control" name="lname" id="lname" autocomplete="off" value="<%= e.getLname() %>" /></td>
				</tr>
				<tr>
					<th><label for="age">Age:</label></th>
					<td><input type="text" class="form-control" name="age" id="age" autocomplete="off" value="<%= e.getAge() %>" /></td>
				</tr>
				<tr>
					<th><label for="email">Email ID:</label></th>
					<td><input type="text" class="form-control" name="email" id="email" autocomplete="off" value="<%= e.getEmail() %>" /></td>
				</tr>
				<tr>
					<th><label for="salary">Salary:</label></th>
					<td><input type="text" class="form-control" name="salary" id="salary" autocomplete="off" value="<%= e.getSalary() %>" /></td>
				</tr>
				<tr>
					<th><label for="mno">Contact Number:</label></th>
					<td><input type="text" class="form-control" name="mno" id="mno" autocomplete="off" value="<%= e.getContact_no() %>" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="action" id="submit" class="btn btn-success" value="Update" style="position:relative;font-size:30px;right:50px;" />
					<input type="reset" name="clear" id="clear" value="Clear"  class="btn btn-danger" style="position:relative;font-size:30px;left:50px;" /><br/><br/>
					<input type="submit" name="action" value="Go Back To View Employee's Records..." formaction="view.jsp" class="btn btn-primary" id="viewbtn"  style="position:relative;font-size:30px;left:1px;width:600px;" /></td>
				</tr>
			</form>
		</table>
</body>
</html>