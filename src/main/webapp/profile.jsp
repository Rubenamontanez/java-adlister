<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Admin profile page</title>
</head>
<%--<link rel="stylesheet" type="text/css" href="/adlisterStylesheet.css"/>--%>
<body>
<jsp:include page="partials/navbar.jsp" />

<h1>Welcome Admin</h1>
<p>Username: , ${username} </p>



<%--<h1 action="Registration">Welcome Admin!</h1>--%>
<%--<table style="with: 50%">--%>
<%--    <tr><td>--%>
<%--        <% String username = request.getParameter("username"); %>--%>
<%--        <a>Welcome   <% out.println(username); %> User!!!! You have logged in.</a></td></tr>--%>
<%--    <tr></tr><tr><td></td><td></td><td><a href="register_3.jsp"><b>Logout</b></a></td></tr>--%>
<%--</table>--%>
</body>
</html>