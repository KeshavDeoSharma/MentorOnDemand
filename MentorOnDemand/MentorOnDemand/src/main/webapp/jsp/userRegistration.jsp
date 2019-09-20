<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUpMentor</title>
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/registration.css" type="text/css">

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
						<h5 class="card-title text-center">Sign Up As User</h5>
						<hr>
						<form:form class="form-signin" action="/userreg" method="post"
							modelAttribute="user">
							<div class="form-label-group"></div>


							<form:input type="text" name="fname" id="AsID"
								class="form-control input-lg" placeholder="First Name"
								tabindex="1" path="firstName" required="required" />
							<br />


							<form:input type="text" name="lname" id="AsID"
								class="form-control input-lg" placeholder="Last Name"
								tabindex="1" path="lastName" required="required" />

							<br />
							<form:input type="text" name="Address" id="ASID"
								class="form-control input-lg" placeholder="address" tabindex="1"
								path="address"  required="required" />
<br/>
							<form:input type="text" name="ContactNumber" id="AsID"
								class="form-control input-lg" placeholder="Contact Number"
								tabindex="1" pattern="(?=.*\d).{10}" required="required" path="contactNumber" />
							<br />


							<form:input type="email" name="email" id="AsID"
								class="form-control input-lg" placeholder="email id"
								tabindex="1" path="email" required="required" />
							<br />

							<form:input type="password" name="pass" id="AsID"
								class="form-control input-lg" placeholder="Password"
								path="password" tabindex="1" required="required" />
							<br />

							<input type="confirm password" name="cpass" id="AsID"
								class="form-control input-lg" placeholder="Confirm Password"
								tabindex="1" path="cpassword" required="required" />
							<br />

						   <input class="btn btn-lg btn-primary btn-block btn-signin text-uppercase" type="submit"/>
					
					</form:form>

				</div>
				</div>
			</div>
		</div>
		<div class="col-sm-2"></div>
	</div>


</body>

</html>