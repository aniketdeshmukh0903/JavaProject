<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get property</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.User" scope="request"></jsp:useBean>
Get property page<br/>

First Name: <jsp:getProperty property="firstName" name="user"/><br/>
Last Name: <jsp:getProperty property="lastName" name="user"/>


</body>
</html>