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
    <link rel="stylesheet" href="index.login.css">
</head>
<body>
<div>
       <nav class="navbar navbar-dark navbar-expand-lg bg-dark justify-content-between">
        <img src=" https://res.cloudinary.com/dkzionr3v/image/upload/v1643985271/v_logo_png_ezwvk6.png"  class="navbar-image "/>
        <a class="navbar-brand"><span class="ml-4 mt-4"style='font-size:25px; '>&#128525;</span>Login Page</a>
    </nav>
        <div class="main">
            <a href="Registration_user.jsp"><img src="https://cdn-icons-png.flaticon.com/512/6728/6728113.png" class="pen"/></a>
            <div class="detail-form">
                <p class="sign" align="center">Sign in</p>
                <form class="form1" action="validate" method="post">
                    <select class="select" name="role">
                        <option value="customer" class="p_select">Customer</option>
                        <option value="driver" class="p_select">Driver</option>
                        <option value="admin" class="p_select">Admin</option>
                        </select>
                    <input class="un " type="text" align="center" placeholder="Username" name="email">
                    <input class="un" type="password" align="center" placeholder="Password" name="psw">
                    <input class="button" type="submit" id="login-button" value= "Login" name="Login"  >
                </form>
                
            </div>
            <a href="#" style="text-decoration:none">
                    <p class="forget" align="right"> Forget Password -> </p>
                </a>
        </div>
    </div>

</body>
</html>