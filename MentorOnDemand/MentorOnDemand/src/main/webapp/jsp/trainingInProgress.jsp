<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Trainings</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./css/trainingInProgress.css">
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
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Learner <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="./userDetails.html">Your Profile</a></li>
								<li><a href="#">Page 1-2</a></li>
								<li><a href="#">Page 1-3</a></li>
							</ul></li>
						<li><a href="trainingSearchOnLogin.html">Search Trainings</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Trainings <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li class="active"><a href="./trainingInProgress.html">Ongoing Trainings</a></li>
								<li><a href="./trainingHistory.html">Training History</a></li>
								
							</ul></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span>
								Sign Up</a></li> -->
						<li><a href="#" data-toggle="modal"
							data-target=".bd-example-modal-lg"><span
								class="glyphicon glyphicon-bell"></span></a></li>
						<li><a href="./userLogin.html"><span class="glyphicon glyphicon-log-in"></span>
								Logout</a></li>

					</ul>
					<div class="modal fade bd-example-modal-lg" tabindex="-1"
						role="dialog" aria-labelledby="myLargeModalLabel"
						aria-hidden="true">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="card">
									<div class="card card-signin my-5">
										<div class="card-body">
											<div class="table-responsive-sm">
												<table class="table table-striped">

													<tr>

														<th>Mentor Name</th>

														<th>Technology</th>

														<th>Timing</th>

														<th>Status</th>

														

													</tr>
													<tr>
														<td>Asis</td>

														<td>Java</td>

														<td>Mon-Friday 7Am-2PM</td>

														<td>Approved</td>

													</tr>
													<tr>
														<td>Senthil</td>

														<td>Spring</td>

														<td>Mon-Friday 11PM-6PM</td>

														<td>Pending</td>

														
													</tr>
													<tr>
														<td>Arvind</td>

														<td>Angular</td>

														<td>Tues-Sat 7AM-2PM</td>

														<td>Pending</td>

													
													</tr>
												</table>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</nav>
	</div>
	<div class="container">
		<div class="col-sm-1"></div>
		<div class="row">
			<div class="col-sm-10">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center" style="">List Of Current
							Trainings</h5>
						<hr>
						<div class="table-responsive-sm">
							<table class="table table-striped">

								<tr>
									<th>Sl No.</th>
									<th>Course Id</th>
									<th>Course Name</th>
									<th>Rating</th>
									<th>Completion Percentage</th>
								</tr>
								<tr>
									<td>1</td>

									<td>abcd</td>

									<td>Java</td>

									<td>4.6</td>
									<td>49</td>

								</tr>
								<tr>
									<td>2</td>

									<td>xyz</td>

									<td>Angular</td>

									<td>7</td>

									<td>40</td>

								</tr>

							</table>

						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	<div class="col-sm-1"></div>

</body>
</html>