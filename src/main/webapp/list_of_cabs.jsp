<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<html>
<head>
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
<h1>Availble Cabs </h1>

<table id="customers">
  <tr>
    <th>Driver Id</th>
    <th>Driver emal</th>
    <th>Driver password</th>
    <th>Driver Name</th>
    <th>Cab No</th>
    <th>Cab Type</th>
    <th>Driver Phone</th>
    <th>Driver Name</th>
    
    
  </tr>
   <tbody>
	  <c:forEach items="${listCab}" var="c">
	         <tr>
	           <td>${c.d_Id}</td>
	           <td>${c.email}</td>
	           <td>${c.psw}</td>
	           <td>${c.driver_name}</td>
	           <td>${c.cab_no}</td>
	           <td>${c.cab_type}</td>
	           <td>${c.driver_phonenum}</td>	                      	                        <td>${c.cab_no}</td>
	                          
	          </tr>
	  </c:forEach>
  </tbody>
  
</table>

</body>
</html>