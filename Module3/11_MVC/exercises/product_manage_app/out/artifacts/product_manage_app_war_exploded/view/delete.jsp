<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
<%--    <h3>Are you sure?</h3>--%>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Product Name:</td>
                <td>${product.productName}</td>
            </tr>
            <tr>
                <td>Status:</td>
                <td>${product.status}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${product.price}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
