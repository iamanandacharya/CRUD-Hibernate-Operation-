<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/mysite3.css">

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

<center>
<form action="ContacFormMailServlet" method="post" enctype="multipart/form-data">
<table>
<tr><td>Name</td><td><input type="text" name="name" > </td></tr>
<tr><td>Email</td><td><input type="text" name="email" > </td></tr>
<tr><td>Phone Number</td><td><input type="text" name="number" > </td></tr>
<tr><td>Comments</td><td><textarea name="comments"></textarea> </td></tr>
<tr><td>To</td><td><input type="text" name="to" > </td></tr>
<tr><td>CC</td><td><input type="text" name="cc" > </td></tr>
<tr><td>BCC</td><td><input type="text" name="bcc" > </td></tr>
<tr><td>Upload</td><td><input type = "file" name="fileUpload"> </td></tr>
<tr><td><input type="submit" value="send"></td></tr>
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