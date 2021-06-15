<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/15/2021
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/translate" method="post">
    <div class="container">
        <fieldset>
            <legend>Dictionary</legend>
            <h3>Input</h3>
            <input type="text" name="input">
            <button>Translate</button>
        </fieldset>
    </div>
</form>
<c:if test="${result!=null}">
    <h3>Result :  ${result}</h3>
</c:if>

</body>
</html>
