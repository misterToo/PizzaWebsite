
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">back to home</a>
<h2>${title}</h2>
<h2>
  <c:choose>
    <c:when test="${empty userName}">
      <p>not logged in</p>
    </c:when>
    <c:otherwise>
      <p class="nav-item">Signed in as ${userName}</p>
    </c:otherwise>
  </c:choose>
</h2>
<table class="table table-bordered">
  <tr><th>First Name</th><th>Last Name</th></tr>
  <c:forEach items="${customers}" var="customer">
    <tr>

      <td>${customer.uName}</td>
      <td></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
