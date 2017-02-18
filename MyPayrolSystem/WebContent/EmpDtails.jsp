<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="java.util.*" %>
<%@page import="payroll.vo.EmpListVO" %>
<%@page import="payroll.serviceempl.LoginData" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.4 -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="css/dashboard.min.css" rel="stylesheet" type="text/css" />
<!-- dashboard Skins.-->
<link href="css/blue.css" rel="stylesheet" type="text/css" />
<link href="css/empDis.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/mysite.css">
<!-- 

HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="stylesheet" href="css/mysite2.css">

<link href="css/empDis.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script type="text/javascript"> 
		
	
	
		function list(){
			window.location.href= '<%=request.getContextPath()%>/NewDetailsForm.jsp';
		}
</script>
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
<div>

</div>
<form action="<%= request.getContextPath()%>/ServletFormDetails" method ="post" name="Detailform">
<!-- <button type="button" name="submit" value="submit" onclick="list();">
</button> -->
<div id="social">

<a href="EmployeeAdd.jsp" >Add Employee Data</a>
<!-- <a href="NewDetailsForm.jsp" width="35" height="35">Show All Data</a> -->

</div>



<div id="social1">
	<div id="searchBox">
	
	Search By Emp Code<input type="text" name="search" >
		</div>

<div>
<input type="submit" value="submit" name="submit" >
</div>
</div>
<div id="alllist">
<div class="box-body table-responsive no-padding">
<table class="table table-hover">
<tbody>
 <tr> 
 <th>Sr No.</th> 
<th> Emp Name </th> 
 <th> present_add </th> 
<th> city </th> 
 <th> pincode </th> 
 <th>permanant_addrss</th> 
 <th>ph_num</th> 
 <th>mob_num</th> 
 <th>blood_group</th> 
 <th>nationality</th> 
 <th>language_known</th> 
 <th>pan_card_num</th> 
 <th>emp_type</th> 
 <th>emp_grade</th> 
 <th>emp_code</th> 
 
 <th>emp_signature</th> 
  
 </tr>
 <c:forEach var="listvalue" varStatus="i" items="${reglist}">


<tr>
<td><c:out value="${i.count}"></c:out></td>

<td>"${listvalue.empName}"</td>
<td>"${listvalue.present_add}"</td>
<td>"${listvalue.city}"</td>
<td>"${listvalue.pincode}"</td> 
<td>"${listvalue.permanant_addrss}"</td>
<td>"${listvalue.ph_num}"</td>        
<td>"${listvalue.mob_num}"</td>
<td>"${listvalue.blood_group}"</td>
<td>"${listvalue.nationality}"</td>
<td>"${listvalue.language_known}"</td> 
<td>"${listvalue.pan_card_num}"</td>
<td>"${listvalue.emp_type}"</td>       
<td>"${listvalue.emp_grade}"</td>

<td>"${listvalue.emp_code}"</td>

<td>"${listvalue.emp_signature}"</td>
    <!-- <td><a href=\"EditRegister.jsp?tid="+ ${listvalue.id}>Edit</a></td> -->
<td>
<div class="box-tools text-center">
													<%--                             <button class="btn btn-box-tool no-border padding2" onclick="edit(${listValue.empCode})"><i class="fa fa-lg fa-edit text-blue"></i></button> --%>
												
												 	<a href="EditRegister.jsp?tid=${listvalue.emp_code}">Edit</a>
													<i class="fa fa-lg fa-edit text-blue"></i>
													 </button>
													 </div>

<%-- <a href="EditRegister.jsp?tid=${listvalue.emp_code}">Edit</a> --%></td>
<td>
<div class="box-tools text-center">
													<%--                             <button class="btn btn-box-tool no-border padding2" onclick="edit(${listValue.empCode})"><i class="fa fa-lg fa-edit text-blue"></i></button> --%>
												
												 	 <a href="DeleteEmpServlet?fid=${listvalue.emp_code}">Delete</a>
													<i class="fa fa-lg fa-edit text-blue"></i>
													 </button>
													 </div>

<%--   <a href="DeleteServlet?fid=${listvalue.emp_code}">Delete</a> --%></td>


</tr>
<!-- <td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>" -->
<!-- ("<td><a href='EditRegister.jsp?sid="+ rs.getInt(1) +"'>Edit</a></td>"); -->
</c:forEach> 
 

</tbody>
</table>
</div>
</div>
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
		
    
    
    
    
    
<%--     
    
<!-- <td><a href=\"EditRegister.jsp?tid="+ ${listvalue.id}>Edit</a></td> -->
<td><a href="EditRegister.jsp?tid=${listvalue.emp_code}">Edit</a></td>
<td>  <a href="DeleteServlet?fid=${listvalue.emp_code}">Delete</a></td>


</tr>
<!-- <td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>" -->
<!-- ("<td><a href='EditRegister.jsp?sid="+ rs.getInt(1) +"'>Edit</a></td>"); -->

 
  </tr>
</tbody>
</table>
</form>
</center> --%>
</body>
</html>