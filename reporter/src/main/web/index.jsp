<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Wellcome page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/w3.css">
</head>
<body class="w3-light-grey">
    <div class="w3-animate-top w3-container w3-blue-grey w3-opacity w3-center w3-centered">
        <h1>Report's welcome page</h1>
    </div>

    <div class="w3-animate-bottom w3-centered w3-center">
        <c:choose>
            <c:when test="${empty sessionScope['verifiedUserName']}">
                    <h2 class="w3-blue">Please log in</h2>
                    <form method="post" action="login" enctype="application/x-www-form-urlencoded">
                        <table width="300" align="center">
                            <tr><td><label class="w3-left">Login</label></td></tr>
                            <tr><td><input class="w3-input" type="text"     name="usernameField" value="${param['login']}"></td></tr>
                            <tr><td><label class="w3-left">Password</label></td></tr>
                            <tr><td><input class="w3-input" type="password" name="passwordField"></td></tr>
                            <tr><td><button class="w3-right w3-btn w3-blue" type="submit" value="login">Login</button></td></tr>
                        </table>
                    </form>
            </c:when>
            <c:otherwise>
                    <h2 class="w3-blue">Hello, ${sessionScope['verifiedUserName']}</h2>
                    <form class="w3-container" method="post">
                        <table width="300" align="center">
                            <tr><td><label class="w3-left">there is no reason why you could not start using the service</label></td></tr>
                            <tr><td><button class="w3-right w3-btn w3-blue" type="submit" value="report">Let's start</button></td></tr>
                        </table>
                    </form>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>