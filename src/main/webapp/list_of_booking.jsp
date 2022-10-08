<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</head>
<body>
<nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a href="Admin.jsp"><button class="btn btn-warning m-2">Back</button></a>
    </nav>
<h1>recent booking </h1>

<table id="customers">
  <tr>
    <th>Booking Id</th>
    <th>pickup_location</th>
    <th>pickup_location</th>
    <th>price</th>
    <th>customer name</th>
    <th>Driver id</th>
    <th>request Id</th>
    
  </tr>
  
  <tbody>
		<c:forEach items="${booking}" var="r">
			<tr>
				<td>${r.b_Id}</td>
				<td>${r.pickup_location}</td>
				<td>${r.drop_location}</td>
				<td>${r.price}</td>
				<td>${r.customer.user_name}</td>
				<td>${r.driver.d_Id}</td>
				<td>${r.r_Id}</td>

				

		</c:forEach>
		</tbody>
		
</table>


</body>
</html>