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
    <link rel="stylesheet" href="../../bootstrap/dataTables.bootstrap.min.css">
    <style>
        table{
            border-radius: 7px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center ">Employee list</h1>
    <a class="btn btn-primary btn-sm mb-2" href="/employee?action=create">Create new employee</a>
    <form action="/employee?action=search" method="post">
        <h4>Search by name</h4>
        <input type="text" class="col-sm-4 col-md-4" name="findName">
        <button class="btn-primary">Search</button>
    </form>
    <table class="table list-group-item-info" id="tableEmployee">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Birthday</th>
            <th scope="col">Phone Number</th>
            <th scope="col">Address</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.employeeName}</td>
                <td>${employee.employeeBirthday}</td>
                <td>${employee.employeePhone}</td>
                <td>${employee.employeeAddress}</td>
                <td>
                    <a href="/employee?action=edit&id=${employee.employeeId}" class="btn btn-primary btn-sm">Edit</a>
                    <button type="button" onclick="sendData('${employee.employeeId}','${employee.employeeName}')" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#delete">
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
            <form action="/employee?action=delete" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                   Bạn có muốn xóa nhân viên có tên : <span id="employeeName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Ok</button>
                    <input type="hidden" id="employeeId" name="idDelete">
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    function sendData(id, name) {
        document.getElementById("employeeId").value=id;
        document.getElementById("employeeName").innerText=name;
    }
</script>
<script src="../../bootstrap/jquery-3.6.0.min.js"></script>
<script src="../../bootstrap/jquery.dataTables.min.js"></script>
<script src="../../bootstrap/dataTables.bootstrap4.min.js"></script>
<script src="../../bootstrap/popper.min.js"></script>
<script src="../../bootstrap/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5,

        });
    });
</script>
</body>
</html>
