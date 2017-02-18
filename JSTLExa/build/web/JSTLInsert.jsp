<%-- 
    Document   : JSTLInsert
    Created on : Oct 5, 2015, 11:09:10 AM
    Author     : TecSo-IT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Insert</title>
    </head>
    <body>
       <form name="register" action="JSTLInsertDone.jsp" method="post">
            Name : <input type="text" name="name" placeholder="Name*" required>
            <br/><br/>
            Email : <input type="text" name="email" placeholder="Email*" required>
            <br/><br/>
            Password : <input type="password" name="password" placeholder="Password*" required>
            <br/><br/>
            <input type="submit" value="Submit">
            &nbsp;&nbsp;
            <input type="reset" value="Reset">
        </form>
    </body>
</html>
