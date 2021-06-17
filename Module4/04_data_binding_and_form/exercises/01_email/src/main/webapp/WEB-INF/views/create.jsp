<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Email</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST" action="update" modelAttribute="email">
    <table>
        <tr>
            <td><h3>Setting</h3></td>
        </tr>
        <tr>
            <td><form:label path="languages">Languages: </form:label></td>
            <td><form:select path="languages">
                <form:options items="${language}"/>
            </form:select></td>
        </tr>
        <tr>
            <td><span>show</span></td>
            <td><form:label path="pageSize">Page Size: </form:label></td>
            <td><form:select path="pageSize">
                <form:options items="${pageSize}"/>
            </form:select>
                <span>emails per page</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="spams">Spams : </form:label></td>
            <td>
                <form:checkbox path="spams"/>
                <span>enable spams</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature : </form:label></td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td><button>update</button></td>
            <td><button type="reset">Cancel</button></td>
        </tr>
    </table>
</form:form>
</body>
</html>