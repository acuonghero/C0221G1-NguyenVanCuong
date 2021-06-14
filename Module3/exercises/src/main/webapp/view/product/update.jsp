<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <!-- FORM  -->
        <div class="col-lg-12">

            <form class="form-horizontal bg-info" style="border-radius: 7px" id="form-edit-client"
                  action="/product?action=create" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center>
                        <legend>Create Product</legend>
                    </center>
                    <h3>${msg}</h3>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Name</label>
                        <div class="col-md-4">
                            <input id="client-name" name="name" type="text" class="form-control input-md" value="${product.name}">
                        </div>
                        <small style="color: red">${name}</small>
                    </div>


                    <!--Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Price</label>
                        <div class="col-md-4">
                            <input name="price" type="text" class="form-control input-md" value="${product.price}">
                        </div>
                        <small style="color: red">${birthday}</small>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Color</label>
                        <div class="col-md-4">
                            <input name="color" type="text" class="form-control input-md" value="${product.color}">
                        </div>
                        <small style="color: red">${phone}</small>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Quantity</label>
                        <div class="col-md-4">
                            <input name="quantity" type="text" class="form-control input-md" value="${product.quantity}">
                        </div>
                        <small style="color: red">${addresss}</small>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Describtion</label>
                        <div class="col-md-4">
                            <input name="describtion" type="text" class="form-control input-md" value="${product.describtion}">
                        </div>
                        <small style="color: red">${addresss}</small>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Category</label>
                        <div class="col-md-4">
                            <select name="category" class="form-control">
                                <c:forEach items="${category}" var="category">
                                    <option value="${category.id}">${category.name}</option>
                                </c:forEach>
                            </select>
                            <%--                            <input name="address" type="text" class="form-control input-md" value="${product.category}">--%>
                        </div>
                        <small style="color: red">${addresss}</small>
                    </div>


                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button id="btn-save" name="btn-save" class="btn btn-success ">Create</button>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <a href="/student" class="btn btn-primary">Back to list</a>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>