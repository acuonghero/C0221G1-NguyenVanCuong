<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/2/2021
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>
    <link rel="stylesheet" href="../../../bootstrap_4/bootstrap.min.css">
    <style>
        table{
            border-radius: 7px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center ">Customer list</h1>
    <a class="btn btn-primary btn-sm mb-2" href="">Create new customer</a>
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
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td>
                <button class="btn btn-info btn-sm">Edit</button>
                <button class="btn btn-danger btn-sm">Delete</button>
            </td>
        </tr>
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

<script src="../../../bootstrap_4/bootstrap.min.js"></script>
<script src="../../../bootstrap_4/jquery-3.6.0.min.js"></script>
</body>
</html>
