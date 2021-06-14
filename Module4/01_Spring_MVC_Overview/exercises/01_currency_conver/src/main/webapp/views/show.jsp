<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/14/2021
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <h3>Input USD</h3>
        <input type="number" name="usd">
        <button type="submit">Change</button>
    </fieldset>
</form>
<c:if test="${result!=null}"><h3>Result : ${result} VND</h3></c:if>
</body>
</html>
