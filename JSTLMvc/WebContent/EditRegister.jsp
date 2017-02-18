<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
            <table>
            <centre>
                <h1> <b> <u>Update Form </h1> </b> </u>
                <form action="UpdateServlet?sid=<%=request.getParameter("tid")%>" method="post">
                  <br><tr> <td>Name </td><td><input  type="text" name="name" value="<%=session.getAttribute("user")%>"> </td> </tr>
                 <br><tr> <td>Password </td><td><input  type="text" name="password" value="<%=session.getAttribute("pass")%>"> </td> </tr>
                <br><tr> <td>Date Of Birth </td><td><input  type="text" name="dateofbirth" value=""> </td> </tr>
                <br><tr><td> Address </td><td><input type="text" name="address" value="<%=session.getAttribute("add")%>"> </td></tr>     
                <br><tr><td>Phone Number</td><td><input type="text" name="number" value="<%=session.getAttribute("num") %>" ></td></tr>   
          		<br><tr><td>Email</td><td><input type="text" name="email" value="<%=session.getAttribute("email")%>"></td></tr>
                <br><tr><td><input  type="submit" name="name" value="submit"> </td> </tr>
             
                </form>
                 
                
            </centre>
         </table>
        
       
</body>
</html>