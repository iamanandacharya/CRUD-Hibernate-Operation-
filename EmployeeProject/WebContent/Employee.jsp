<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/my.css" />

<style>
table th,td{
	border-collapse: collapse;
	padding: 10px;
}
th,td{
padding:15px;
 text-align: left;  
}
</style>

</head>
<body id="main">

<div >
<center>

<h1>Employee Form</h1>
<a href="EmpView.jsp"><h1>View</h1></a>

<form action="AddEmpServlet" method="post" >

<table border="3" >
<tbody>
<tr><td>First Name:</td><td><input type="text" minlength="4"  name="fname" required id="name"></td></tr>
<tr><td>Last Name:</td><td><input type="text" minlength="4" name="lname" required id="lName"></td></tr>

<tr><td>Address:</td><td> <textarea minlength="50" rows="5" cols="24" name="address" > </textarea></td></tr>
<tr><td>Phone:</td><td> <input type="number" name="phNumber" id="phNumm" required> </td></tr>
<tr><td>Gender:</td><td> <input type="radio" name="gender" value="male" > Male<input type="radio" name="gender" value="female" >Female</td></tr>
<tr><td>Role:</td><td> <select name="role" required>
<option>Manager</option>
<option>Leader</option>
<option>Agent</option>
</select>
</td></tr>
<tr><td>Date Of Birth:</td><td> <input type="date" name="date" required></td></tr>

</tbody>
</table>
<table><tr><td><input type="submit" value="submit" /></td></tr></table>
</form>

</center>


</div>
</body>
</html>