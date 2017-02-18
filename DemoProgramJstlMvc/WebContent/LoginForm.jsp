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
<form action="LoginForm" method="post" name="login">
<table>
<tr><td>Login Name </td> <td><input type="text" name="Name" value="${cookie.userid.value}"> </td></tr>
<tr><td>Password </td> <td><input type="text" name="Password"> </td></tr>
<tr><td></td> <td><input type="checkbox" name="Remember">&nbsp;&nbsp;Remember Me! </td></tr>
<tr><td><input type="submit" value="submit"> </td></tr>
<tr><td><a href="ForgotPassword.jsp">Forgot Password</a> </td></tr>
<tr><td><a href="ForgotUserName.jsp">Forgot UserName</a></td></tr>
<tr><td><a href="Form.jsp">SignUp</a> </td></tr>
 
</table>
</form>

</center>
</body>
</html>