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
							
<center><h1> <b><u>Edit Employee Details Here</u></b></h1><hr>
<form action="EmpAllwUpdateServle?sid=<%=request.getParameter("tid")%>" method="post">
<table>

			
            <tr><td>Basic</td><td><input type="text" name="Basic"  id="Basic" value="<%=session.getAttribute("Basic")%>"/></td> </tr>
            
           <tr><td>HRA</td><td><input type="text" name="HRA" value="<%=session.getAttribute("HRA")%>"  /></td></tr>
            <tr><td>Conveyance Allowances</td><td><input type="text" name="ConveyanceAllowances" value="<%=session.getAttribute("ConveyanceAllowances")%>"  id="ConveyanceAllowances"/></td> </tr>
            
           <tr><td>Medical Alowances</td><td><input type="text" name="MedicalAlowances" value="<%=session.getAttribute("MedicalAlowances")%>" /></td></tr>
            <tr><td>Special Allowances</td><td><input type="text" name="SpecialAllowances" value="<%=session.getAttribute("SpecialAllowances")%>" id="nameid"/></td> </tr>
            
           <tr><td>Monthly Incentive</td><td><input type="text" name="MonthlyIncentive" value="<%=session.getAttribute("MonthlyIncentive")%>" /></td></tr>
            <tr><td>Perquisites</td><td><input type="text" name="Perquisites" value="<%=session.getAttribute("Perquisites")%>" id="perquisites"/></td> </tr>
            
           <tr><td>Child Edu Allow</td><td><input type="text" name="ChildEduAllow" value="<%=session.getAttribute("ChildEduAllow")%>" /></td></tr>
            <tr><td>Gross</td><td><input type="text" name="Gross" value="<%=session.getAttribute("Gross")%>" id="nameid"/></td> </tr>
            
           <tr><td>Balance Forward</td><td><input type="text" name="BalanceForward" value="<%=session.getAttribute("BalanceForward")%>" /></td></tr>
            <tr><td>Reimbursement</td><td><input type="text" name="Reimbursement" value="<%=session.getAttribute("Reimbursement")%>" id="Reimbursement"/></td> </tr>
            
           <tr><td>Total Allow</td><td><input type="text" name="TotalAllow" value="<%=session.getAttribute("TotalAllow")%>" /></td></tr>
            <tr><td>Month</td><td><input type="Date" name="Month" value="<%=session.getAttribute("Month")%>" id="Month"/></td> </tr>
            
           <tr><td>Year</td><td><input type="Date" name="Year" value="<%=session.getAttribute("Year")%>"  /></td></tr>
            <tr><td>Modified Date</td><td><input type="Date" name="ModifiedDate" value="<%=session.getAttribute("ModifiedDate")%>"  id="ModifiedDate"/></td> </tr>
           <tr><td>EmpCode</td><td><input type="text" name="EmpCode" value="<%=session.getAttribute("EmpCode")%>" id="EmpCode"/></td> </tr>
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