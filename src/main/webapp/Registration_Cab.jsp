<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/d1c2ea8b80.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="Registation.css">

</head>
<body>

<nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
    </nav>   
     <div class="employee-container ">
        <div class="details-card">
            <div class="card_cab  ">
                <form action="adddriverandcab" method="post">
                    <div class="container">

                        <label for="cabNo"><b>Cab No</b></label>
                        <input type="text" placeholder="Enter Cab No" name="cab_no" id="cabNo" required>

                        <label for="cabtype"><b>Cab Type</b></label>
                        <input type="text" placeholder="Enter Cab type" name="cab_type" id="cabtype" required>

                       

                        <label for="dName"><b>Driver Name</b></label>
                        <input type="text" placeholder="Enter Driver Name" name="driver_name" id="dName" required>

                        <label for="dMobile"><b>Driver phone num</b></label>
                        <input type="text" placeholder="Enter Driver mobile no" name="driver_phonenum" id="dMobile" required>
                        
                        
                        <label for="email"><b>Driver Email</b></label>
                        <input type="email" placeholder="Enter Driver email" name="email" id="email" required>
                        
                        <label for="pass"><b>Driver passsword</b></label>
                        <input type="text" placeholder="Enter Driver password" name="psw" id="pass" required>

                        <button type="submit" class="registerbtn">Register</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>