<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
 

 <center><h1> <b><u>Register Here</u></b></h1><hr>
            <form name="RegForm"  method="post"  action="RegisetrControlerServlet">
            <table>
            <tr><td>Name</td><td><input type="text" name="Name"  id="nameid"/></td> </tr>
            
           <tr><td>Password</td><td><input type="text" name="Password"  /></td></tr>
           <tr><td>Re-Password</td><td><input type="text" name="retypepassword"  /></td></tr>
   
          
           <tr><td>Address</td><td><textarea name="Address"></textarea></td></tr>
           <tr> <td>Phone Number</td><td><input type="text" name="PhoneNumber"  id = "numb"> /</td></tr>
           
            <tr> <td>Email</td><td><input type="text" name="Email"  /></td></tr>
            
        
           <tr><td> <input type="submit" value="Register" name="submit" /></td></tr>
           </table>
  </form>   
 </center> 			      
</body>
</html>