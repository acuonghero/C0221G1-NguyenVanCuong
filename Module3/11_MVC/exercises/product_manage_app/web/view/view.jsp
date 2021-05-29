<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Id: </td>
        <td>${products.getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${products.getProductName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${products.getStatus()}</td>
    </tr>
    <tr>
        <td>Describe: </td>
        <td>${products.getPrice()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${products.getModel()}</td>
    </tr>
</table>
</body>
</html>