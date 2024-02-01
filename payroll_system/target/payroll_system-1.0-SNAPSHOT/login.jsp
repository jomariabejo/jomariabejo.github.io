<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--
  Created by IntelliJ IDEA.
  User: jomar
  Date: 2/1/2024
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
-->
<html>
<head><title>Login</title></head>
<body>
<h1>Login</h1>
<form action="login.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"></input><br/>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"></input><br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>

