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
<center>
<form action="UpdateServ" method="post">
Id : <input type="text" name="id" value="${empListId.empId}"></br>
Emp Name: <br><input type="text" name="empName" value="${empListId.empName }"/><br/>
Emp Number: <br><input type="text" name="empNo" value="${empListId.empPhoneNo }"/><br/>
Emp Email: <br><input type="text" name="empemail" value="${empListId.empEmail }"/><br/>
Department Name<br><select name="">
<option>${empListId.department.depName }</option>
</select>

<%--   <td><select name="dId">
 <c:forEach var="item" items="${did1}">
                                <option>${item.depName}</option>
                            </c:forEach>
</select> 
<%-- <select>
<option selected value="SELECT">SELECT</option>
                            <c:forEach var="item" items="<%=session.getAttribute("did1")      %>">
                                <option>${item}</option>
                            </c:forEach>
 </select> --%>
</td>
<br><input type="submit" value="click" /><br/>
</form>
</center>

</body>
</html>