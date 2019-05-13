<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION </title>
	
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script type="text/javascript" src="Validations.js"></script>
	
</head>
<body style="background-color: skyblue">
	<h1 align="center">Registration Form</h1>
	<form action="LoginRegistration" method="post" id="registrationForm" name="registrationForm">
		<table width="250px" height="300px" align="center">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" required></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password1" id="password1" required><input type="checkbox" onclick="myFunction()">Show Password</td>
			</tr>
			<tr>
				<td>Re- Type Password</td>
				<td><input type="password" name="password2" id="password2" required></td>
			</tr>
			<tr>
				<td><input type="submit" id="btnSubmit" name="Registration" value="Registration"></td>
				<td><a href="login.jsp">Back to Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>