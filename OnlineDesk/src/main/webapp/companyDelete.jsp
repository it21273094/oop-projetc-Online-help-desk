<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>company Delete </title>
<link rel="stylesheet" type="text/css" href="./css/cusUpdate.css">
</head>
<body style="background: url(img/bac2.jpg); background-repeat: no-repeat; background-size: cover;">
<jsp:include page="nav.jsp"/>
 <%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String website = request.getParameter("website");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String industry = request.getParameter("industry");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
	%>

	
	<form action="companyDeleteServlet" method="post">
	<br>
	  <center> <h2>  Are You Sure want to  Delete your account???</h2></center>

      <img class="icon1" src="./img/icon1.png" width="300px" height="300px" align="right">

		<div class="text-box">
			<h3>
            <div>
				<label>CompanyID</label>
				<div>
					<input type="text" name="comid"  value="<%= id %>" readonly>
				</div>
			</div>
			
			
            <div>
				<label>Name</label>
				<div>
					<input type="text" name="name" value="<%= name %>"readonly>
				</div>
			</div>
			
			 <div>
				<label>website</label>
				<div>
					<input type="text" name="website" value="<%= website %>"readonly>
				</div>
			</div>
			<div>
				<label>Email</label>
				<div>
					<input type="email"  name="email" value="<%= email %>"readonly>
				</div>
			</div>
			
			

			<div>
				<label>Address</label>
				<div>
					<input type="text" name="address" value="<%= address %>"readonly>
				</div>
			</div>

            <div>
				<label>Contact number</label>
				<div>
					<input type="tel"  name="phone" value="<%= phone %>"readonly>
				</div>
			</div>
			
			 <div>
				<label>Industry</label>
				<div>
					<input type="text" name="industry" value="<%= industry %>"readonly>
				</div>
			</div>

            <div>
				<label>UserName</label>
				<div>
					<input type="username"  name="uname" value="<%= userName %>"readonly>
				</div>
			</div>
			
			
			</h3>
             <br>
             <br>
			<!-- update profile -->
		<center><button class="btn">Delete My Account</button></center>

			
		</div>
	</form>

</body>
</html>