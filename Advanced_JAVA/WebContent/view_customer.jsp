<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.bean.*" %>
    <%@ page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<customer_details> list = customerDao.getAllCustomer(); %>
<br/>
<h1>All Customer's Details :-</h1>
<table border="1">
	<tr>
		<th>CUSTOMER ID:</th>
		<th>CUSTOMER FIRST NAME:</th>
		<th>CUSTOMER LAST NAME:</th>
		<th>CUSTOMER CONTACT NUMBER:</th>
		<th>CUSTOMER EMAIL ID:</th>
		<th>CUSTOMER PASSWORD:</th>
		<th>EDIT OPERATION:</th>
		<th>DELETE OPERATION:</th>
	</tr>
	<% for(customer_details cust : list) { %>
	<tr>
		<td><%= cust.getId() %></td>
		<td><%= cust.getFname() %></td>
		<td><%= cust.getLname() %></td>
		<td><%= cust.getMno() %></td>
		<td><%= cust.getEmail() %></td>
		<td><%= cust.getPassword() %></td>
		<td>
			<form action="servlet2" method="post">
				<input type="submit" id="edit" name="action" value="EDIT" style="width:100%;height:30%;" />
				<input type="hidden" id="custid" name="custid" value="<%= cust.getId() %>" />
			</form>
		</td>
		<td>
			<form action="servlet2" method="post">
				<input type="submit" id="delete" name="action" value="DELETE" style="width:100%;height:30%;" />
				<input type="hidden" id="custid" name="custid" value="<%= cust.getId() %>" />
			</form>
		</td>
	</tr>
	<% } %>
</table>

</body>
</html>