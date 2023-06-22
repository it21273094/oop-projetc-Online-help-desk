<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<link rel="stylesheet" type="text/css" href="./css/login.css">
</head>

<body>
<div class="div-log">
		<form method="POST" action="loginservlet">
			<h1>Customer Login</h1>
			<input type="hidden" name="cuslogin" value="true">
			<div >
				<!-- <label>UserName</label> -->
				<div>
					<input type="text"  name="username" placeholder="Username" required>
				</div>
			</div>
			
			<div>
				<!-- <label >Password</label> -->
				<div >
					<input type="password"  name="password" placeholder="Password" required>
				</div>
			</div>
			
			<div>
				<center>
				<button type="submit">
					Login
				</button>
				<p>Not Registered? <a href="customerInsert.jsp">Register</a></p>
				</center>
			</div>
		</form>
	</div>
</body>
</html>