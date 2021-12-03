<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/15/2021
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Dave's Pizza - Order</title>
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
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="displayCustomer">Display Customers (temp)</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="order.jsp">Order</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ViewAccount">Account</a>
                </li>
            </ul>
        </div>
    </nav>

</header>
<body>
    <form method="post" action="placeOrder">
        <fieldset>
            <legend>Order for Pickup?:</legend>
            <div class="form-check">
                <label for="pickupyes">Yes:</label>
                <input type="radio" id="pickupyes" name="pickup" value="1"><br>
            </div>
            <div class="form-check">
                <label for="pickupno">No:</label>
                <input type="radio" id="pickupno" name="pickup" value="0"><br>
            </div>
        </fieldset>
        <label for="address">Address:</label>
        <input type="text" name="address" id="address">
        <fieldset>
            <legend>Toppings</legend>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="pepperoni" name="toppings" id="pepperoni">
                <label class="form-check-label" for="pepperoni">
                    Pepperoni
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="Sausage" name="toppings" id="sausage">
                <label class="form-check-label" for="sausage">
                    Sausage
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="olives" name="toppings" id="olives">
                <label class="form-check-label" for="olives">
                    Olives
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="onions" name="toppings" id="onions">
                <label class="form-check-label" for="onions">
                    Onions
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="mushrooms" name="toppings" id="mushrooms">
                <label class="form-check-label" for="mushrooms">
                    Mushrooms
                </label>
            </div>
        </fieldset>
        <fieldset>
            <legend>Size</legend>
            <div class="form-check">
                <input type="radio" id="sizesmall" name="size" value="small">
                <label for="sizesmall">Small</label><br>
            </div>
            <div class="form-check">
                <input type="radio" id="sizemedium" name="size" value="medium">
                <label for="sizemedium">Medium</label><br>
            </div>
            <div class="form-check">
                <input type="radio" id="sizelarge" name="size" value="large">
                <label for="sizelarge">Large</label><br>
            </div>
        </fieldset>
        <input type="submit">
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>
