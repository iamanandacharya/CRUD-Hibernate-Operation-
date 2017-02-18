<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table>
<form action="EmailServlet" method="post">
<tr><td><h5>Enter your Email</h5></td><td><input type="text" name="email" ></td></tr>
<tr><td><h5>Enter your Username </h5></td><td><input type="text" name="uname" ></td></tr>
<tr><td><h5>Enter your Old password </h5></td><td><input type="text" name="password" ></td></tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</form>
</table>
</center>
</body>
</html>