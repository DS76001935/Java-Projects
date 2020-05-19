<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.controller.*" %>
<%@ page import="com.dao.*" %>
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
    <!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%

	Cookie cookie[] = request.getCookies();
	//int size1 = ck1.length;
	//int size2 = ck2.length;
	//int i,j;
	//for(i=0;i<=size1;i++)
	//{
		//System.out.println(ck1[i].getValue());
	//}
	//for(j=0;j<=size2;j++)
	//{
		//System.out.println(ck2[j].getValue());
	//}
	String emailid = cookie[0].getValue();
	String password = cookie[1].getValue();

%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Login Form</title>
<!-- meta_tags-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="connective login form a Flat Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta_tag_Keywords -->
<link href="cust_login/css/style.css" rel="stylesheet" type="text/css" media="all"><!--style_sheet-->
<link href="cust_login/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all"><!--font_awesome_icons-->
<!--web_fonts-->
<link href="cust_login//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900&amp;subset=latin-ext" rel="stylesheet">
<!--//web_fonts-->
</head>
<body>
<%
	
%>
<div class="form">
<h1>Customer Login Form</h1>
	<div class="form-content">
		<form action="servlet2" method="post">
			<div class="form-info">
				<h2>Login</h2>
			</div>
			<div class="email-w3l">
				<span class="i1"><i class="fa fa-envelope-o" aria-hidden="true"></i></span>
				<input class="email" type="email" name="email" placeholder="Email" autocomplete="off" required="">
			</div>
			<div class="pass-w3l">
			<!---728x90--->
			<span class="i2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				<input class="pass" type="password" name="password"  placeholder="Password" autocomplete="off" required="">
			</div>
			<div class="form-check">
				<div class="left">
					<input type="checkbox" name="remember" value="remember">Remember me
				</div>
				<div class="right">
					<a href="#">Forgot Password?</a>
				</div>
				<div class="clear"></div>
			</div>
			<div class="submit-agileits">
				<input class="login" name="action" type="submit" value="login">
			</div>
		</form>
	</div>
</div>
</body>
</html>