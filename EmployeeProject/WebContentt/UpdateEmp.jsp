<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/css" src="css/my.css"></script>
<script type="text/javascript">

</script>
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

	<div id="main">

		<center>
			<h1>Employee Upadate Form</h1>
			<a href="Employee.jsp"><h1>Add Employee</h1></a> <a
				href="EmpView.jsp"><h1>View</h1></a>
			<form action="UpdateEmpServlet" method="post">
				<table border="3">
					<tbody>
						<tr>
							<td>First NameId :</td>
							<td><input type="text" name="id" value="${empId.empId}"
								readOnly></br></td>
						</tr>
						<tr>
							<td>First Name:</td>
							<td><input type="text" name="fname" required id="name"
								value="${empId.firstName}"></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><input type="text" name="lname" required id="lName"
								value="${empId.lastName}"></td>
						</tr>

						<tr>
							<td>Address:</td>
							<td><input type="text" rows="10" cols="10" minlength="50"
								name="address" value="${empId.address}"></td>
						</tr>
						<tr>
							<td>Phone:</td>
							<td><input type="text" name="phNumber" id="phNumm" required
								value="${empId.phone}"></td>
						</tr>
						<tr>
							<td>Gender:</td>
							<td><input type="radio" name="gender" checked
								value="${empId.gender}"> Male<input type="radio"
								name="gender" value="${empId.gender}">Female</td>
						</tr>
						<tr>
							<td>Role:</td>
							<td><select name="role" required value="${empId.role}">
									<option>Manager</option>
									<option>Leader</option>
									<option>Agent</option>
							</select>
						<tr>
							<td>Date Of Birth:</td>
							<td><input type="date" name="date"
								value="${empId.dateOfBirth}" required></td>
						</tr>
					</tbody>
				</table>
				<table>
					<tr>
						<td><input type="submit" value="submit" /></td>
					</tr>
				</table>
			</form>
		</center>
	</div>


</body>
</html>