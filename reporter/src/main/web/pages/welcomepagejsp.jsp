<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id="wp_data" type="ru.levelup.nm.web.forms.welcomepage.WelcomePageData" scope="request" />--%>
<jsp:useBean id="wp_form" type="ru.levelup.nm.web.forms.welcomepage.WelcomePageForm" scope="request" />
<%--<jsp:useBean id="wp_controller" type="ru.levelup.nm.web.forms.welcomepage.WelcomePageController" scope="request" />--%>
<html>
<head>
    <title>WelcomePage Form</title>
    <script type="text/javascript" src="/scripts/index.js"></script>
</head>
<body>
    <form:form modelAttribute="form" action="register" method="post" enctype="application/x-www-form-urlencoded">
        <label>"${wp_form.login}"</label>
        <p>
        <button onclick="${wp_form.onClick()}">throw exception</button>
        <button onclick="${wp_form.onClickTime()}">login = new Date().toString();</button>
    </form:form>
</body>
</html>
