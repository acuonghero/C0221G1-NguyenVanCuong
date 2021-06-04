<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/2/2021
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>
    <link rel="stylesheet" href="../../bootstrap/bootstrap.min.css">

    <style>
        table{
            border-radius: 7px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center ">Customer list</h1>
    <a class="btn btn-primary btn-sm mb-2" href="/customer?action=create">Create new customer</a>
    <table class="table list-group-item-info ">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Customer name</th>
            <th scope="col">Customer type</th>
            <th scope="col">Phone number</th>
            <th scope="col">Address</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.getCustomerId()}</td>
                <td>${customer.getCustomerName()}</td>
                <td>${customer.getCustomerTypeId()}</td>
                <td>${customer.getCustomerPhoneNumber()}</td>
                <td>${customer.getCustomerAddress()}</td>
                <td>
                    <a href="/customer?action=edit&id=${customer.getCustomerId()}" class="btn btn-primary btn-sm">Edit</a>
                    <button type="button" onclick="sendData('${customer.customerId}','${customer.customerName}')" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#delete">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%--modal--%>
<div class="modal fade" id="delete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/customer" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                   Bạn có muốn xóa khách hàng có tên : <span id="customerName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Ok</button>
                    <input type="hidden" id="customerId" name="idDelete">
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    function sendData(id, name) {
        document.getElementById("customerId").value=id;
        document.getElementById("customerName").innerText=name;
    }
</script>
<script src="../../bootstrap/jquery-3.6.0.min.js"></script>
<script src="../../bootstrap/popper.min.js"></script>
<script src="../../bootstrap/bootstrap.min.js"></script>
</body>
</html>
