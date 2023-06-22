<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer profile</title>

 <link rel="stylesheet" type="text/css" href="./css/cusUpdate.css">
 

</head>
<body style="background: url(img/bac1.jpg); background-repeat: no-repeat; background-size: cover;">
   <jsp:include page="nav.jsp"/>
    <br>
      <c:forEach var="cus" items= "${cusDetails}">
	
	
	<c:set var="cusID" value="${cus.cusID}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="address" value="${cus.address}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="username" value="${cus.username}"/>
	<c:set var="password" value="${cus.password}"/>
	

	<center> <h1>  Customer profile</h1></center>
  
    <img class="icon1" src="./img/icon1.png" width="300px" height="300px" align="right">
    <img class="icon8" src="./img/icon8.png" width="500px" height="600px">
    
		<div class="text-box">
	        <h3>
                CustomerID: ${cus.cusID}  <br><br>
				Name: ${cus.name} <br><br>
				Contact No:  ${cus.phone} <br><br>
				Email:  ${cus.email} <br><br>
				Address:  ${cus.address} <br><br>
                username: ${cus.username} <br><br>
                password:  ${cus.password} <br><br>

			</h3>
     
    

	</c:forEach>
	
		<c:url value="customerUpdate.jsp" var="cusupdate">
		<c:param name="id" value="${cusID}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}"> 
	<input type="button" class="btn"  name="update" value="Update Profile">
	</a>
	
	<br>
	<c:url value="customerDelete.jsp" var="cusdelete">
		<c:param name="id" value="${cusID}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="address" value="${address}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
	<a href="${cusdelete}">
	<input type="button" class="btn" name="delete" value="Delete Profile">
	</a>

	</div>

     
</body>
</html>
