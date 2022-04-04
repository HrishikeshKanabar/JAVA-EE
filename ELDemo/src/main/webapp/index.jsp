<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<form action="display.jsp" method="get">
Student Name : <input type="text" name="stdName"><br/><br/>
Student Num : <input type="text" name="num"><br/><br/>

<%application.setAttribute("Author","MCIT");%>
<%application.setAttribute("Name","JSP"); %>
<input type="submit" value="Submit Details !!">
</form>
</body>
</html>