<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/15/2021
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Dave's Pizza - Account Details</title>
    <link href="stylesheets/homepagestyles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<jsp:include page="header.jsp" />.
<body class="container">
<div class="col-md-12">
    <h1>Account Details</h1>
    <ul>
        <li>User Name: ${userName}</li>
        <li>Email: ${email} </li>
        <li>Rewards available : $${rewards}</li>
        <li>To Next Reward: ${toNextReward} Points</li>
    </ul>
    <h2>Addresses</h2>
    <table class="table table-bordered">
        <tr><th>Address</th></tr>
        <c:forEach items="${addresses}" var="object">
            <tr>

                <td>${object.address}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="updateaccount.jsp" class="btn btn-outline-success my-2 my-sm-0">Add Address</a>
    <h2>Recent Orders</h2>
    <table class="table table-bordered">
        <tr><th>Size</th><th>Toppings</th></tr>
        <c:forEach items="${orders}" var="order">
            <tr>

                <td>${order.size}</td>
                <td>${order.toppings}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="deleteAccount" class="btn btn-outline-danger my-2 my-sm-0">Delete Account</a>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
