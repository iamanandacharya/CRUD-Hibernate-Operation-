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
	Succesfull Login!!!!!
	<tr><td>UserName: </td> <td><%= session.getAttribute("user")%> </td>
	<tr><td>Password: </td><td> <%= session.getAttribute("pass") %></td></tr>
</table>
</center>
<center>
<table border='0' width='1335' height='3' >
	<tr><td height="40" width="30">	<a href="LogoutServlet">LogOut</a> <a href="Success.jsp">Home</a> <a href="Changepass.jsp"> Change Password </a></td></tr>
</table>
</center>
</body>
</html>