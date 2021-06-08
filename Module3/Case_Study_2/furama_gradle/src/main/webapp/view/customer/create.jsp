<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/2/2021
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create</title>
    <style>
        small{
            color: red;
        }
    </style>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <!-- FORM  -->
        <div class="col-lg-12">

            <form class="form-horizontal" id="form-edit-client" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center>
                        <legend>Create customer</legend>
                    </center>

                    <!-- Text input-->

<%--                    <div class="form-group">--%>
<%--                        <label> Customer Type : </label>--%>
<%--                        <select class="form-control" name="customer-type-id">--%>
<%--                            <c:forEach var="type" items="${customerTypeList}">--%>
<%--                                <option value="${type.customerTypeId}">${type.customerTypeName}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>
<%--                    </div>--%>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Type id</label>
                        <div class="col-md-4">
                            <select name="customer-type-id">
                                <c:forEach items="${customerType}" var="type">
                                    <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Name</label>
                        <div class="col-md-4">
                            <input id="client-name6" name="client-name" type="text" placeholder="your client's name"
                                   class="form-control input-md">
                            <small>${err1}</small>
                            <span class="help-block">Full name of your customer</span>
                        </div>
                    </div>

                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-email">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="client-email" name="client-email" class="form-control"
                                       placeholder="yourname@yourdomain.com" type="text">
                            </div>
                            <small>${err3}</small>
                            <p class="help-block">Email of your client</p>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Day of birth</label>
                        <div class="col-md-4">
                            <input id="client-name1" name="client-day-of-birth" type="date"
                                   class="form-control input-md">
                            <small>${err2}</small>
                            <span class="help-block">Full birthday of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4">
                            <select name="client-gender">
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="other">Other</option>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Identity card</label>
                        <div class="col-md-4">
                            <input id="client-name2" name="client-identity-card" type="text"
                                   placeholder="your client's identity card" class="form-control input-md">
                            <small>${err4}</small>
                            <span class="help-block">Full identity card</span>
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Phone number</label>
                        <div class="col-md-4">
                            <input id="client-name3" name="client-phone-number" type="text"
                                   placeholder="your client's phone number" class="form-control input-md">
                            <small>${err5}</small>
                            <span class="help-block">Number only</span>
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input id="client-name4" name="client-address" type="text"
                                   placeholder="your client's address" class="form-control input-md">
                            <small>${err6}</small>
                            <span class="help-block">Input province only</span>
                        </div>
                    </div>
                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="btn-save"></label>
                        <div class="col-md-4">
                            <button id="btn-save" name="btn-save" class="btn btn-success">Create</button>

                        </div>
                    </div>
                </fieldset>
            </form>
            <form action="/customer" class="form-horizontal">
                <div class="form-group">
                    <label class="col-md-4 control-label" for="btn-save"></label>
                    <div class=" col-md-4">
                        <button class="btn btn-sm btn-primary">Back to list</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</body>
</html>