<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/login.css">

</head>
<body>
	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">WebSiteName</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar" style="">
					<ul class="nav navbar-nav">
						<li><a href="#">About Us</a></li>
						<li><a href="#">Contact Us</a></li>
					</ul>


				</div>
			</div>
		</nav>
	</div>
	<div class="container">
		<div class="col-sm-2"></div>
		<div class="row">
			<div class="col-sm-8">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Register As Mentor
						<form:form class="form-signin" action="/registerMentor" method="POST" modelAttribute="mentor" >
							<div class="form-label-group"></div>
							
							<form:input type="text" placeholder="Email Id"
								class="form-control input-lg" id="email" path="userName" required="required" /> <br />
								
							<div class="form-label-group"></div>
							
							<form:input type="text" placeholder="linkedin_url" id="linked" required="required" class="form-control input-lg" path="linkedinUrl"  /><br/>
							
							<div class="form-label-group"></div>
							<form:input type="password" placeholder="Password" class="form-control input-lg" id="password" path="password" required="required" /> <br />
							
							<form:input type="text" placeholder="contact" id="contact" required="required" class="form-control input-lg" path="contact"  />
							<br/>
							
							
								
								
								
							<div style="text-align: center;">
								  <input class="btn btn-lg btn-primary btn-block btn-signin text-uppercase" type="submit"/>
							
								
							</div>
						</form:form>

					</div>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>