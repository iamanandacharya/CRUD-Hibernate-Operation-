
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="model.BlManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.view.Department"%>
<%@page import="java.util.List"%>
	<%
BlManager bl = new BlManager();
List <Department> list = bl.getAllDepartment();

System.out.print(list);
HttpSession s = request.getSession();
s.setAttribute("DeptNameList", list);

%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
  
	<form action="#" method="post">
<table>
<tr>
		<select name="DID" id="DID">
			<c:forEach items="${sessionScope.DepList}" var="ls">
				<option value="${ls.depCode}">${ls.depCode}</option>
			</c:forEach>

		</select>
	<td><a href="editformDepart.jsp?id=<%=session.getAttribute("code")%>">Edit</a></td>  
<td><a href="deleteuserDepart.jsp?id=<%=session.getAttribute("code")%>">Delete</a></td>
</tr>
</table>
</form>
</body>
</html>