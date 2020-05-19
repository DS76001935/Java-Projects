<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OTP GENERATE OPERATION</title>
</head>
<body>
	<center>
		<h1>OTP GENERATE OPERATION</h1>
		<table>
			<form action="generate_OTP_number" method="post">
				<tr>
					<th>Full Name :</th>
					<td><input type="text" name="fullname" /></td>
				</tr>
				<tr>
					<th>Age :</th>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<th><input type="submit" name="generate" value="Generate" /></th>
				</tr>
				<tr>
					<th>Enter OTP Number :</th>
					<td><input type="text" name="otp" /></td>
				</tr>
				<tr>
					<th><input type="submit" name="verify" value="Verify" formaction="generate_OTP_number" /></th>
				</tr>
			</form>
		</table>
	</center>
<center><h1>If You're Perform Another Task Than Go back To This Site =><a href="All_Small_Applications.jsp">All Small Applications</a></h1></center>
</body>
</html>