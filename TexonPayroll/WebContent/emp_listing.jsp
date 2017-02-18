<%@page import="com.texon.vo.EmpListVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.texon.Dao.*" %>
<%@page import="com.texon.daolmpl.*" %> 
 <%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="java.util.*" %>
 <%@page import="com.texon.vo.EmpListVO"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="js/jQuery-2.1.4.min.js" type="text/javascript"></script>
	<!-- Bootstrap 3.3.2 JS -->
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/fastclick.min.js" type="text/javascript"></script>
	<!-- Slimscroll -->
	<script src="js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="js/app.min.js" type="text/javascript"></script>
	
	
</head>
<body>
<center>
<div class="List">
<form action="<%=request.getContextPath()%>/EmpListingg" method="post"> 
<input type="text" name="emp_code" >
<input type="submit" value="Submit" name="action">

<table>
<tbody>
<tr>
<th>Sr No. </th>
<th>EmpName </th>
<th> city</th>
<th> EmpCode</th>
<th>Designation </th>
</tr>

<c:forEach var="listvalue" varStatus="i" items="${EmpList}">

<tr>
<td><c:out value="${i.count}"></c:out></td>
<td>"${listvalue.empName}"</td>
<td>"${listvalue.city}"</td>
<td>"${listvalue.emp_code}"</td>
<td>"${listvalue.designation}"</td>      
</tr>

</c:forEach>


</tbody>
</table>
</form>
</div>

</center>
</body>
</html>