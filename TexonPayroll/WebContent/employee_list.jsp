<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
 <%@page import="com.texon.Dao.*" %>
<%@page import="com.texon.daolmpl.*" %> 
 <%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="java.util.*" %>
 <%@page import="com.texon.vo.EmpListVO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>TexonGlobal | Dashboard</title>
<!-- Tell the browser to be responsive to screen width -->
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

<!-- 

HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->

<script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script type="text/javascript"> 
		
		
		

		function newEmp(){
			window.location.href= '<%=request.getContextPath()%>/employee_edit.jsp';
		}
	
		function list(){
			window.location.href= '<%=request.getContextPath()%>/EmpDisplay';
		}
		
		function edit(empcode) {
			window.location.href= '<%=request.getContextPath()%>/employee_edit.jsp?emp_code='+empcode;
		}
		
	</script>

</head>

<body class="skin-blue fixed sidebar-mini" onload="EmpDisplay">
	<div class="wrapper">

 <%@ include file="/header.jsp" %>


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">

			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
				<li class="active">Here</li>
			</ol>
			</section>

			<!-- Main content -->
			<section class="content">
			<div class="row">
				<div class="col-md-12">
					<div class="box">
						<div class="box-header with-border">
							<h3 class="box-title">Employee Details</h3>

						</div>
						<!-- /.box-header -->
						<div class="row ">
							<div class="col-md-12">
								<div class="col-sm-6 pad">
									<div>
										<button type="button" onclick="newEmp();"
											class="btn btn-primary">
											<i class="fa fa-plus"></i> ADD
										</button>
									</div>
								</div>
								<div class="col-sm-6 pad">
									<div class="input-group pull-right" style="width: 150px;">
										<input type="text" name="table_search"
											class="form-control input-sm pull-right" placeholder="Search">
										<div class="input-group-btn">
											<button class="btn btn-sm btn-default">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="box-body table-responsive no-padding">
						<form action="<%=request.getContextPath()%>/EmpDisplay" method="post"> 
							<table class="table table-hover">
								<tbody>
									<tr>
										<th>Sr. No</th>
										<th>Name</th>
										<th>Employee Code</th>
										<th>Designation</th>
										<th>PAN No</th>
										<th>Account No</th>
										<th class="text-center">Edit</th>
									</tr>
									<c:forEach var="listValue" varStatus="i"
										items="${EmpList}">
										<tr>
											<td>${i.count}</td>
											<td>${listValue.empName}</td>
											<td>${listValue.emp_code}</td>
											<td>${listValue.designation}</td>
											<td>${listValue.pan_card_num}</td>
											<td>${listValue.pan_card_num}</td>
											<td>
												<div class="box-tools text-center">
													<%--                             <button class="btn btn-box-tool no-border padding2" onclick="edit(${listValue.empCode})"><i class="fa fa-lg fa-edit text-blue"></i></button> --%>
													<button class="btn btn-box-tool no-border padding2"
														onclick="edit(${i.count}-1)">
														<i class="fa fa-lg fa-edit text-blue"></i>
													</button>
												</div>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							</form>
						</div>
						<!-- /.box-body -->
						<div class="box-footer clearfix hidden">
							<div class="pull-left">
								<div class="dataTables_info" id="example1_info" role="status"
									aria-live="polite">Showing 1 to 10 of 57 entries</div>
							</div>
							<ul class="pagination pagination-sm no-margin pull-right">
								<li><a href="#">«</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<footer class="main-footer"> <!-- To the right -->
		<div class="pull-right hidden-xs">Email: contact@texonglobal.com
		</div>
		<!-- Default to the left --> <strong>Copyright &copy; 2015 <b
			class="text-blue">Texon Global Pvt. Ltd. </b></strong> | All rights reserved.
		</footer>
	</div>
	<!-- ./wrapper -->

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
	
</body>
</html>
