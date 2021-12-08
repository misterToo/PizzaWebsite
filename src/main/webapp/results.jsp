
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dave's Pizza - All Users</title>
  <link href="stylesheets/homepagestyles.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<jsp:include page="header.jsp" />.
<body class="container">
<div class="col-md-12">
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
<h2>${title}</h2>

<table class="table table-bordered">
  <tr><th>User Name</th><th>Email</th></tr>
  <c:forEach items="${customers}" var="customer">
    <tr>

      <td>${customer.uName}</td>
      <td>${customer.email}</td>
    </tr>
  </c:forEach>
</table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>
