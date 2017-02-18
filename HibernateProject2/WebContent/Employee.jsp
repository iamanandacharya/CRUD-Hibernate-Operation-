<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@page import="BlManager.BlManager"%>
<%@page import="com.view.Employee,java.util.*"%>
           
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="AddServlet" method="post" onsubmit="formvallidation();">
	<table border="2">
	<tr><td>Name: <input type="text" name="name" value="Name" id="nameId"/></td></tr>
	<tr><td>Birth Date:</tr>
	<tr><td> <input type="date" name="datetime" /></td></tr>
	<!-- <tr><td> <input type="time" name="datetime" /></td></tr>
	 --><!-- <tr><td>
	 Day: <select name="day">
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>6</option>
	<option>7</option>
	<option>8</option>
	<option>9</option>
	<option>10</option>
	<option>11</option>
	<option>12</option>
	<option>13</option>
	<option>14</option>
	<option>15</option>
	<option>16</option>
	<option>17</option>
	<option>18</option>
	<option>19</option>
	<option>20</option>
	<option>21</option>
	<option>22</option>
	<option>23</option>
	<option>24</option>
	<option>25</option>
	<option>26</option>
	<option>27</option>
	<option>28</option>
	<option>29</option>
	<option>30</option>
	<option>31</option>
	</select> 
	 Month <select name="month">
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>6</option>
	<option>7</option>
	<option>8</option>
	<option>9</option>
	<option>10</option>
	<option>11</option>
	<option>12</option>
	</select>
	Year<select name="year">
	<option>2015</option>
	<option>2016</option>
	<option>2017</option>
	<option>2018</option>
	<option>2019</option>
	<option>2020</option>
	<option>2021</option>
	<option>2022</option>
	</select></td></tr> -->
	<tr><td>TextArea:</td></tr>
	<tr><td><textarea rows="10" cols="32" maxlength="150" name="adress"></textarea></td></tr>
	
	<tr><td>Gender:<input type="radio" name="M" value="M" checked>Male
	<input type="radio" name="M" value="F">Female<br>
	</td></tr>
	
	
	<tr><td>Salary: <input type="text" name="salary" id="salaryId" /></td></tr>
	<tr><td><input type="submit" value="submit" />
	
	
</form>

<form action="skillservlet" method="post">

<tr><td>Skill:<br>

	<input type="checkbox" name="java" value="Java">Java<br>
	<input type="checkbox" name="c#" value="c#" >C# <br>
	<input type="checkbox" name=".net" value=".net"> .net<br>
	<input type="checkbox" name="c++" value="c++">c++ <br>
	</td></tr>
	<tr><td><input type="submit" value="submit" /></td></tr>
	</table>
</form>
<form action="ViewServlet" method="POST">
            <input type="submit" name="showEmployee" value="Show"> &nbsp; &nbsp;<br>
 	</form> 
       
<table border="1" width="90%"> 
	<tr>
	<th>Emp Id </th> <th>Emp Name </th> <th>Emp Birth Date</th> <th>Emp Address </th> <th>Gender </th> <th>Salary</th><th>Update</th> <th>delete</th>
	</tr>
			<c:forEach var = "emp" items="${list}">
				<tr>
				     <td>Emp Id: ${emp.employeeId}</td>
					<td>Emp Name: ${emp.name}</td>
					<td>Emp Number: ${emp.address}</td>
					<td>Emp Email :${emp.gender}</td>
					<td>Emp salary :${emp.salary }</td>
					<td>Emp Date: ${emp.birthDate }</td>
					<%-- <td>Department Name : ${emp.department.depName}</td>
					
					 <td><a href="UpdateServ?editid=${emp.empId}">Edit</a></td>
					<td><a href="deleteform?id=${emp.empId}">Delete</a></td>
 --%>
				</tr>
			</c:forEach>
</table>
                      


<a href="DisplayForm.jsp">View</a>

							

</center>
</body>
</html>