 <%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login JSP</title>
</head>
<body>
<%
Date date = new Date();
%>
<div>Current Date: <%= date %></div>
My first JSP ${name}
<!-- <form action="/login.do" method="POST">
Enter your name: <input type="text" name="name"/><input type="submit" value="login"/>
</form> -->

<form action="/spring-mvc/login" method="POST">
Enter your name: <input type="text" name="name"/><input type="submit" value="login"/>
</form>
</body>
</html>