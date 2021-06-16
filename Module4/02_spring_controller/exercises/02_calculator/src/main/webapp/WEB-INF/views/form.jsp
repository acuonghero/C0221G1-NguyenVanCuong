<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calculator">
    <h3>Calculator</h3>
    <input type="text" name="num1">
    <input type="text" name="num2">
    <br>
    <br>
    <button name="operator" value="+">Addition(+)</button>
    <button name="operator" value="-">Subtraction(-)</button>
    <button name="operator" value="*">multiplication(x)</button>
    <button name="operator" value="/">Division(/)</button>
</form>
<c:if test="${result!=null}">
<h3>Result : ${result}</h3>
</c:if>
</body>
</html>
