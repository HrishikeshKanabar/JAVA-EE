<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<!--FETCH WIH HELP OF EXPRESSION LANAGUAGE   -->
<h1>FETCH WIH HELP OF EXPRESSION LANAGUAGE </h1>
<p>Student name is: ${param.stdName}</p>
<p>Student number is: ${param.num}</p>

<!-- VALUES COMING FROM SESSION -->
<h1> VALUES COMING FROM SESSION</h1>
<p>Author name is : ${applicationScope.Author}</p>
<p>Name is : ${applicationScope.Name}</p>

<!--FETCH WIH HELP OF DECLARATION  -->
<h1>FETCH WIH HELP OF DECLARATION  </h1>
<% 
String stdName = request.getParameter("stdName");
String number =request.getParameter("num");
%>
<%="Student name is " + stdName%><br/><br/>
<%="Number is " + number%><br/><br/>
</body>
</html>