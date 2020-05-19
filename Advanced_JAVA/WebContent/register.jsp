<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="zxx">
<!-- Head -->

<head>
    <title>Customer Registration Form</title>
    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="Border Register Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Meta-Tags -->
    <!-- Index-Page-CSS -->
    <link rel="stylesheet" href="customer_registration_form/css/style.css" type="text/css" media="all">
    <!-- //Custom-Stylesheet-Links -->
    <!--fonts -->
    <!-- //fonts -->
    <link rel="stylesheet" href="customer_registration_form/css/font-awesome.css" type="text/css" media="all">
    <!-- //Font-Awesome-File-Links -->
	
	<!-- Google fonts -->
	<link href="//fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese" rel="stylesheet">

	<!-- Google fonts -->

</head>
<!-- //Head -->
<!-- Body -->

<body>
    <h1 class="title-agile text-center">Registration Form</h1>
    <div class="content-w3ls">
        <div class="content-bottom">
			<h2>Register Here <i class="fa fa-hand-o-down" aria-hidden="true"></i></h2>
            <form action="servlet2" method="post">
                <div class="field-group">
                    <span class="fa fa-user" aria-hidden="true"></span>
                    <div class="wthree-field">
                        <input name="fname" id="fname" type="text" value="" placeholder="First Name" autocomplete="off" required>
                    </div>
                </div>
                <div class="field-group">
                    <span class="fa fa-user" aria-hidden="true"></span>
                    <div class="wthree-field">
                        <input name="lname" id="lname" type="text" value="" placeholder="Last Name" autocomplete="off" required>
                    </div>
                </div>
                <div class="field-group">
                    <span class="fa fa-phone" aria-hidden="true"></span>
                    <div class="wthree-field">
                        <input name="mno" id="mno" type="text" value="" placeholder="Contact Number" autocomplete="off" required>
                    </div>
                </div>
                <div class="field-group">
                    <span class="fa fa-envelope" aria-hidden="true"></span>
                    <div class="wthree-field">
                        <input name="email" id="email" type="email" value="" placeholder="Email ID" autocomplete="off" required>
                    </div>
                </div>
                <div class="field-group">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <div class="wthree-field">
                        <input name="password" id="password" type="password" placeholder="Password" autocomplete="off">
                    </div>
                </div>
                <div class="wthree-field">
                    <input id="signup" name="action" type="submit" value="Register" />
                </div>
				<div class="account">
					<p class="text-center">Already have an account ? <a href="customer_login.jsp">Login</a></p>
				</div>
            </form>
        </div>
    </div>
</body>
</html>
