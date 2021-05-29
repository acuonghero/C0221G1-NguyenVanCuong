<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
                <td>Model:</td>
                <td>${product.model}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
            </tr>
        </table>
        <br>
        <td><a href="/products">Back to product list</a></td>
    </fieldset>
</form>
</body>
</html>
