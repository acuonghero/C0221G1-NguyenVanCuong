
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>Customer list</h1>
    <table>
        <tr>
            <th>No</th>
            <th>Name</th>
            <th>Day of birth</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
            <c:forEach items="${customerList}" var="customer" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${customer.name}</td>
                    <td>${customer.dayOfBirth}</td>
                    <td>${customer.address}</td>
                    <td><img src="${customer.image}" width="50" alt=""></td>
                </tr>
            </c:forEach>
    </table>
</div>
</body>
</html>
