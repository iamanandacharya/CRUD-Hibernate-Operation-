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
            <form name="EmpDedu"  method="post"  action="EmpDedUpdateServlet?sid=<%=request.getParameter("tid")%>" onSubmit="return validateform();">
            <table>
	
            
            
           <tr><td>Professional Tax</td><td><input type="text" name="ProfTax" value="<%=session.getAttribute("ProfTax")%>" /></td></tr>
            <tr><td>With Hold</td><td><input type="text" name="with_hold"  value="<%=session.getAttribute("with_hold")%>" id="with_hold"/></td> </tr>
            
           <tr><td>Income Tax</td><td><input type="text" name="IncomeTax"  value="<%=session.getAttribute("IncomeTax")%>" /></td></tr>
            <tr><td>Other Deduction</td><td><input type="text" name="other_deduction"  value="<%=session.getAttribute("other_deduction")%>" id="other_deduction"/></td> </tr>
            
           <tr><td>Total Deduction</td><td><input type="text" name="TotalDeduction"  value="<%=session.getAttribute("TotalDeduction")%>" /></td></tr>
            <tr><td>PF</td><td><input type="text" name="pf"  value="<%=session.getAttribute("pf")%>" id="pf"/></td> </tr>
            
         <tr><td>Month</td><td><input type="Date" name="Month"  value="<%=session.getAttribute("Month")%>" id="Month"/></td> </tr>
            
           
            <tr><td>Modified Date</td><td><input type="Date" name="ModifiedDate"  value="<%=session.getAttribute("ModifiedDate")%>" id="ModifiedDate"/></td> </tr>
        <tr><td>Year</td><td><input type="Date" name="Year"  value="<%=session.getAttribute("year")%>" /></td></tr>
         <tr><td>Emp Code</td><td><input type="text" name="emp_code"  value="<%=session.getAttribute("emp_code")%>" id="pf"/></td> </tr>
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
			<label>Social Media</label>	
		<a href="http://www.twitter.com">
		<img title="Twitter" src="images/twitter.png" alt="Twitter" width="35" height="35" /></a>
		<a href="https://plus.google.com/">
		<img title="Google+" src="images/1436664113_Google_Plus.png" alt="Google" width="35" height="35" /></a> 
		<a href="http://www.facebook.com"><img title="Facebook" src="images/facebook.png" alt="Facebook" width="35" height="35" /></a> 
		<a href="mailto:[anandacharya77@outloo.com]"><img title="Email" src="images/email.png" alt="Email" width="35" height="35" /></a>
		<a href="https://instagram.com/"><img title="instagram" src="images/1436664089_Instagram.png" alt="RSS" width="35" height="35" /></a>
		</div>
		
    
</body>
</html>