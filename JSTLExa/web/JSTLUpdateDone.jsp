<%-- 
    Document   : JSTLUpdateDone
    Created on : Oct 5, 2015, 11:47:39 AM
    Author     : TecSo-IT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Update</title>
    </head>
    <body>
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/system?zeroDateTimeBehavior=convertToNull"
     user="root"  password="root"/>
 
<%--<c:set var="name" value="${param.n}"/>
<c:set var="email" value="${param.e}"/>
<c:set var="pass" value="${param.p}"/>
<c:set var="id" value="${param.rid}"/>--%>
        
<sql:update dataSource="${snapshot}" var="count">
  UPDATE register SET Name=?,Email=?,Password=? WHERE Rid=?
  <sql:param value="${param.n}" />
  <sql:param value="${param.e}" />
  <sql:param value="${param.p}" />
  <sql:param value="${param.rid}" />
</sql:update>
 
<sql:query dataSource="${snapshot}" var="result">
SELECT * from register;
</sql:query>
 
<table border="1" width="100%">
    <center><h1>Result:</h1></center>
<a href="JSTLInsert.jsp">Insert New</a>
<tr>
   <th>Rid</th>
   <th>Name</th>
   <th>Email</th>
   <th>Password</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.Rid}"/></td>
   <td><c:out value="${row.Name}"/></td>
   <td><c:out value="${row.Email}"/></td>
   <td><c:out value="${row.Password}"/></td>
   <td><a href="JSTLUpdate.jsp?rid=${row.Rid}">Edit</a></td>
   <td><a href="JSTLDelete.jsp?rid=${row.Rid}">Delete</a></td>
</tr>
</c:forEach>
</table>
    </body>
</html>
