<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Dave's Pizza - Home</title>
    <link href="stylesheets/homepagestyles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<header>
    <img src="images/pizza-160780_1280.png">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">

        <a class="navbar-brand" href="#">Mike's Pizza</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

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
                    <c:choose>
                        <c:when test="${empty userName}">
                            <li class="nav-item">
                                <a class="btn btn-outline-success my-2 my-sm-0" href="logIn">Sign Up/Log In</a>
                            </li>

                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a class="nav-link" href="order.jsp">Order</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="ViewAccount">Account</a>
                            </li>
                            <li class="nav-item">
                                <p class="nav-link">Signed in as ${userName}</p>
                            </li>
                        </c:otherwise>
                    </c:choose>


            </ul>

        </div>
    </nav>

</header>
<body class="">

<img src="images/pizza-lo-scarparielloda.jpg" width=>
<img src="images/ValentinasPizzeriaAndWineBar+(1).jpg">
<img>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
