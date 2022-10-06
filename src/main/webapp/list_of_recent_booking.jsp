<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<h1>recent booking </h1>

<table id="customers">
  <tr>
    <th>Booking Id</th>
    <th>pickup_location</th>
    <th>pickup_location</th>
    <th>price</th>
    <th>req_id</th>
    <th>customer id</th>
    <th>Driver id</th>
    
  </tr>
  
  <tbody>
		<c:forEach items="${recentbooking}" var="r">
			<tr>
				<td>${r.b_Id}</td>
				<td>${r.pickup_location}</td>
				<td>${r.drop_location}</td>
				<td>${r.price}</td>
				<td>${r.req_id}</td>
				<td>${r.customer.user_Id}</td>
				<td>${r.driver.d_Id}</td>

				

		</c:forEach>
		</tbody>

</body>
</html>