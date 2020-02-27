<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" type="text/css" href="/adlisterStylesheet.css"/>
<%--<jsp:include page="partials/head.jsp" />--%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && username.equals("admin") &&
            password != null && password.equals("password"))
        response.sendRedirect("/profile.jsp");
%>
<body>
<%--class setup and answer for the exercise --%>
<form action ="/login.jsp" method ="POST">
    <label for="username">username</label>
    <input type="text" name="username" id="username">
    <label for="password">password</label>
    <input type="password" name="password" id="password">
    <button>Log IN</button>
</form>

<%--<jsp:include page="partials/scripts.jsp" />--%>

<%-- End of classroom answer for the exercise--%>

<%--My solution to the exercise --%>
<%--<jsp:include page="partials/navbar.jsp" />--%>
<%--<form action="Registration" method="post">--%>
<%--    <table style="with: 50%">--%>
<%--        <tr>--%>
<%--            <td>UserName</td>--%>
<%--            <td><input type="text" name="username" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password</td>--%>
<%--            <td><input type="password" name="password" /></td>--%>
<%--        </tr>--%>
<%--        </table>--%>
<%--    <input type="submit" value="login" />--%>
<%--</form>--%>
<%--End of my solution to the exercise--%>
</body>
</html>
