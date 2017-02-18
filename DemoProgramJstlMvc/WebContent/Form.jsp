<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
//create function
function validateform()
{
//create variable for every input field value
 var passw = document.RegForm.password.value;
 var repass = document.RegForm.retypepassword.value;
 var name = document.RegForm.name.value;
 var addr = document.RegForm.address.value;
 var num = document.RegForm.number.value;
 var email = document.RegForm.email.value;
 var x,text,y;
 y = document.getElementById('nameid').value;
 x= document.getElementById('numb').value;


// javascript Name Field Validation 
// // enter only text
 if(!isNaN(y))
 	{
 	alert("Name must be text");
 	return false;
 	}

//name not null
 if(name==null || name=="")
 {
 alert("Name cant be Empty");
 return false;
 }


//assword not empty 
 if(passw == null || passw == "" )
 	{
 	alert("Password can't be null");
 	return false;
 	}
	
 	//address not empty
 if(addr == null || addr == "")
 	{
 	alert("Address cant be null");
 	return false;
 	}

 	//check password length and defile password length
 if(passw.length <= 6)
 	{
 	alert("Password must be grater than 6 latters");
 	return false;
 	}
 	//check password 
 if(passw != repass )	
	
 	{
 	alert("Password must be same");
 	return false;
 	}
	
 //enter only number
 if(isNaN(x))
 {
 alert("Input not valid");
 return false;
 }

// //email not be null and it must be in  specific pattern
 if (email==null || email=="")
 {
 alert("please Enter Email");
 return false;
 }else{
   var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
   if(email.match(mailformat))
   {
   document.RegForm.email.focus();
 return true;
   }

 }

 }



 </script> 
</head>
<body>
 

 <center><h1> <b><u>Register Here</u></b></h1><hr>
            <form name="RegForm"  method="post"  action="DemoServletForm" >
            <table>
            <tr><td>Name</td><td><input type="text" name="name"  id="nameid"/></td> </tr>
            
           <tr><td>Password</td><td><input type="text" name="password"  /></td></tr>
           <tr><td>Re-Password</td><td><input type="text" name="retypepassword" minlength="6"  /></td></tr>
   
           <tr><td>Date of Birth</td><td><input type="text" name="date" /></td></tr>
           <tr><td>Address</td><td><textarea name="address"></textarea></td></tr>
           <tr> <td>Phone Number</td><td><input type="text" name="number"  id = "numb"> /</td></tr>
           
            <tr> <td>Email</td><td><input type="text" name="email"  /></td></tr>
            
        
           <tr><td> <input type="submit" value="Register" name="submit" /></td></tr>
           </table>
  </form>   
 </center> 			      
</body>
</html>