<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/15/2021
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Dave's Pizza - Order</title>
    <link href="stylesheets/orderstyles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<jsp:include page="header.jsp" />.
<body>
    <form method="post" action="placeOrder">
        <fieldset>
            <legend>Order for Pickup?:</legend>
            <div class="form-check">
                <label for="pickupyes">Yes:</label>
                <input type="radio" id="pickupyes" name="pickup" value="1" required><br>
            </div>
            <div class="form-check">
                <label for="pickupno">No:</label>
                <input type="radio" id="pickupno" name="pickup" value="0"><br>
            </div>
            <p>Delivery Fee 4.95</p>
        </fieldset>
        <label for="address">Address (Not Required for Pickup):</label>
        <select name="address" id="address">
            <c:forEach items="${sessionScope.addresses}" var="address">
                <option value="${address.address}">${address.address}</option>
            </c:forEach>
        </select>
        <fieldset>
            <legend>Toppings<br> All Toppings $2.00</legend>

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
                <input class="form-check-input" type="checkbox" value="ham" name="toppings" id="ham">
                <label class="form-check-label" for="ham">
                    Ham
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
                <input type="radio" id="sizesmall" name="size" value="small" required>
                <label for="sizesmall">Small - $7.95</label><br>
            </div>
            <div class="form-check">
                <input type="radio" id="sizemedium" name="size" value="medium">
                <label for="sizemedium">Medium - $9.95</label><br>
            </div>
            <div class="form-check">
                <input type="radio" id="sizelarge" name="size" value="large">
                <label for="sizelarge">Large - $10.95</label><br>
            </div>
        </fieldset><br>
        <c:choose>
            <c:when test="${sessionScope.rewards == 0}">

            </c:when>
            <c:otherwise>
                <p>Rewards Available: $${sessionScope.rewards}</p>
                <label for="rewardsUsed">Use Rewards:</label>
                <input type="number" min="0" max="${sessionScope.rewards}" id="rewardsUsed" name="rewardsUsed" value="0"><br>
            </c:otherwise>
        </c:choose>
        <input type="submit">
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>
