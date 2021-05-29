<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
  <a href="/products?action=create">Create new customer</a>
</p>
<table border="1">
  <tr>
    <td>Id</td>
    <td>Product Name</td>
    <td>Status</td>
    <td>Price</td>
    <td>Model</td>
  </tr>
  <c:forEach items='${requestScope["customers"]}' var="customer">
    <tr>
      <td><a href="/customers?action=view&id=${product.getId()}">${product}</a></td>
      <td>${product.getEmail()}</td>
      <td>${customer.getAddress()}</td>
      <td><a href="/customers?action=edit&id=${product.getId()}">edit</a></td>
      <td><a href="/customers?action=delete&id=${product.getId()}">delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>