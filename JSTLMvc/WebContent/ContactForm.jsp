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
<form action="ContacFormMailServlet" method="post" enctype="multipart/form-data">
<table>
<tr><td>Name</td><td><input type="text" name="name" > </td></tr>
<tr><td>Email</td><td><input type="text" name="email" > </td></tr>
<tr><td>Phone Number</td><td><input type="text" name="number" > </td></tr>
<tr><td>Comments</td><td><textarea name="comments"></textarea> </td></tr>
<tr><td>To</td><td><input type="text" name="to" > </td></tr>
<tr><td>CC</td><td><input type="text" name="cc" > </td></tr>
<tr><td>BCC</td><td><input type="text" name="bcc" > </td></tr>
<tr><td>Upload</td><td><input type = "file" name="fileUpload"> </td></tr>
<tr><td><input type="submit" value="send"></td></tr>
</table>
</form>
</center>
</body>
</html>