<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 5/26/2021
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/calculator" method="post">
  <label>Product Description</label><br/>
  <input type="text" name="product-description" placeholder="Product Description"/><br/>
  <label>List Price</label><br/>
  <input type="text" name="list-price" placeholder="USD"/><br/>
  <label>Discount Percent</label><br/>
  <input type="text" name="discount-percent" placeholder="0.00"/><br/>
  <input type = "submit" id = "submit" value = "Caculator"/>
</form>
</body>
</html>
