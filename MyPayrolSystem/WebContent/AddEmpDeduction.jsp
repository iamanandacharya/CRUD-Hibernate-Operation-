<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/mysite2.css">
<link rel="stylesheet" href="css/mysite.css">
<link href="css/empDis.css" rel="stylesheet" type="text/css" />
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

<center><h1> <b><u>Add Employee Details Here</u></b></h1><hr>
            <form name="EmpDedu"  method="post"  action="AddEmpDeduction" onSubmit="return validateform();">
            <table>
            
            
           <tr><td>Professional Tax</td><td><input type="text" name="ProfTax"  /></td></tr>
            <tr><td>With Hold</td><td><input type="text" name="with_hold"  id="with_hold"/></td> </tr>
            
           <tr><td>Income Tax</td><td><input type="text" name="IncomeTax"  /></td></tr>
            <tr><td>Other Deduction</td><td><input type="text" name="other_deduction"  id="other_deduction"/></td> </tr>
            
           <tr><td>Total Deduction</td><td><input type="text" name="TotalDeduction"  /></td></tr>
            <tr><td>PF</td><td><input type="text" name="pf"  id="pf"/></td> </tr>
            
         <tr><td>Month</td><td><input type="Date" name="Month"  id="Month"/></td> </tr>
            
           <tr><td>Year</td><td><input type="Date" name="Year"  /></td></tr>
            <tr><td>Modified Date</td><td><input type="Date" name="ModifiedDate"  id="ModifiedDate"/></td> </tr>
        <tr><td>Emp Code</td><td><input type="text" name="emp_code"  id="pf"/></td> </tr>
           <tr><td> <input type="submit" value="Register" name="submit" /></td></tr>
           </table>
           
  </form>   
 </center>
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
		
    
</body>
</html>