<%@page import="com.view.Employee"%>
<%@page import="com.model.BlManager"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/my.css" />
<style>
table th, td {
	border-collapse: collapse;
	padding: 10px;
}

th, td {
	padding: 15px;
	text-align: left;
}
</style>
</head>
<body id="main">
	<%-- <%
BlManager bl = new BlManager();
List<Employee> list = bl.getAllData();
HttpSession s = request.getSession();
s.setAttribute("empList", list);
%>
 --%>
	<center>
		<a href="Employee.jsp"><h2>Add Employee</h2></a>
		<form action="EmployeeShow" method="POST">
			<input type="submit" name="showEmployee" value="Show"> &nbsp;
			&nbsp;<br>


		</form>
		<a href="Search.jsp"><h1>Search Data</h1></a>
		<table border="2" width="100%">
			<tr>
				<th>No</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Gender</th>
				<th>Role</th>
				<th>Date Of Birth</th>
				<th>update</th>
				<th>delete</th>
			</tr>
			<c:forEach var="emp" items="${sessionScope.emplShowAttribute}">
				<tr>
					<td><c:out value="${emp.empId}"></c:out></td>
					<td><c:out value="${emp.firstName}"></c:out></td>
					<td><c:out value="${emp.lastName}"></c:out></td>
					<td><c:out value="${emp.address}"></c:out></td>
					<td><c:out value="${emp.phone}"></c:out></td>
					<td><c:out value="${emp.gender}"></c:out></td>
					<td><c:out value="${emp.role}"></c:out></td>
					<td><c:out value="${emp.dateOfBirth}"></c:out></td>

					<td><a href="UpdateEmpServlet?editid=${emp.empId}"><font
							size="3" color="red">Edit</font></a></td>
					<td><a href="DeleteServlet?deleteid=${emp.empId}"><font
							size="3" color="red">Delete</font></a></td>

				</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>