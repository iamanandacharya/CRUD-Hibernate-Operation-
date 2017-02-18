<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServ" method="post">

Id - <input type="text" name="empId" value="${e.empId}" readonly="readonly"><br><br>
Name - <input type="text" name="empName" value="${e.empName}" ><br><br>
Salary - <input type="text" name="empSal" value="${e.empSalary}"><br><br>
Department : <select name="drop"><br><br>
<option>${e.dept.deptName}</option>
<option value="Computer">Computer</option>
<option value="Maths">Maths</option>
<option value="Science">Science</option>
<option value="History">History</option>
<option value="Sports">Sports</option>
</select><br><br>

<br><br>
<input type="submit" name="Save" value="Update"><br><br>
<br><br><br>
<a href="listServ">Show List of all Employee</a>
</form>
</body>
</html>