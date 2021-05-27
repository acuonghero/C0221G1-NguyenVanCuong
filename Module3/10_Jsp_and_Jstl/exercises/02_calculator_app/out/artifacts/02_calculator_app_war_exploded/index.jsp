<%--
  Created by IntelliJ IDEA.
  User: Nv Cuong
  Date: 5/27/2021
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculate">
    <h2>Calculator</h2>
    <span>First operand</span>

    <input type="text" name="first">
    <br>
    <span>Operator</span>
    <select name="chosse" id="">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">x</option>
      <option value="/">/</option>
    </select>
    <br>
    <span>Second operand</span>
    <input type="text" name="second">
    <br>
    <button style="margin-left: 200px">Calculate</button>
  </form>
  </body>
</html>
