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
               <button type="button" class="btn btn-primary" onclick="sendDataToModal('${customer.getCustomerId()}','${customer.getCustomerName()}')" data-toggle="modal" data-target="#exampleModalLong">
                    Delete
                </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="modal" id="myModal">
        <div class="modal-dialog">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Modal Heading</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                    Modal body..
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    function sendDataToModal(id, name) {
        document.getElementById("idStudent").value=id;
        document.getElementById("nameStudent").innerText=name
    }
</script>
<script src="../../bootstrap/bootstrap.min.js"></script>
<script src="../../bootstrap/jquery-3.6.0.min.js"></script>
</body>
</html>
