<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${"message"!= null}'>
        <span class="message">${"message"}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Products information</legend>
        <table>
            <tr>
                <td>Product name:</td>
                <td><input type="text" name="productName"></td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><input type="text" name="status"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>Model:</td>
                <td><input type="text" name="model"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>