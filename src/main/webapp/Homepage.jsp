<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="CabbookingHome.css">
    <!-- CSS only -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
    <meta charset="ISO-8859-1">
</head>
<body>
<nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a href="/recentbooking"><button class="btn btn-warning m-2">recent requests</button></a>
    </nav>
    <div class="bg-container">
        <div>
            <h1 class="vr-home-heading ml-4">Welcome To VV Booking<span class="span-1"> ${name}</span></h1>
        </div>
        <div id="card">
            <div id="card-content">
              <div id="card-title">
                <h2>Choose Destination to Go..</h2>
                <!-- <div class="underline-title"></div> -->
              </div>
              <form  action ="/requestcab" method="post" class="form">
                <label for="pickup" style="padding-top:13px">
                    &nbsp;Pickup Location
                  </label>
                <input type="hidden" name="customer" value="${id}">
                <input id="pickup" class="form-content" type="text" name="pickup_location" autocomplete="on" required />
                <div class="form-border"></div>
                <label for="drop" style="padding-top:22px">&nbsp;Drop Location
                  </label>
                <input id="drop" class="form-content" type="text" name="drop_location" required />
                <div class="form-border"></div>
                
                
                <input id="submit-btn" type="submit" name="submit" value="---Go---" />
              </form>
            </div>
    </div>
    

</body>
</html>