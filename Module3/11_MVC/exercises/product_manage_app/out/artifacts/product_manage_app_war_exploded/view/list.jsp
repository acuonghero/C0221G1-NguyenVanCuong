<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
  <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
  <tr>
    <td>Id</td>
    <td>Product Name</td>
    <td>Status</td>
    <td>Price</td>
    <td>Model</td>
  </tr>
  <c:forEach items='${products}' var="product">
    <tr>
      <td><a href="/customers?action=view&id=${product.getId()}">${product.getId()}</a></td>
      <td>${product.getProductName()}</td>
      <td>${product.getStatus()}</td>
      <td>${product.getPrice()}</td>
      <td>${product.getModel()}</td>
      <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
      <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>