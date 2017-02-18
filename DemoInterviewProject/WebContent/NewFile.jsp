<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@page import="model.Employee,java.util.*"%>
<%@page import= "BlManager.BlManager"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<center>

	<form action="EmployeeController" method="POST">
            <input type="submit" name="showEmployee"  name="button" id="buttonId" value="click" > &nbsp; &nbsp;<br>
 	</form> 

 <table border="1" width="90%"> 
	<tr> 
 <th>Sr No.</th> 
<th> Name </th> 
 <th> address </th> 
<th> gender </th> 
 <th> salary </th> 
  <th>birth_date</th> 
 
 </tr>
 
<c:forEach var="listvalue"  items="${empDetails}">
<tr>
<td>
<td>"${listvalue.employeeId}"</td>
<td>"${listvalue.Name}"</td>
<td>"${listvalue.address}"</td>
<td>"${listvalue.gender}"</td>
<td>"${listvalue.salary}"</td> 
<td>"${listvalue.birth_date}"</td>

						<td><a href="editform.jsp?id=${emp.employeeId}">Edit</a></td>
						<td><a href="deleteform?id=${emp.employeeId}">Delete</a></td>
				</tr>			
			</c:forEach> 
		</table>
		</center>
<%--  <script src="js/jquery-1.11.3.js" type="text/javascript"></script>
 <script type="text/javascript">
 function ajaxcalling(){
	 var buttons= document.getElementById("buttonId").value;
	 jQuery.ajax({
		url : "<%=request.getContextPath() %>/EmployeeController",
			type: "post",
				//datatype:
					success:function(){
						jquery('#tablecontent').append('<tr><td>' +
								"" +
								'</td><td>'+
								"<%=session.getAttribute("address")%>" +
								'</td><td>'+
								"<%=session.getAttribute("gender")%>" +
								'</td><td>' +
								"<%=session.getAttribute("salary")%>" +
								'</td></tr>');
								
								
					}
						
	 });
	 
	 
 }
 
 </script>
  --%>

	

</body>
</html>