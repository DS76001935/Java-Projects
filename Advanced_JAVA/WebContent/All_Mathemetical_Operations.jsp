<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Mathemetical Operations</title>
</head>
<body>
<center><h1>Perform All Mathemetical Operations</h1>
<table>
	<form action="Mathemetical_Operations" method="post">
			<tr>
				<th>Enter Your Number 1 :</th>
				<td><input type="text" id="number1" name="number1" autocomplete="off" /></td>
			</tr>
			<tr>
				<th>Enter Your Number 2 :</th>
				<td><input type="text" id="number2" name="number2" autocomplete="off" /></td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" name="operation" value="ADD"  />
					<input type="submit" name="operation" value="MINUS" formaction="Mathemetical_Operations" />
					<input type="submit" name="operation" value="MULTIPLY" formaction="Mathemetical_Operations" />
					<input type="submit" name="operation" value="DIVIDE" formaction="Mathemetical_Operations" />
					<input type="submit" name="operation" value="MODULUS" formaction="Mathemetical_Operations" />
				</th>
			</tr>
	</form>
</table></center>
<center><h1>If You're Perform Another Task Than Go back To This Site =><a href="All_Small_Applications.jsp">All Small Applications</a></h1></center>
</body>
</html>