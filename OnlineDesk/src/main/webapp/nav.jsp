<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>navigation bar</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="./css/nav.css">


</head>

<body>
<!-- navigation bar -->
	<div class="navbar">
		<img src="./img/logo.webp" alt="logo" class="logo">
                  
		<a href="home.jsp">Home</a>
		<a href="subcription.jsp">Subscriptions</a>
		<a href="about.jsp">About Us</a>
		<a href="contactus_page.jsp">Contact Us</a>
                      
                        <div class="dropdown">
			<button class="dropbtn">Profiles <i class="fa fa-caret-down"></i></button>
			<div class="dropdown-content">
				<a href="customerAccount.jsp">customer profile</a>
				<a href="companyAccount.jsp">company profile</a>
			
			</div>
		</div>
                         <!--Search Bar-->
                         <form class="search" method="get" action="#">

                         <input type="text" placeholder="Search..." name="keyword">
                          <button><i class="gg-search"></i></button>

                         </form>


                          
		<!-- Logout dropdown -->
		<div class="dropdown3">
			<button class="dropbtn">Logout<i class="fa fa-caret-down"></i></button>
			<div class="dropdown3-content">

						<a href="customerInsert.jsp">As Customer</a>
						<a href="companyInsert.jsp">As Company</a>
						
			</div>	
		</div>

		<!-- Login dropdown -->
		<div class="dropdown2">
				<button class="dropbtn">Login<i class="fa fa-caret-down"></i></button>
				<div class="dropdown2-content">

					<a href="login.jsp">As Customer</a>
					<a href="logincom.jsp">As Company</a>
		
				</div>
		</div>

	</div>
</body>
</html>