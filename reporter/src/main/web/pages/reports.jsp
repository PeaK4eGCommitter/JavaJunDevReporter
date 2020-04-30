<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of reports</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/w3.css">
</head>
<body class="w3-light-grey">
    <form:form modelAttribute="form" action="reports" method="post" enctype="application/x-www-form-urlencoded">
        <div class="w3-animate-top w3-container w3-blue-grey w3-opacity w3-center w3-centered">
            <H1>List of reports</H1>
        </div>
        <table border="1" width="300" align="center">
            <caption>caption for List of reports</caption>
            <tr><td>id</td><td>report name</td><td>process</td></tr>
            <tr><td>1</td><td>name1</td><td>process 1</td></tr>
            <tr><td>2</td><td>name2</td><td>process 2</td></tr>
            <tr><td>3</td><td>name3</td><td>process 3</td></tr>
        </table>
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="Button 1" ONCLICK="button1()">
        <INPUT TYPE="BUTTON" VALUE="Button 2" ONCLICK="button2()">
        <INPUT TYPE="BUTTON" VALUE="Button 3" ONCLICK="button3()">
        <table width="300" align="center">
            <tr><td><button class="w3-right w3-btn w3-blue"
                            formmethod="get"
                            formaction="index" type="submit">To main page</button></td></tr>
        </table>
    </form:form>
</body>
</html>
