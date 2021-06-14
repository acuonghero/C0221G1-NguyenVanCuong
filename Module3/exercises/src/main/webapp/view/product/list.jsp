<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List</title>

    <link rel="stylesheet" href="../../bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootstrap/dataTables.bootstrap.min.css">
    <style>
        table {
            border-radius: 7px;
        }

        .radius {
            border-radius: 3px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center ">Product list</h1>
    <a class="btn btn-primary btn-sm mb-2" href="/product?action=create">Create new product</a>
    <form action="/product?action=search" method="post">
        <h4>Search by name</h4>
        <input type="text" class="radius col-sm-4 col-md-4" name="findName">
        <button class="radius btn-primary">Search</button>
    </form>
    <table class="table list-group-item-info" id="tableEmployee">
        <thead>
        <tr>
            <th scope="col">No</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Color</th>
            <th scope="col">Describtion</th>
            <th scope="col">Category</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>${product.color}</td>
                <td>${product.describtion}</td>

                <c:forEach var="category" items="${category}">
                    <c:if test="${category.id == product.category}">
                        <td>${category.name}</td>
                    </c:if>
                </c:forEach>
                <td>
                    <a href="/product?action=edit&id=${product.id}" class="btn btn-primary btn-sm">Edit</a>
                    <button type="button" onclick="sendData('${product.id}','${product.name}')"
                            class="btn btn-danger btn-sm" data-toggle="modal" data-target="#delete">
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
            <form action="/product?action=delete" method="post">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Bạn có muốn xóa sản phẩm : <span id="employeeName"></span>
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
        document.getElementById("employeeId").value = id;
        document.getElementById("employeeName").innerText = name;
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
