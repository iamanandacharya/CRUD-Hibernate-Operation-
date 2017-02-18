<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveServlet" method="post">
Name - <input type="text" name="empName"><br><br>
Salary - <input type="text" name="empSal"><br><br>
Department : <select name="drop"><br><br>
<option value="Computer">Computer</option>
<option value="Maths">Maths</option>
<option value="Science">Science</option>
<option value="History">History</option>
<option value="Sports">Sports</option>
</select><br><br>


<input type="submit" name="Save" value="Save"><br><br>
<br><br><br>
<a href="listServ">Show List of all Employee</a>
</form>

</body>
</html>