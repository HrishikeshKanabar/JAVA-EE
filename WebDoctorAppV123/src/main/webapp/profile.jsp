<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom CSS -->
     <link rel="stylesheet" href="index.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>Web Doctor</title>
  </head>
  <body>
  
  <!-- Nav Bar --><!-- Ctrl+shift+f to auto format --><!-- Reference : https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_navbar_right&stacked=h -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="index.html">Web Doctor</a>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.html"><span class="glyphicon glyphicon-user"></span>
						Logout</a></li>
				
			</ul>
			
		</div>
	</nav>
	
	<!--profile card -->
	
	<div class="card" style="width: 45rem;margin:auto;margin-right:auto;margin-botton:auto;margin-top:100px;width:25%;border: 2px solid blue;padding: 15px;border-radius:5px;">
	  <div class="card-body">
	    <h3 class="card-title text-center">DR. ${firstName} &nbsp;&nbsp; ${lastName}</h3>
	    <h3 class="card-subtitle mb-2 text-center">${email}</h3>
	    <br/>
	   <div class= "text-center">
	   <a class="btn btn-primary" href="#" role="button">Create Patients</a>
	   <a class="btn btn-success" href="#" role="button">Search Patients</a>
	   </div>
	  </div>
   </div>

<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </body>
</html>