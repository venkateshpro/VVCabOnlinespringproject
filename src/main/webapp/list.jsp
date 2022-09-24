<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table id="customers">
  <tr>
    <th>User Id</th>
    <th>User Emial</th>
    <th>User Psw</th>
    <th>User PhoneNum</th>
    <th>User Name</th>
  </tr>
    <c:forEach items="${​​​​​​​l}​​​​​​​" var="item">
    <tr>
      <td><c:out value="${​​​​​​​item}​​​​​​​" /></td>
    </tr>
  </c:forEach>
  
  
    
  
</table>
</body>
</html>