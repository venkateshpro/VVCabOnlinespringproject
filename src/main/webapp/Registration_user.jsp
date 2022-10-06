<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<body>

 <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
    </nav>  
     <div class="employee-container">

        <h1 class="form-name">   Customer Registration Form</h1>
        <div class="details-card ">
            <div class="card  ">
                <form action="/adduser" method="post">
                    <div class="container">

                        
                        
                        <label for="email"><b> Email</b></label>
                        <input type="email" placeholder="Enter Email" name="user_email" id="email" required>
                        
                         <label for="name"><b> Name</b></label>
                        <input type="text" placeholder="Enter Name" name="user_name" id="name" required>
                        
                        <label for="phone"><b>Phone Number</b></label>
                        <input type="text" placeholder="Enter Phonenum" name="user_phone" id="phone" required>

                        <label for="psw"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="user_psw" id="psw" required>       
                        <hr>


                        <button type="submit"  class="registerbtn">Register</button>
                    </div>

                </form>
            </div>
        </div>
    </div>

</body>
</html>