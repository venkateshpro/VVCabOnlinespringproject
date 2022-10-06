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