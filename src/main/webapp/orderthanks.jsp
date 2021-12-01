<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/30/2021
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Dave's Pizza - Thanks for ordering !</title>
    <link href="stylesheets/orderstyles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<header>
    <img src="images/pizza-160780_1280.png" width="30px">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">

        <a class="navbar-brand" href="#">Mike's Pizza</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="order.jsp">Order</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="displayCustomer">Display Customers (temp)</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ViewAccount">Account</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-outline-success my-2 my-sm-0" href="logIn">Sign Up/Log In</a>
                </li>
            </ul>
        </div>
    </nav>

</header>
<body>
    Thanks for ordering!
    Your order was approximately ${calories} Calories!
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
