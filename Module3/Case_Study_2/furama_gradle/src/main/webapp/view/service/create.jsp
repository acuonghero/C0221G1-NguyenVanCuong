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

            <form class="form-horizontal bg-info" style="border-radius: 7px" id="form-edit-client" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center><legend>Create Service</legend></center>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Name</label>
                        <div class="col-md-4">
                            <input id="client-name" name="name" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!--Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Area</label>
                        <div class="col-md-4">
                            <input name="area" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Cost</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input id="client-email" name="cost" class="form-control"type="text">
                            </div>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Max people</label>
                        <div class="col-md-4">
                            <input name="max-people" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Rent type</label>
                        <div class="col-md-4">
                            <select name="rent-type">
                                <c:forEach items="${rentType}" var="type">
                                    <option value="${type.rentTypeId}">${type.rentTypeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" >Service type</label>
                        <div class="col-md-4">
                            <select name="service-type">
                                <c:forEach items="${serviceType}" var="type">
                                    <option value="${type.serviceTypeId}">${type.serviceTypeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Standard room</label>
                        <div class="col-md-4">
                            <input name="standard-room" type="text" class="form-control input-md">
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Description Other Convernience</label>
                        <div class="col-md-4">
                            <input name="description-other-convernience" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Pool area</label>
                        <div class="col-md-4">
                            <input name="pool-area" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Number of floors</label>
                        <div class="col-md-4">
                            <input name="number-of-floors" type="text" class="form-control input-md">
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