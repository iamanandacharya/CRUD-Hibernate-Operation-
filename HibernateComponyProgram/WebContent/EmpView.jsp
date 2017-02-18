<%@page import="model.BlManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.view.Employee,com.view.Department,java.util.*"%>



 	<form action="EmployeeController" method="POST">
            <input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
 	</form> 
       

<table border="1" width="90%"> 
	<tr>
	<th>Emp Id </th>	<th>Emp Name </th> <th>Emp pHone Number</th> <th>Emp Emaill </th> <th>Dmp Name </th> <th>update</th> <th>delete</th>
	</tr>
			<c:forEach var = "emp" items="${empDetails}">
				<tr>
				     <td>Emp Id: ${emp.empId}</td>
					<td>Emp Name: ${emp.empName}</td>
					<td>Emp Number: ${emp.empPhoneNo}</td>
					<td>Emp Email :${emp.empEmail}</td>
					<td>Department Name : ${emp.department.depName}</td>
					<td><a href="UpdateServ?editid=${emp.empId}">Edit</a></td>
					<td><a href="deleteform?id=${emp.empId}">Delete</a></td>

				</tr>
			</c:forEach>
</table>
                      

</body>
</html>