<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of reports</title>
</head>
<body>
    <form:form modelAttribute="form" action="report" method="post" enctype="application/x-www-form-urlencoded">
        <H1>List of reports</H1>
        <table border="1">
            <caption>caption for List of reports</caption>
            <tr><td>id</td><td>report name</td><td>process</td></tr>
            <tr><td>1</td><td>name1</td><td>process 1</td></tr>
            <tr><td>2</td><td>name2</td><td>process 2</td></tr>
            <tr><td>3</td><td>name3</td><td>process 3</td></tr>
        </table>
    </form:form>
</body>
</html>
