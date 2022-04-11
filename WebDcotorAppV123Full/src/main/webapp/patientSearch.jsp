<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
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
			<ul class="nav navbar-nav navbar-right">
				<li><a href="javascript:history.back()"><span> GO
							BACK TO PROFILE</span></a></li>

			</ul>
			
		</div>
	</nav>
	 <h1 class=" text-center">Here are you patients</h1>
	
	<c:if test="${docPatients!='[]'}">
	<table>
	
	
	
	<c:forEach var="Patients" items="${docPatients}">
	  
	
      <!--patient card -->
	
	<div class="card" style="width: 45rem;border: 2px solid blue;padding: 15px;border-radius:5px;">
	  <div class="card-body">
	    <h3 class="card-title text-center"><c:out value="${Patients.pat_fn}"/> <c:out value="${Patients.pat_ln}"/></h3>
	    <p >Phone : <c:out value="${Patients.pat_email}"/></p>
	    <p>Symptoms : <c:out value="${Patients.pat_sympt}"/></p>
	    <p>test : <c:out value="${Patients.pat_tests}"/></p>
	    <p>Result : <c:out value="${Patients.pat_results}"/></p>
	    <p>Diseases : <c:out value="${Patients.pat_dis}"/></p>
	    <br/>
	  
	   </div>
	  </div>
 
	  
	   
	</c:forEach>
	</table>
	</c:if>
	
	
		<c:if test="${docPatients=='[]'}">
		  <h3 class="card-title text-center">You don't have any patient , please create from your profile</h3>
		</c:if>

</body>
</html>