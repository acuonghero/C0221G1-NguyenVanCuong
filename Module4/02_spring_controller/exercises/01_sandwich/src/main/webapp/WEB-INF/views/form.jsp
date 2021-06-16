<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/16/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<form action="/save">
    <input type="checkbox" name="condiment" value="Lettuce"><span>Lettuce</span>
    <input type="checkbox" name="condiment" value="Tomato"><span>Tomato</span>
    <input type="checkbox" name="condiment" value="Mustard"><span>Mustard</span>
    <input type="checkbox" name="condiment" value="Sprouts"><span>Sprouts</span>
    <input type="submit" value="Save">
</form>
<c:if test="${condiment!=null}">

<h3>Result : <c:forEach items="${condiment}" var="con">${con}<br></c:forEach></h3>
</c:if>
</body>
</html>
