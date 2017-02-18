<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/mysite2.css">
<link rel="stylesheet" href="css/mysite.css">
<link href="css/empDis.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body id="main">
<header id="top">
<div id ="head">
<input id="search" type="search" name="search" placeholder="search"/>
 Anand Acharya
</div>

<nav id="menu">
	<ul>
	<li><a href="Home.jsp">Home</a></li>
	<li><a href="Home.jsp">About US </a></li>
	<li ><a href="EmpDtails.jsp" >Employee Info</a></li>
	<li ><a href="EmpAllowDetails.jsp">Employee Allowances</a></li>
	<li ><a href="EmpDedDetails.jsp">Employee Deduction</a>
	
	<li><a href="EmpSalaryDetails.jsp">Salary Detail </a></li>
	
	<li><a href="ContactForm.jsp">Contact Us </a></li>
	</ul>
</nav>	
</header>


<center><h1> <b><u>Register Here</u></b></h1><hr>
            <form name="RegForm"  method="post"  action="DemoServletForm" onSubmit="return validateform();">
            <table>
            <tr><td>EmpName</td><td><input type="text" name="EmpName"  id="nameid"/></td> </tr>
            
           <tr><td>present_add</td><td><input type="text" name="Present_add"  /></td></tr>
            <tr><td>city</td><td><input type="text" name="City"  id="nameid"/></td> </tr>
            
           <tr><td>pincode</td><td><input type="text" name="Pincode"  /></td></tr>
            <tr><td>permanant_addrss</td><td><input type="text" name="Permanant_addrss"  id="nameid"/></td> </tr>
            
           <tr><td>ph_num</td><td><input type="text" name="Ph_num"  /></td></tr>
            <tr><td>mob_num</td><td><input type="text" name="Mob_num"  id="nameid"/></td> </tr>
            
           <tr><td>blood_group</td><td><input type="text" name="Blood_group"  /></td></tr>
            <tr><td>nationality</td><td><input type="text" name="Nationality"  id="nameid"/></td> </tr>
            
           <tr><td>language_known</td><td><input type="text" name="Language_known"  /></td></tr>
            <tr><td>pan_card_num</td><td><input type="text" name="pan_card_num"  id="nameid"/></td> </tr>
            
           <tr><td>emp_type</td><td><input type="text" name="Emp_type"  /></td></tr>
            <tr><td>emp_grade</td><td><input type="text" name="Emp_grade"  id="nameid"/></td> </tr>
            
           <tr><td>emp_code</td><td><input type="text" name="Emp_code"  /></td></tr>
            <tr><td>emp_signature</td><td><input type="text" name="Emp_signature"  id="nameid"/></td> </tr>
            
           <tr><td>email</td><td><input type="text" name="Email"  /></td></tr>
            
           
           
            
        
           <tr><td> <input type="submit" value="Register" name="submit" /></td></tr>
           </table>
            <!-- REQUIRED JS SCRIPTS -->

	<!-- jQuery 2.1.4 -->
	<script src="js/jQuery-2.1.4.min.js" type="text/javascript"></script>
	<!-- Bootstrap 3.3.2 JS -->
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/fastclick.min.js" type="text/javascript"></script>
	<!-- Slimscroll -->
	<script src="js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="js/app.min.js" type="text/javascript"></script>
		</div>
	<div id="social">
			<center><label>Created By Anand Acharya</label>	</center>
		</div>
		
    
  </form>   
 </center>
</body>
</html>