<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/15/2021
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Details</title>
</head>
<body>
<form action="updateAccount" method="post">
    <label for="fname">First Name</label>
    <input type ="text" name="fname" id="fname">
    <label for="lname">Last Name</label>
    <input type="text" name="lname" id="lname">
    <label for="email">Email</label>
    <input type="text" name="email" id="email">
    <label for="address">Address</label>
    <input type="text" name="address" id="address">
    <input type="submit">
</form>
    <a href="deleteAccount">Delete Account</a>
</body>
</html>
