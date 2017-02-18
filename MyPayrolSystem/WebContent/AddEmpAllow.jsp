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
            <form name="EmpAllow"  method="post"  action="AddEmpAllow" onSubmit="return validateform();">
            <table>
            <tr><td>Basic</td><td><input type="text" name="Basic"  id="Basic"/></td> </tr>
            
           <tr><td>HRA</td><td><input type="text" name="HRA"  /></td></tr>
            <tr><td>Conveyance Allowances</td><td><input type="text" name="ConveyanceAllowances"  id="ConveyanceAllowances"/></td> </tr>
            
           <tr><td>Medical Alowances</td><td><input type="text" name="MedicalAlowances"  /></td></tr>
            <tr><td>Special Allowances</td><td><input type="text" name="SpecialAllowances"  id="nameid"/></td> </tr>
            
           <tr><td>monthly_incentive</td><td><input type="text" name="MonthlyIncentive"  /></td></tr>
            <tr><td>perquisites</td><td><input type="text" name="Perquisites"  id="perquisites"/></td> </tr>
            
           <tr><td>child_edu_allow</td><td><input type="text" name="ChildEduAllow"  /></td></tr>
            <tr><td>gross</td><td><input type="text" name="Gross"  id="nameid"/></td> </tr>
            
           <tr><td>balance_forward</td><td><input type="text" name="BalanceForward"  /></td></tr>
            <tr><td>reimbursement</td><td><input type="text" name="Reimbursement"  id="Reimbursement"/></td> </tr>
            
           <tr><td>total_allow</td><td><input type="text" name="TotalAllow"  /></td></tr>
            <tr><td>month</td><td><input type="Date" name="Month"  id="Month"/></td> </tr>
            
           <tr><td>year</td><td><input type="Date" name="Year"  /></td></tr>
            <tr><td>modified_date</td><td><input type="Date" name="ModifiedDate"  id="ModifiedDate"/></td> </tr>
         	<tr><td>EmpCode</td><td><input type="text" name="EmpCode"  id="EmpCode"/></td> </tr>
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