<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 6/2/2021
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <style>
        .class{
            border-radius: 8px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <!-- FORM  -->
        <div class="col-lg-12 class bg-info">

            <form class="form-horizontal " id="form-edit-client">
                <fieldset>

                    <!-- Form Name -->
                    <center><legend>Update customer</legend></center>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Customer id</label>
                        <div class="col-md-4">
                            <input id="client-name0" name="customer-id" type="text" class="form-control input-md">
                            <!--                            <span class="help-block">Full name of your customer</span>-->
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Type id</label>
                        <div class="col-md-4">
                            <input id="client-name" name="client-name" type="text" placeholder="your client's type id" class="form-control input-md">
                            <!--                            <span class="help-block">Full name of your customer</span>-->
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Name</label>
                        <div class="col-md-4">
                            <input id="client-name6" name="client-name" type="text" placeholder="your client's name" class="form-control input-md">
                            <span class="help-block">Full name of your customer</span>
                        </div>
                    </div>

                    <!-- Prepended text-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-email">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="client-email" name="client-email" class="form-control" placeholder="yourname@yourdomain.com" type="text">
                            </div>
                            <p class="help-block">Email of your client</p>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Date of birth</label>
                        <div class="col-md-4">
                            <input id="client-name1" name="client-name" type="text" placeholder="your client's date of birth" class="form-control input-md">
                            <span class="help-block">Full birthday of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Gender</label>
                        <div class="col-md-4">
                            <select name="gender">
                                <option value="">Male</option>
                                <option value="">Female</option>
                                <option value="">Other</option>
                            </select>
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Identity card</label>
                        <div class="col-md-4">
                            <input id="client-name2" name="client-name" type="text" placeholder="your client's identity card" class="form-control input-md">
                            <span class="help-block">Full identity card</span>
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Phone number</label>
                        <div class="col-md-4">
                            <input id="client-name3" name="client-name" type="text" placeholder="your client's phone number" class="form-control input-md">
                            <span class="help-block">Number only</span>
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Address</label>
                        <div class="col-md-4">
                            <input id="client-name4" name="client-name" type="text" placeholder="your client's address" class="form-control input-md">
                            <span class="help-block">Input province only</span>
                        </div>
                    </div>
                    <!-- Button -->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="btn-save"></label>
                        <div class="col-md-4">
                            <button id="btn-save" name="btn-save" class="btn btn-success">Update</button>
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