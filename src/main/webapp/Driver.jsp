<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Driver Home Page</title>
<meta charset="ISO-8859-1">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/d1c2ea8b80.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
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
</style>

<body>
    <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a class="navbar-brand"><span class="ml-4 mt-4"style='font-size:25px; '>&#128525;</span>${name}</a>
    </nav>
    <h1 class="ad-home-heading ">Welcome To <span class="span-1">Manager Service</span></h1>
    <div class=" menu d-flex flex-column">
        <!-- <button class=" btnn btn btn-warning ">requsts by user </button> -->
        <!-- Button trigger modal -->
<!--  button type="button" class="btn btn-warning" data-bs-toggle="modal" onclick">
    Requests by user
  </button>-->
 <a href="/listrequest"><button class="btn btn-warning">Cab Request By User</button></a>
  
  <!-- Modal -->
 
        <!-- <button class="btnn btn btn-warning "></button>
        <button class="btnn btn btn-warning "> listof cabs</button>
        <button class="btnn btn btn-warning ">listof customers</button>
        <button class="btnn btn btn-warning "> bookings</button> -->
   </div>
   <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
    <p class="para">..................cwemciewhviknevewn vken kw </p>
</nav>

</body>
</html>