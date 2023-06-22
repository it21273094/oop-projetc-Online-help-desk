<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://css.gg/search.css' rel='stylesheet'>
<link rel="stylesheet" href="./css/home.css">


</head>
<body>
<!--Header-->
        <header>
        <img src="./img/logo.webp" alt="Logo" width="50px" height="50px">
       
        <!--Navigation Bar-->
        <nav>
        <a href="home.jsp">Home</a>    
        <a href="#">Features</a>
        <a href="#">Subscriptions</a>
        <a href="#">About Us</a>
        <a href="#">Contact Us</a>
        <a href="login.jsp">Customer SignIn</a>
        <a href="logincom.jsp">Company SignIn</a>
       
     

         <!--Search Bar-->
         <form class="search" method="get" action="#">

            <input type="text" placeholder="Search..." name="keyword">
            <button><i class="gg-search"></i></button>

        </form>
        </nav>

        </header>
        <!--Page Content-->
        <main>
        
        <h1 class="topic">Start your customer service operations with us.</h1>
        <p class="discription">We provide web based online help desk platform with better user experiance.</p>
        <img class="icon1" src="./img/icon1.png" width="300px" height="300px">
        <a class="startBtn"><span>TRY NOW</span></a>

        </main>
        
        <!--Footer-->
        <footer>
            <button class="feedback"><span>Rate Us</span></button>

            <a href="#" class="fa fa-facebook"></a>
            <a href="#" class="fa fa-twitter"></a>
            <a href="#" class="fa fa-linkedin"></a>
            <a href="#" class="fa fa-youtube"></a>
            <a href="#" class="fa fa-instagram"></a>

            <a href="#" class="quickLinks">Features</a>
            <a href="#" class="quickLinks">Subscriptions</a>
            <a href="#" class="quickLinks">About Us</a>
            <a href="#" class="quickLinks">Contact Us</a>

            <h4>&copy;<script>document.write(new Date().getFullYear());</script> Infinity Inc.</h4>
        </footer>
</body>
</html>