<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- Username,Password,cpassword,Firstname,Lastname,Country,State,City,Hobby,Gender,birthdate --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 2</title>
</head>
<body>
	<h1>Question 2 of Module 5 :-</h1>
	<table>
		<form action="module5_que2_servlet2" method="post">
			<tr>
				<th><lebal for="fname">First Name :</lebal></th>
				<td><input type="text" name="fname" id="fname"/></td>
			</tr>
			<tr>
				<th><lebal for="lname">Last Name :</lebal></th>
				<td><input type="text" name="lname" id="lname"/></td>
			</tr>
			<tr>
				<th><lebal for="city">City :</lebal></th>
				<td><input type="text" name="city" id="city"/></td>
			</tr>
			<tr>
				<th><lebal for="state">State :</lebal></th>
				<td><input type="text" name="state" id="state"/></td>
			</tr>
			<tr>
				<th><lebal for="country">Country :</lebal></th>
				<td><input type="text" name="country" id="country"/></td>
			</tr>
			<tr>
				<th><lebal for="gender">Gender :</lebal></th>
				<td>
					<select name="gender" id="gender">
						<option>Select Your Any Gender:</option>
						<option>Male</option>
						<option>Female</option>
					</select>
				</td>
			</tr>
			<tr>
				<th><lebal for="hobby">Hobby :</lebal></th>
				<td>
					<select name="hobby" id="hobby">
						<option>Select Your Any Hobby:</option>
						<option>Photography</option>
						<option>Dancing</option>
						<option>Singing</option>
						<option>Travelling</option>
						<option>Reading</option>
						<option>Writing</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>Select Your Whole Birth Date :</th>
				<td>
					<select name="byear">
						<option>Select Birth Year</option>
						<%
							int i;
							for(i=1990;i<=2018;i++){
						%>
							<option><% out.print(i);  %></option>
						<% } %>
					</select>
					<select name="bmonth">
						<option>Select Birth Month</option>
						<%
							int j;
							for(j=1;j<=12;j++){
						%>
							<option><% out.print(j);  %></option>
						<% } %>
					</select>
					<select name="bdate">
						<option>Select Birth Date</option>
						<%
							int k;
							for(k=1;k<=31;k++){
						%>
							<option><% out.print(k);  %></option>
						<% } %>
					</select>
				</td>
			</tr>'<tr>
				<th><lebal for="uname">User Name :</lebal></th>
				<td><input type="text" name="uname" id="uname"/></td>
			</tr>
			<tr>
				<th><lebal for="password">Password :</lebal></th>
				<td><input type="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<th><lebal for="cpassword">Confirm Password :</lebal></th>
				<td><input type="password" name="cpassword" id="cpassword"/></td>
			</tr>
			<tr>
				<th colpan="2"><input type="submit" name="submit" id="submit" value="Submit" /></th>
				<th colpan="2"><input type="reset" name="reset" id="reset" value="Clear" /></th>
			</tr>
		</form>
	</table>
</body>
</html>