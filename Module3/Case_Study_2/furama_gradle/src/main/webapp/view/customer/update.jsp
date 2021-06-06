<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/2/2021
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <style>
        .class {
            border-radius: 8px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <!-- FORM  -->
        <div class="col-lg-12 class bg-info">

            <form class="form-horizontal " method="post">
                <fieldset>

                        <!-- Form Name -->
                        <center>
                            <legend>Update customer</legend>
                        </center>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Customer id</label>
                            <div class="col-md-4">
                                <input readonly name="client-id" class="form-control input-md"
                                       value='${customer.customerId}'>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Customer type</label>
                            <div class="col-md-4">
                                <select name="client-type-id">
                                    <c:forEach var="customerType" items="${customerType}">
                                        <option value="${customerType.customerTypeId}" ${customerType.customerTypeId==customer.customerTypeId?"selected":""}>${customerType.customerTypeName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Name</label>
                            <div class="col-md-4">
                                <input id="client-name6" name="client-name" type="text" placeholder="your client's name"
                                       class="form-control input-md" value='${customer.customerName}'>
                                <span class="help-block">Full name of your customer</span>
                            </div>
                        </div>

                        <!-- Prepended text-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="client-email">Email</label>
                            <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon">@</span>
                                    <input id="client-email" name="client-email" class="form-control" type="text"
                                           value='${customer.customerEmail}'>
                                </div>
                                <p class="help-block">Email of your client</p>
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Date of birth</label>
                            <div class="col-md-4">
                                <input id="client-name1" name="client-day-of-birth" type="text"
                                       placeholder="your client's date of birth" class="form-control input-md"
                                       value='${customer.customerDayOfBirth}'>
                                <span class="help-block">Full birthday of your customer</span>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-4 control-label">Gender</label>
                            <div class="col-md-4">
                                <select name="client-gender">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Other">Other</option>
                                </select>
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Identity card</label>
                            <div class="col-md-4">
                                <input id="client-name2" name="client-identity-card" type="text"
                                       placeholder="your client's identity card" class="form-control input-md"
                                       value='${customer.customerIdentityCard}'>
                                <span class="help-block">Full identity card</span>
                            </div>
                        </div>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Phone number</label>
                            <div class="col-md-4">
                                <input id="client-name3" name="client-phone-number" type="text"
                                       placeholder="your client's phone number" class="form-control input-md"
                                       value='${customer.customerPhoneNumber}'>
                                <span class="help-block">Number only</span>
                            </div>
                        </div>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label">Address</label>
                            <div class="col-md-4">
                                <input id="client-name4" name="client-address" type="text"
                                       placeholder="your client's address" class="form-control input-md"
                                       value='${customer.customerAddress}'>
                                <span class="help-block">Input province only</span>
                            </div>
                        </div>
                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="btn-save"></label>
                            <div class="col-md-4">
                                <a href="/customer" class="btn btn-primary btn-sm">Back to list</a>
                                <button id="btn-save" name="btn-save" class="btn btn-success btn-sm">Update</button>
                            </div>
                        </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</body>
</html>