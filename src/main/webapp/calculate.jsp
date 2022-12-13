<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>B6315 Calculation</title>
</head>
<body>
	<h1 style="color:blue">Addition of 2 numbers</h1>
	<form action="add" method="get">
		Enter First Number:<br> <input type="text" name="a1"><br>
		Enter Second Number:<br> <input type="text" name="a2"><br>
		<input type="submit" value="ADD">
	</form>
	<h1 >Subtraction of 2 numbers</h1>
	<form action="sub" method="get">
		Enter First Number:<br> <input type="text" name="s1"><br>
		Enter Second Number:<br> <input type="text" name="s2"><br>
		<input type="submit" value="SUBTRACT">
	</form>
	<h1 >Muliplication of 2 numbers</h1>
	<form action="mul" method="get">
		Enter First Number:<br> <input type="text" name="m1"><br>
		Enter Second Number:<br> <input type="text" name="m2"><br>
		<input type="submit" value="MULTIPLY">
	</form>
	<h1 >Division of 2 numbers</h1>
	<form action="div" method="get">
		Enter First Number:<br> <input type="text" name="d1"><br>
		Enter Second Number:<br> <input type="text" name="d2"><br>
		<input type="submit" value="DIVIDE">
	</form>
</body>
</html>