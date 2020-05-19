<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.controller.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.msg
	{
		font-size="50px";
		color:red;
	}
	#frm1{
		width:450px;
		margin:0 auto;
	}
	body
	{
		font-family: 'vardana';
		font-size: 20px;
		font-weight: bold;
	}
	#main-wrapper{
		width:700px;
		margin: 0 auto;
		background:white;
		padding:10px;
		border-radius:10px;
		border: 2px solid #95a5a6;
	}
	input
	{
		width:1000px;
	}
</style>
</head>
<body style="background-color:#bdc3c7">
	<div id="main-wrapper">
		<center><h1>Student Registration Form</h1></center><br/>
			<form action="Student_Controller" method="post" id="frm1">
				<div class="form-group">
					<label for="fname">*First Name :</label><br/>
						<span class="msg"><%
							String msg1 = (String)request.getAttribute("msg1");
							if(msg1 != null)
							{
								out.println(msg1);
							}
						%>
						</span>
					<input type="text" class="form-control" id="fname" name="fname" autocomplete="off" value="<%String fname = request.getParameter("fname");if(fname != null){out.print(fname);} %>" />
			</div>
				<div class="form-group">
					<label for="lname">*Last Name :</label><br/>
						<span class="msg"><%
							String msg2 = (String)request.getAttribute("msg2");
							if(msg2 != null)
							{
								out.println(msg2);
							}
						 %></span>
						<input type="text" class="form-control" id="lname" name="lname" autocomplete="off" value="<%String lname = request.getParameter("lname");if(lname != null){out.print(lname);} %>" />
				</div>
				<div class="form-group">
					<label for="age">*Age :</label><br/>
						<span class="msg"><%
							String msg3 = (String)request.getAttribute("msg3");
							if(msg3 != null)
							{
								out.println(msg3);
							}
						 %></span>
						<input type="text" class="form-control" id="age" name="age" autocomplete="off" value="<%String age = request.getParameter("age");if(age != null){out.print(age);} %>" />
				</div>
				<div class="form-group">
					<label for="mno">*Contact Number:</label><br/>
						<span class="msg"><%
							String msg4 = (String)request.getAttribute("msg4");
							String msg9 = (String)request.getAttribute("msg9");
							if(msg4 != null)
							{
								out.println(msg4);
							}
							else if(msg9 != null)
							{
								out.println(msg9);
							}
						 %></span>
						<input type="text" class="form-control" id="mno" name="mno" autocomplete="off" value="<%String mno = request.getParameter("mno");if(mno != null){out.print(mno);} %>" />
				</div>
				<div class="form-group">
					<label for="stream">*Stream :</label><br/>
						<span class="msg"><%
							String msg5 = (String)request.getAttribute("msg5");
							if(msg5 != null)
							{
								out.println(msg5);
							}
						 %></span>
						<input type="text" class="form-control" id="stream" name="stream" autocomplete="off" value="<%String stream = request.getParameter("stream");if(stream != null){out.print(stream);} %>" />
				</div>
				<div class="form-group">
					<label for="email">*Email ID</label><br/>
						<span class="msg"><%
							String msg6 = (String)request.getAttribute("msg6");
							if(msg6 != null)
							{
								out.println(msg6);
							}
						 %></span>
						<input type="text" class="form-control" id="email" name="email" autocomplete="off"  value="<%String email = request.getParameter("email");if(email != null){out.print(email);} %>" />
				</div>
				<div class="form-group">
					<label for="password">*Password :</label><br/>
						<span class="msg"><%
							String msg7 = (String)request.getAttribute("msg7");
							String msg10 = (String)request.getAttribute("msg10");
							if(msg7 != null)
							{
								out.println(msg7);
							}
							else if(msg10 != null)
							{
								out.println(msg10);
							}
						 %></span>
						<input type="password" class="form-control" id="password" name="password" autocomplete="off"  value="<%String password = request.getParameter("password");if(password != null){out.print(password);} %>" />
				</div>
				<div class="form-group">
					<label for="cpassword">*Confirm Password :</label><br/>
						<span class="msg"><%
							String msg8 = (String)request.getAttribute("msg8");
							String msg11 = (String)request.getAttribute("msg11");
							if(msg8 != null)
							{
								out.println(msg8);
							}
							else if(msg11 != null)
							{
								out.println(msg11);
							}
						 %></span>
						<input type="password" class="form-control" id="cpassword" name="cpassword" autocomplete="off"  value="<%String cpassword = request.getParameter("cpassword");if(cpassword != null){out.print(cpassword);} %>" />	
				</div>
				<div class="form-group">
					<input type="submit" style="text-align: center;font-size:20px; position:relative;left:120px; width:200px;" class="btn btn-success" id="save" name="save" Value="Save" />
				</div>	
			</form>
		</div>	
</body>
</html>