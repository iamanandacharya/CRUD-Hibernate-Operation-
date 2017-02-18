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
<form action="ChangePassword" method="post" >
<table>
<tr><td>Old Password</td> <td><input type="text" name="pass" value="${cookie.password.value}"></td></tr>
<tr><td>New password </td><td><input type="text" name="Newpass"></td></tr>
<tr><td>Conform password </td><td><input type="text" name="Conpass"></td></tr>
<tr><td></td> <td><input type="checkbox" name="Remembers">&nbsp;&nbsp;Remember Me! </td></tr>
<tr><td><input type="submit" value="Submit" ></td></tr>
<tr><td><a href="LoginForm.jsp">Cancel </a></td></tr>
</table>
</form>
</center>
</body>
</html>