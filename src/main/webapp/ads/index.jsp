<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language= "java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
    <title>View Ads</title>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<h1>Here are all the Ads:</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>Description: $ ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
