<%--
  Created by IntelliJ IDEA.
  User: Oscar
  Date: 11/29/2021
  Time: 10:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<jsp:include page="header.jsp" />.
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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
