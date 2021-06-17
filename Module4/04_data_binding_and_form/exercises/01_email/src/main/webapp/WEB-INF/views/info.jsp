<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<h2>Email</h2>
<table>
    <tr>
        <td>Languages:</td>
        <td>${email.languages}</td>
    </tr>
    <tr>
        <td>Page size:</td>
        <td>${email.pageSize}</td>
    </tr>
    <tr>
    <td>Spams:</td>
    <td>${email.spams}</td>
</tr>
    <tr>
        <td>Signature:</td>
        <td>${email.signature}</td>
    </tr>
</table>
</body>
</html>