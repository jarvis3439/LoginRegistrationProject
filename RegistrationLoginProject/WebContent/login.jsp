<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body style="background-color: skyblue">	
	<h1 align="center">LOGIN</h1>
	<form action="Login" method="post">
		<h3 align="center" style="color: red;"> ${message}</h3>
		<h3 align="center" style="color: green;"> ${successMessage}</h3>
		<table width="250px" height="150px" align="center" >
			
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Login"></td>
				<td><a href="registration.jsp">Registration</a></td>
			</tr>
		</table>
	</form>
</body>
</html>