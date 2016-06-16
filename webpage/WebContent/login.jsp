<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="LoginServlet" method="post">
User name:<input type="text" name="userid"/>
Password : <input type="password" name="password"/>
<input type="submit" name="login" value="login"/>
<input type="reset" value="clear"/>
</form>
</body>
</html>