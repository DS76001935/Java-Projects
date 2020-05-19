<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<title>Insertion Operation</title>
</head>
<body>
	<br/><br/><h1 class="text-primary  text-uppercase text-center" id="h1_1">AJAX SERVER SIDE OPERATION <u>(INSERTION)</u></h1><br/><br/>
		<table class="table table-bordered table-striped text-center">
			<form action="servlet1" method="post">
				<tr>
					<th><label for="fname">First Name:</label></th>
					<td><input type="text" class="form-control" name="fname" id="fname" autocomplete="off" /></td>
				</tr>
				<tr>
					<th><label for="lname">Last Name:</label></th>
					<td><input type="text" class="form-control" name="lname" id="lname" autocomplete="off" /></td>
				</tr>
				<tr>
					<th><label for="age">Age:</label></th>
					<td><input type="text" class="form-control" name="age" id="age" autocomplete="off" /></td>
				</tr>
				<tr>
					<th><label for="email">Email ID:</label></th>
					<td><input type="text" class="form-control" name="email" id="email" autocomplete="off" /></td>
				</tr>
				<tr>
					<th><label for="salary">Salary:</label></th>
					<td><input type="text" class="form-control" name="salary" id="salary" autocomplete="off" /></td>
				</tr>
				<tr>
					<th><label for="mno">Contact Number:</label></th>
					<td><input type="text" class="form-control" name="mno" id="mno" autocomplete="off" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="action" id="submit"  class="btn btn-success btn-center" value="Insert" style="position:relative;font-size:30px; right:50px; width:200px;"  />
					<input type="reset" name="clear" id="clear" value="Clear" class="btn btn-danger btn-center" style="position:relative;font-size:30px;left:50px; width:200px;" /><br/><br/>
					<input type="submit" name="action" value="Go Back To View Employee's Records..." formaction="view.jsp" class="btn btn-primary" id="viewbtn"  style="position:relative;font-size:30px;left:1px;width:600px;" /></td>
				</tr>
			</form>
		</table>
		<br/>
</body>
</html>