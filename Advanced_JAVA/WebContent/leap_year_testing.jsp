<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leap Year Testing</title>
</head>
<body>
	<center>
		<h1>Leap-Year Testing</h1>
		<table>
			<form action="leap_year_testing.jsp" method="post">
				<tr>
					<th>Enter The Any Year You Want =></th>
					<td><input type="text" name="year" /></td>
				</tr>
				<tr>
					<th><input type="submit" name="test" value="This Year Is Leap Year OR Not?" /></th>
				</tr>
			</form>
		</table>
	</center>
	<br/><br/>
	<c:catch>
		<% 
			String test = request.getParameter("test");
			int year = Integer.parseInt(request.getParameter("year"));
			if(test.equalsIgnoreCase("This Year Is Leap Year OR Not?"))
			{
		%>
			<c:choose>
				<c:when test="<%= year % 4 == 0 %>">
					<center><c:out value="This Year Is Leap Year !"></c:out></center>
				</c:when>
				<c:when test="<%= year % 4 != 0 %>">
					<center><c:out value="This Year Is Not Leap Year !"></c:out></center>
				</c:when>
				<c:otherwise>
					<center><c:out value="Invalid Input !"></c:out></center>
				</c:otherwise>
			</c:choose>
	<%
		} 
	%>
	</c:catch>
<center><h1>If You're Perform Another Task Than Go back To This Site =><a href="All_Small_Applications.jsp">All Small Applications</a></h1></center>
</body>
</html>