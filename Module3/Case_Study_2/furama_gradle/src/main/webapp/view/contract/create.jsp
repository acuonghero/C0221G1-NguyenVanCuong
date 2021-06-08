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

            <form class="form-horizontal bg-info" style="border-radius: 7px" action="/contract?action=create" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center><legend>Create Contract</legend></center>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Start Date</label>
                        <div class="col-md-4">
                            <div class="input-group">
                            <input id="client-name" name="startDate" type="date" class="form-control input-md">
                        </div>
                        </div>
                    </div>

                    <!--Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">End Date</label>
                        <div class="col-md-4">
                            <div class="input-group">
                            <input name="endDate" type="date" class="form-control input-md">
                        </div>
                        </div>
                    </div>

                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Deposit</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input name="deposit" class="form-control" type="text">
                            </div>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-md-4 control-label">Total money</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input name="totalMoney" class="form-control" type="text">
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Employee Name</label>
                        <div class="col-md-4">
                            <select name="employeeId">
                                <c:forEach items="${employee}" var="employee">
                                <option value="${employee.employeeId}">${employee.employeeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Customer Name</label>
                        <div class="col-md-4">
                            <select name="customerId">
                                <c:forEach items="${customer}" var="customer">
                                    <option value="${customer.customerId}">${customer.customerName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Service Name</label>
                        <div class="col-md-4">
                            <select name="serviceId">
                                <c:forEach items="${service}" var="service">
                                    <option value="${service.serviceId}">${service.serviceName}</option>
                                </c:forEach>
                            </select>
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
        </div>
    </div>
</div>
</body>
</html>