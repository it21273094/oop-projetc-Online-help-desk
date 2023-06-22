<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> company profile</title>
<link rel="stylesheet" type="text/css" href="./css/cusUpdate.css">


</head>
<body style="background: url(img/bac2.jpg); background-repeat: no-repeat; background-size: cover;">
   <jsp:include page="nav.jsp"/>
    <br>
	         <c:forEach var="com" items= "${comDetails}">
	         
    <c:set var="comID" value="${com.comID}"/>
	<c:set var="name" value="${com.name}"/>
	<c:set var="website" value="${com.website}"/>
	<c:set var="email" value="${com.email}"/>
	<c:set var="address" value="${com.address}"/>
	<c:set var="phone" value="${com.phone}"/>
	<c:set var="industry" value="${com.industry}"/>
	<c:set var="username" value="${com.username}"/>
	<c:set var="password" value="${com.password}"/>
	
	         
	<center> <h1>  Company profile</h1></center>
    <img class="icon1" src="./img/icon1.png" width="300px" height="300px" align="right">
    <img class="icon8" src="./img/icon8.png" width="500px" height="600px">

		<div class="text-box">
	        <h3>
	          CompanyID: ${com.comID}  <br><br>
				Name: ${com.name} <br><br>
				website: ${com.website} <br><br>
				Contact No:  ${com.phone} <br><br>
				Email:  ${com.email} <br><br>
				Address:  ${com.address} <br><br>
				industry: ${com.industry} <br><br>
                username: ${com.username} <br><br>
                password:  ${com.password} <br><br>
	        
	        
	        </h3>
	        
       </c:forEach>
	
       
		<c:url value="companyUpdate.jsp" var="comupdate">
		<c:param name="id" value="${comID}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="website" value="${website}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="industry" value="${industry}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${comupdate}"> 
	<input type="button" class="btn"  name="update" value="Update Profile">
	</a>
	
	<br>
	<c:url value="companyDelete.jsp" var="comdelete">
		<c:param name="id" value="${comID}" />
		<c:param name="name" value="${name}" />
		<c:param name="website" value="${website}"/>
		<c:param name="email" value="${email}" />
		<c:param name="address" value="${address}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="industry" value="${industry}"/>
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
	<a href="${comdelete}">
	<input type="button" class="btn" name="delete" value="Delete Profile">
	</a>

	</div>
  
       
   
</body>
</html>