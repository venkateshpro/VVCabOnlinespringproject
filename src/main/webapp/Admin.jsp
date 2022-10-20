<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/d1c2ea8b80.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="Registation.css">
</head>
<style>
    .ad-home-heading {
        color: rgb(234, 168, 0);
        font-size: 60px;
        font-family: "Roboto" ;
        margin-left: 4rem;
        margin-top: 10px;

    }
   

.menu{
    padding: 40px;
    align-items: center;
    height: 65vh;
    margin-top: 30px;
}
.btnn{
    height: 50px;
    width: 10rem;
    margin-bottom: 20px;

}
.para{
    color: aliceblue;
}
.span-1{
    
}
</style>
<body>
 <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a class="navbar-brand"><span class="ml-4 mt-4"style='font-size:25px; '>&#128525;</span>Venkatesh</a>
        <a href="Login.jsp"><button class="btn btn-warning m-2">Logout</button></a>
        
    </nav>
    <h1 class="ad-home-heading ">Welcome <span class="span-1">Venkatesh </span></h1>
    <div class=" menu d-flex flex-column">
        <a href="/newcab"><button  class=" btnn btn btn-warning ">Add Cabs </button></a>
        <a href="/newuser"><button class="btnn btn btn-warning ">Add Customer</button></a>
        <a href="/listofdriver"><button class="btnn btn btn-warning "> listof cabs</button></a>
        <a href="/listcus"><button class="btnn btn btn-warning ">listof customers</button></a>
        <a href="/bookinglist"><button class="btnn btn btn-warning "> bookings</button></a>
   </div>
   <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
    <p class="para"> </p>
</nav>

</body>
</html>