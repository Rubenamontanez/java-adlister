<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%! int counter = 0; %>--%>
<%--<% counter += 1; %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<%--%>

<%--    if (request.getParameter("message") != null)--%>

<%--    counter = Integer.parseInt( request.getParameter("reset"));--%>
<%--%>--%>




<%--<c:choose>--%>
<%--<c:when test="${cart.isEmpty()}">--%>
<%--    <h2>No items in your cart (yet).</h2>--%>
<%--</c:when>--%>

<%--<c:otherwise>--%>
<%--<c:forEach var="item" items="${cart.items}">--%>
<%--<div class="item">--%>
<%--    <h3>${item.name}</h3>--%>
<%--    <p>${item.description}</p>--%>
<%--    <p>${item.price}</p>--%>
<%--    <c:if test="${item.isOnSale}">--%>
<%--    <p>This item is on sale!</p>--%>
<%--    </c:if>--%>
<%--    </item>--%>
<%--    </c:forEach>--%>
<%--    </c:otherwise>--%>

<%--    </c:choose>--%>


<%--&lt;%&ndash;<% if (request.getParameter("reset") != null)&ndash;%&gt;--%>
<%--&lt;%&ndash;    counter = Integer.parseInt( request.getParameter("reset"));&ndash;%&gt;--%>
<%--&lt;%&ndash;%>&ndash;%&gt;--%>

<%--    <jsp:include page="partials/navbar.jsp">--%>
<%--        <h1>The current count is <%= counter %>.</h1>--%>



<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>
<h1>Your Shopping Cart</h1>

<c:choose>

<c:when test="${cart.isEmpty()}">
    <h2>No items in your cart (yet).</h2>
</c:when>

<c:otherwise>
<c:forEach var="item" items="${cart.items}">
<div class="item">
    <h3>${item.name}</h3>
    <p>${item.description}</p>
    <p>${item.price}</p>
    <c:if test="${item.isOnSale}">
    <p>This item is on sale!</p>
    </c:if>
    </item>
    </c:forEach>
    </c:otherwise>

    </c:choose>
</div>
</body>
</html>