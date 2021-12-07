<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <img src="images/pizza-160780_1280.png">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">

        <a class="navbar-brand" href="#">Dave's Pizza</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only"></span></a>
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
                        <li class="nav-item">
                            <a class="btn btn-outline-danger my-2 my-sm-0" href="logOut">Log out</a>
                        </li>
                    </c:otherwise>
                </c:choose>


            </ul>

        </div>
    </nav>

</header>
