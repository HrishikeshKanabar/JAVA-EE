<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calci</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1>CALCULATOR</h1>
<form  action = "display">
<!--<form  action = "index">-->


	ENTER THE FIRST NUMBER:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "text" name="number1"><br/><br/>
	 
	ENTER THE SECOND NUMBER: <input type = "text" name="number2"><br/><br/>
	
	
	
	SELECT THE OPERATION:<br><br>
	<input type ="radio" name = "op" value = "add">ADD<br>
	<input type = "radio" name = "op" value = "sub">SUB<br>
	<input type = "radio" name = "op" value = "mul">MUL<br>
	<input type = "radio" name = "op" value = "div">DIV<br><br>
	<input type = "submit"  class="button" value = "submit">
</form>	

<!-- <h2> Answer is :</h2> ${results} -->
</body>
</html>