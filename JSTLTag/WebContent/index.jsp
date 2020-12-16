<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title> <c:out value= "Tag Example"/></title>
   </head>

   <body>
      <!-- To print -->
      <c:out value = "${'<tag> , &'}"/>
      
      <!-- Set variable and if condition -->
      
      <c:set var="income" scope="session" value="${4000*4}"/>  
      <c:if test="${income > 8000}">  
        <p>My income is: <c:out value="${income}"/><p>  
      </c:if>
      
      <!-- For each loop -->
      
      <c:forEach var="j" begin="1" end="3">  
         Item <c:out value="${j}"/><p>  
      </c:forEach>
      
      <!-- Redirect -->
      
		<c:set var="url" value="0" scope="request"/>  
		<c:if test="${url==1}">  
		<c:redirect url="http://google.com"/>  
		</c:if>  
		<c:if test="${url>1}">  
		<c:redirect url="http://facebook.com"/>  
		</c:if> 
		
	 <!-- URL -->
	 <c:url value="/RegisterDao.jsp"/>
      
   </body>
</html>