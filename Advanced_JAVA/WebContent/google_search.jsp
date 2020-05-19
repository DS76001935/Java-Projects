<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Engine Tool</title>
</head>
<body>
	<center><h1>Search Engine Tool</h1></center>
	<center><p>(You Have To Search Any Keywords in This TextBox...)</p></center><br><br><br>
	<form action="servlet3" method="get">
		<center><h1><label for="searchKey">Google</label></h1>
		<input type="text" name="searchKey" id="searchKey" />
		<input type="submit" value="Search" name="search" id="search" /></center>
	</form>
</body>
</html>