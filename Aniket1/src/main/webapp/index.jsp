<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
It's home <br/>
<a href="<%=request.getContextPath() %>/Demo?page=login">login</a><br/>
<a href="<%=request.getContextPath() %>/Demo?page=signup">signup</a><br/>
<a href="<%=request.getContextPath() %>/Demo?page=about">About</a><br/>

</body>
</html>