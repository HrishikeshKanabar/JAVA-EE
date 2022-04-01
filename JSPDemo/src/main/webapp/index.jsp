<!-- page directive  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- import -->
<%@ page import="java.io.*"  %>
<%@ page import="java.lang.*"  %>
<!-- Session -->
<%@ page session="true" %>
<!-- isError -->
<%@ page isErrorPage="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FIRST JSP PAGE</title>
</head>
<body>
<!-- When you use %! need to use semi-colon(;) -->
<!-- To declare or intializing variable -->
<%!String name = "MCIT"; %>
<%!int age=27; %>
<!-- To print/Display with JSP tag  -->
<%= "Name is : "+name %><br/>
<%= "AGE is : "+age %><br/>
<!-- method/function of Java inside HTML -->
<%!
   int sum(int a, int b ,int c){
	return a+b+c;
  }
%>
<%= "Summation is :"+sum(10,20,20) %><br/>
<!-- Use of equal for direct calculation -->
<%= 20*10/2 %><br/>
<!-- More example of "JSP tags" -->
<% 
   int a = 10;
   int b = 20;
   int c = 10;
%>
<%= a+b+c %><br/>
<!-- Store session in JSP -->

<%application.setAttribute("MyName","MCIT"); %><br/>
<a href="display.jsp">CLICK HERE TO CALL DISPLAY JSP PAGE</a>
</body>
</html>