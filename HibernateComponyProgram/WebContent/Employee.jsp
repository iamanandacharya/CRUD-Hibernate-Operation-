<%@page import="model.BlManager"%>
<%@page import="com.view.Employee,com.view.Department,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@page import="com.view.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%
BlManager bl = new BlManager();
List <Department> list = bl.getAllDepartment();

System.out.print(list);
HttpSession s = request.getSession();
s.setAttribute("DeptNameList", list);

%>

<!-- Insert Code form -->
		<form action="empInfo" method="post">
			Emp Name: <br><input type="text" name="empName" /><br/>
			Emp Number:<br><input type="text" name="empNo" /><br/>
			Emp Email: <br><input type="text" name="empemail" /><br/>
			<!-- Emp Date:<br><input type="Date" name= "date" /><br/>
			 -->
			 Department Name
			<td>
			<select name="dId">			
			<c:forEach items="${sessionScope.DeptNameList}" var="ls">
				<option value="${ls.depName}">${ls.depName}</option>
			</c:forEach>
			</select>
					</td> 
			<br><input type="submit" value="click" /><br/>
		</form>


<!-- View Form Code -->


 	<form action="EmployeeController" method="POST">
            <input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
 	</form> 
       

<table border="1" width="90%"> 
	<tr>
	<th>Emp Id </th> <th>Emp Name </th> <th>Emp pHone Number</th> <th>Emp Emaill </th> <th>Dmp Name </th> <th>update</th> <th>delete</th>
	</tr>
			<c:forEach var = "emp" items="${empDetails}">
				<tr>
				     <td>Emp Id: ${emp.empId}</td>
					<td>Emp Name: ${emp.empName}</td>
					<td>Emp Number: ${emp.empPhoneNo}</td>
					<td>Emp Email :${emp.empEmail}</td>
					<%-- <td>Emp Date :${emp.empDate}</td> --%>
					<td>Department Name : ${emp.department.depName}</td>
					<td><a href="UpdateServ?editid=${emp.empId}">Edit</a></td>
					<td><a href="deleteform?id=${emp.empId}">Delete</a></td>

				</tr>
			</c:forEach>
</table>
                      

</center>
</body>
</html>