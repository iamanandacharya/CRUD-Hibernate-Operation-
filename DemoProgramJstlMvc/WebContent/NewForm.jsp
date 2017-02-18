<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="java.util.*" %>

<%@page import="DaoVoClass.RegisterDetailsVo" %>
<%@page import="DAO.ShowDatabase" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




</head>
<body>
<center>

<form action="<%=request.getContextPath()%>/ServletFormShow" method="post" name="regFrom">
<input type="submit" value="submit" name="submit" >
<a href="Form.jsp">Add</a>
<table>
 <tbody> 
 <tr> 
 <th>Sr No.</th> 
<th> Name </th> 
 <th> Password </th> 
<th> Date of Birth </th> 
 <th> Address </th> 
 <th>Phone Number</th> 
 <th>Email</th> 
  </tr> 
 <c:forEach var="listvalue" varStatus="i" items="${reglist}">

<tr>
<td><c:out value="${i.count}"></c:out></td>

<td>"${listvalue.name}"</td>
<td>"${listvalue.password}"</td>
<td>"${listvalue.date}"</td>
<td>"${listvalue.address}"</td> 
<td>"${listvalue.phoneNumber}"</td>
<td>"${listvalue.email}"</td>         
<!-- <td><a href=\"EditRegister.jsp?tid="+ ${listvalue.id}>Edit</a></td> -->
<td><a href="EditRegister.jsp?tid=${listvalue.id}">Edit</a></td>
<td>  <a href="DeleteServlet?fid=${listvalue.id}">Delete</a></td>


</tr>
<!-- <td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>" -->
<!-- ("<td><a href='EditRegister.jsp?sid="+ rs.getInt(1) +"'>Edit</a></td>"); -->
</c:forEach>
</tbody>
</table>
  
        	
</form>
</center>

</body>
</html>