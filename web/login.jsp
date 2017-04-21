<%-- 
    Document   : login
    Created on : 19 Jan, 2016, 1:18:05 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    
	<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>CardiacCountermeasure:- SignIn</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
<!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    

	<link rel="stylesheet" href="css/animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="css/style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
    <form name="authentication" class="submitphoto_form" method="post" action="LogServ">
    <div class="container">
		<div class="top2">
			<h1 id="title" class="hidden"><span id="logo">Cardiac <span>CounterMeasure</span></span></h1>
		</div>
    </div>
	<div class="container">
            <div class="top1"></div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<label  for="username">Username</label>
			<br/>
                        <input required name="username" type="text" id="username">
			<br/>
			<label for="password">Password</label>
			<br/>
                        <input required name="password" type="password" id="password">
			<br/>
			<button type="submit">Sign In</button>
			<br/>
                        <a href="#"><p class="small">Forgot your password?</p></a>
                        <label for="new user">new user?</label><a href="http://localhost:8084/CardiacCountermeasure/patient_reg.jsp"> <button type="button">SignUp </button></a>
                          </div>
        </div>
                
    </form>
    <div class="container">
            <div class="top1"></div>
		<div class="login-box2 animated fadeInUp">
			
		
                </div>
    </div>
</body>

<script>
	$(document).ready(function () {
    	$('#logo').addClass('animated fadeInDown');
    	$("input:text:visible:first").focus();
	});
	$('#username').focus(function() {
		$('label[for="username"]').addClass('selected');
	});
	$('#username').blur(function() {
		$('label[for="username"]').removeClass('selected');
	});
	$('#password').focus(function() {
		$('label[for="password"]').addClass('selected');
	});
	$('#password').blur(function() {
		$('label[for="password"]').removeClass('selected');
	});
</script>

</html>