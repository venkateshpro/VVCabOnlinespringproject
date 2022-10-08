<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="CabbookingHome.css">
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #ff8000;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a href="Admin.jsp"><button class="btn btn-warning m-2">Back</button></a>
    </nav>
<h1>List of Users  </h1>

<table id="customers">
  <tr>
    <th>User Id</th>
    <th>User Emial</th>
    <th>User Psw</th>
    <th>User PhoneNum</th>
    <th>User Name</th>
  </tr>
  <tbody>
	  <c:forEach items="${listUsers}" var="u">
	         <tr>
	                        <td>${u.user_Id}</td>
	                        <td>${u.user_email}</td>
	                        <td>${u.user_psw}</td>
	                        <td>${u.user_phone}</td>
	                        <td>${u.user_name}</td>
	                        
	                    </tr>
	  </c:forEach>
  </tbody>
</table>

</body>
</html>