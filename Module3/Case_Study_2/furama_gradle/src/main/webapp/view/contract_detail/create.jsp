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
            <form class="form-horizontal bg-info" style="border-radius: 7px" action="/contractdetail?action=create" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center><legend>Create Contract Detail</legend></center>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Name</label>
                        <div class="col-md-4">
                            <input id="client-name" name="name" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!--Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Birthday</label>
                        <div class="col-md-4">
                            <input name="birthday" type="text" class="form-control input-md">
                        </div>
                    </div>

                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Id Card</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input name="id-card" class="form-control"type="text">
                            </div>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Salary</label>
                        <div class="col-md-4">
                            <input name="salary" type="text" class="form-control input-md">
                        </div>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Phone Number</label>
                        <div class="col-md-4">
                            <input name="phone-number" type="text" class="form-control input-md">
                        </div>
                    </div>


                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input name="email" class="form-control"
                                       placeholder="yourname@yourdomain.com" type="text">
                            </div>
<%--                            <p class="help-block">Email of your client</p>--%>

                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input name="address" type="text" class="form-control input-md">
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Position</label>
                        <div class="col-md-4">
                            <select name="position">
                                    <c:forEach var="position" items="${positions}">
                                        <option value="${position.positionId}">${position.positionName}</option>
                                    </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Education Degree</label>
                        <div class="col-md-4">
                            <select name="educationDegree">
                                <c:forEach var="education" items="${educations}">
                                    <option value="${education.educationDegreeId}">${education.educationDegreeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Division</label>
                        <div class="col-md-4">
                            <select name="division">
                                <c:forEach var="division" items="${divisions}">
                                    <option value="${division.divisionId}">${division.divisionName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Username</label>
                        <div class="col-md-4">
                            <input name="username" type="text" class="form-control input-md">
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