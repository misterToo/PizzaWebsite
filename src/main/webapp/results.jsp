
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${title}</h2>
<table class="table table-bordered">
  <tr><th>First Name</th><th>Last Name</th></tr>
  <c:forEach items="${customers}" var="customer">
    <tr>

      <td>${customer.fName}</td>
      <td>${user.lName}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
