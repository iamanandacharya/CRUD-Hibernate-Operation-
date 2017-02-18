<%-- 
    Document   : JSTLUpdate
    Created on : Oct 5, 2015, 11:27:03 AM
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
<tr>
    <form action="JSTLUpdateDone.jsp?rid=${param.rid}" method="post">
   <td><c:out value="${param.rid}"/></td>
   <td><input type="text" name="n"></td>
   <td><input type="text" name="e"></td>
   <td><input type="text" name="p"></td>
   <td><input type="submit" value="Update"></td>
   <td><input type="button" value="Cancel" onclick="window.location.href='JSTLSelect.jsp';"</td>
    </form>
    </tr>
</table>
    </body>
</html>
