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
                  action="/student?action=create" method="post">
                <fieldset>

                    <!-- Form Name -->
                    <center>
                        <legend>Create Student</legend>
                    </center>
                    <h3>${msg}</h3>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Name</label>
                        <div class="col-md-4">
                            <input id="client-name" name="name" type="text" class="form-control input-md" value="${student.studentName}">
                        </div>
                        <small style="color: red">${name}</small>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4">
                            <select name="gender" class="form-control">
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                <option value="Other">Other</option>
                            </select>
                        </div>
                    </div>

                    <!--Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Birthday</label>
                        <div class="col-md-4">
                            <input name="birthday" type="date" class="form-control input-md" value="${student.studentBirthday}">
                        </div>
                        <small style="color: red">${birthday}</small>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Phone Number</label>
                        <div class="col-md-4">
                            <input name="phone" type="text" class="form-control input-md" value="${student.studentPhone}">
                        </div>
                        <small style="color: red">${phone}</small>
                    </div>


                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input name="email" class="form-control"
                                       placeholder="yourname@yourdomain.com" type="email" value="${student.studentEmail}">
                            </div>
                        </div>
                        <small style="color: red">${email}</small>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input name="address" type="text" class="form-control input-md" value="${student.studentAddress}">
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