<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String user=(String) session.getAttribute("user");
if(user==null ||user==""){
	response.sendRedirect("/Payroll");
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TexonGlobal | Dashboard</title>
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- Bootstrap 3.3.4 -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />

<!-- Theme style -->
<link href="css/dashboard.min.css" rel="stylesheet" type="text/css" />
  <!-- Date Picker -->
    <link href="css/datepicker3.css" rel="stylesheet" type="text/css" />
<!-- dashboard Skins.-->
<link href="css/blue.css" rel="stylesheet" type="text/css" />
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="skin-blue fixed sidebar-mini">
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
      
        <div class="col-lg-3 col-xs-6"> 
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
              <h3>&nbsp;</h3>
              <p> Employees </p>
            </div>
            <div class="icon"> <i class="ion ion-person-stalker"></i> </div>
            <a href="<%=request.getContextPath()%>/employee_list.jsp" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a></div>
<!--             <a href="employee_list.html" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a> </div> -->
        </div>
        
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6"> 
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
<!--               <h3> 53<sup style="font-size: 20px">%</sup> </h3> -->
                <h3>&nbsp;</h3>
              <p> Salary </p>
            </div>
            <div class="icon"> <i class="ion ion-cash"></i> </div>
            <a href="<%=request.getContextPath()%>/SalaryList?s_dp_year=2015&s_dp_month=1" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a></div>
<!--             <a href="employee_salary_list.html" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a> </div> -->
        </div>
        
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6"> 
          <!-- small box -->
          <div class="small-box bg-yellow">
            <div class="inner">
               <h3>&nbsp;</h3>
              <p> Reports </p>
            </div>
            <div class="icon"> <i class="ion ion-stats-bars"></i> </div>
            <a href="<%=request.getContextPath()%>/monthly_reports.jsp" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a>
<!--             <a href="monthly_reports.html" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a> -->
         </div>
        </div>
        
        <!-- ./col -->
<!--         <div class="col-lg-3 col-xs-6">  -->
<!--           small box -->
<!--           <div class="small-box bg-red"> -->
<!--             <div class="inner"> -->
<!--                <h3>&nbsp;</h3> -->
<!--               <p> Income Tax </p> -->
<!--             </div> -->
<!--             <div class="icon"> <i class="ion ion-ios-calculator"></i> </div> -->
<!--             <a href="#" class="small-box-footer"> More info <i class="fa fa-arrow-circle-right"></i> </a> </div> -->
<!--         </div> -->
        <!-- ./col --> 
        
      </div>
      <!-- Small boxes (Stat box) -->
    <div class="clearfix"></div>
    
      <div class="row">
      
      	<div class="col-md-6">
        	<div class="box box-success">
                <div class="box-header with-border">
                  <h3 class="box-title">Map</h3>
                </div><!-- /.box-header -->
                <div class="box-body no-padding">
                  <img src="images/gujarat-map.gif" width="100%">
                </div>
                </div>
        </div>
        
        <div class="col-md-6">
        	<!-- Calendar -->
              <div class="box box-solid bg-blue-gradient">
                <div class="box-header">
                  <i class="fa fa-calendar"></i>
                  <h3 class="box-title">Calendar</h3>
                  <!-- tools box -->
                  <div class="pull-right box-tools">
                    <!-- button with a dropdown -->
                    <div class="btn-group">
                      <button class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bars"></i></button>
                      <ul class="dropdown-menu pull-right" role="menu">
                        <li><a href="#">Add new event</a></li>
                        <li><a href="#">Clear events</a></li>
                        <li class="divider"></li>
                        <li><a href="#">View calendar</a></li>
                      </ul>
                    </div>
                    <button class="btn btn-primary btn-sm" data-widget="collapse"><i class="fa fa-minus"></i></button>
                    <button class="btn btn-primary btn-sm" data-widget="remove"><i class="fa fa-times"></i></button>
                  </div><!-- /. tools -->
                </div><!-- /.box-header -->
                <div class="box-body no-padding">
                  <!--The calendar -->
                  <div id="calendar" style="width: 100%"></div>
                </div><!-- /.box-body -->
                
              </div><!-- /.box -->

      </div>
      </div>
      
      
    </section>
    <!-- /.content --> 
  </div>
  <!-- /.content-wrapper --> 
  
  <!-- Main Footer -->
  <footer class="main-footer"> 
    <!-- To the right -->
    <div class="pull-right hidden-xs"> Email: contact@texonglobal.com </div>
    <!-- Default to the left --> 
    <strong>Copyright &copy; 2015 <b class="text-blue">Texon Global Pvt. Ltd. </b></strong> | All rights reserved. </footer>
</div>
<!-- ./wrapper --> 

<!-- REQUIRED JS SCRIPTS --> 

<!-- jQuery 2.1.4 --> 
<script src="js/jQuery-2.1.4.min.js" type="text/javascript"></script> 
<!-- Bootstrap 3.3.2 JS --> 
<script src="js/bootstrap.min.js" type="text/javascript"></script> 
<script src="js/fastclick.min.js" type="text/javascript"></script> 
 <!-- datepicker -->
    <script src="js/bootstrap-datepicker.js" type="text/javascript"></script>
<!-- Slimscroll --> 
<script src="js/jquery.slimscroll.min.js" type="text/javascript"></script> 

<!-- AdminLTE App --> 
<script src="js/app.min.js" type="text/javascript"></script>
<script>
 $("#calendar").datepicker();
</script>
</body>
</html>
