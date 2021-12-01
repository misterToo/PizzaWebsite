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
    <title>Account Details</title>
</head>
<body>
    <h1>Account Details</h1>
    <ul>
        <li>User Name: ${userName}</li>
        <li>Email: ${email} </li>
        <li>address: ${address}</li>
        <li>Points to next reward : ${rewards}</li>
    </ul>
    <a href="deleteAccount">Delete Account</a>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
