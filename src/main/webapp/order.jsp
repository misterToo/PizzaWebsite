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
    <title>Title</title>
</head>
<body>
    <form method="post" action="/placeOrder">
        <fieldset>
            <legend>Order for Pickup?:</legend>
        <input type="radio" id="pickupyes" name="pickup" value="yes">
        <label for="pickupyes">Yes:</label><br>
        <input type="radio" id="pickupno" name="pickup" value="no">
        <label for="pickupno">No:</label><br>
        </fieldset>
        <label for="address">Address:</label>
        <input type="text" name="address" id="address">
        <fieldset>
            <legend>Toppings</legend>
        </fieldset>
        <fieldset>
            <legend>Size</legend>
            <input type="radio" id="sizesmall" name="size" value="small">
            <label for="sizesmall">Small</label><br>
            <input type="radio" id="sizemedium" name="size" value="medium">
            <label for="sizemedium">Medium</label><br>
            <input type="radio" id="sizelarge" name="size" value="large">
            <label for="sizelarge">Large</label><br>
        </fieldset>
        <input type="submit">
    </form>
</body>
</html>
