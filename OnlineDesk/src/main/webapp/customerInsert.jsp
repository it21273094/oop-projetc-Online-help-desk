<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer Insert page</title>
<link rel="stylesheet" type="text/css" href="./css/cusInsert.css">
</head>
<body>

<div class="div-r">
		<center><h1>Create a New Customer Account</h1></center>
<p class="text2" id="a">Come and join with us!Let's create your New account.Already have one?<a href="login.jsp">Login here</a></p>
		<form method="POST" action="CustomerInsert" >
			
			<div>
				<label>Full Name</label>
				<div>
					<input type="text"  name="name" required>
				</div>
			</div>
			
			<div>
				<label>Email</label>
				<div>
					<input type="email"  name="email" required>
				</div>
			</div>
			
			

			<div>
				<label>Address</label>
				<div>
					<input type="text"  name="address" required>
				</div>
			</div>

            <div>
				<label>Contact number</label>
				<div>
					<input type="tel"  name="phone" required>
				</div>
			</div>
			                 
                                    

            <div>
				<label>UserName</label>
				<div>
					<input type="username" name="uid" required>
				</div>
			</div>
			

			<div>
				<label>Password</label>
				<div>
					<input type="password"  name="psw" required>
				</div>
			</div>
			
			<div>
				<center>
					<button type="submit"  name="submit" >
						Register
					</button>
				</center>
			</div>
		</form>
	</div>

</body>
</html>