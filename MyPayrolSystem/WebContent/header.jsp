<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<header class="main-header"> <!-- Logo --> 
<a href="#" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
       <span class="logo-mini"><img src="images/logo-mini.png"></span> <!-- logo for regular state and mobile devices -->
			<span class="logo-lg"> <img src="images/logo.png"></span>
		</a> <!-- Header Navbar --> 
		<nav class="navbar navbar-static-top" role="navigation"> <!-- Sidebar toggle button--> <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button"> <span class="sr-only">Toggle navigation</span>
		</a> <!-- Navbar Right Menu -->
		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<!-- Tasks Menu -->

				<!-- User Account Menu -->
				<li class="dropdown user user-menu">
					<!-- Menu Toggle Button --> 
					<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <!-- The user image in the navbar--> <img src="images/user.jpg" class="user-image" alt="User Image" /> <!-- hidden-xs hides the username on small devices so only the image appears. -->
						<span class="hidden-xs">User</span><i class="caret margin-left10"></i>
				</a>
					<ul class="dropdown-menu">
						<!-- The user image in the menu -->
						<li class="user-header"><img src="images/user.jpg"
							class="img-circle" alt="User Image" />
							<p>
								User - Additional Assistant Engineer <small>Member since
									Nov. 2015</small>
							</p></li>
						<!-- Menu Footer-->
						<li class="user-footer">
							<div class="pull-left">
								<a href="#" class="btn btn-default btn-flat">Profile</a>
							</div>
							<div class="pull-right">
								<a href="<%=request.getContextPath()%>/Logout"
									class="btn btn-default btn-flat">Sign out</a>
							</div>
						</li>
					</ul>
				</li>
				<!-- Control Sidebar Toggle Button -->

			</ul>
		</div>
		</nav> </header>
		
			<aside class="main-sidebar"> <!-- sidebar: style can be found in sidebar.less -->
		<section class="sidebar"> <!-- Sidebar user panel (optional) -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="images/user.jpg" class="img-circle" alt="User Image" />
			</div>
			<div class="pull-left info">
				<a href="#" class="employee">User</a>
				<p>Assistant Engineer</p>
			</div>
		</div>

		<!-- search form (Optional) --> <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search..." />
          <span class="input-group-btn">
          <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
          </span> </div>
      </form>--> <!-- /.search form --> <!-- Sidebar Menu -->
		<ul class="sidebar-menu"><!-- Optionally, you can add icons to the links -->
         <li class="treeview"><a href="<%=request.getContextPath()%>/dashboard.jsp"><i class="fa fa-user"></i> <span>Home</span><i class="fa fa-angle-left pull-right"></i></a>
          
        </li>
        
        <li class="treeview"><a href="#"><i class="fa fa-user"></i> <span>Masters Entry</span><i class="fa fa-angle-left pull-right"></i></a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/EmpList"><i class="fa fa-circle-o"></i>Employee Master</a></li>
            <li><a href="<%=request.getContextPath()%>/designation_master.jsp"><i class="fa fa-circle-o"></i>Designation Master</a></li>
          <li><a href="<%=request.getContextPath()%>/OfficeDisplay"><i class="fa fa-circle-o"></i>Organization Master</a></li>
          <li><a href="<%=request.getContextPath()%>/bank_master.jsp"><i class="fa fa-circle-o"></i>Bank Master</a></li>
         	<li><a href="<%=request.getContextPath()%>/da_master.jsp"><i class="fa fa-circle-o"></i>DA Master</a></li>
          </ul>
        </li>
        <li class="treeview"> <a href="#"><i class="fa fa-user-plus"></i> <span>Employee Salary Detail</span> <i class="fa fa-angle-left pull-right"></i></a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/SalaryList?s_dp_year=2015&s_dp_month=1"><i class="fa fa-circle-o"></i>Salary</a></li>
          <li><a href="<%=request.getContextPath()%>/SupplementarySalaryList?s_dp_year=2015&s_dp_month=1"><i class="fa fa-circle-o"></i>Supplementary Salary</a></li>
         	<li><a href="<%=request.getContextPath()%>/da_differance.jsp"><i class="fa fa-circle-o"></i>DA Difference</a></li>
          </ul>
        </li>
<!--         <li class="treeview"> <a href="#"><i class="fa fa-list"></i> <span>Entry View</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
<!--         <li class="treeview"> <a href="#"><i class="fa fa-files-o"></i> <span>Others Bills</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
        <li class="treeview"> <a href="#"><i class="fa fa-list-alt"></i> <span>Reports</span> <i class="fa fa-angle-left pull-right"></i></a>
          <ul class="treeview-menu">
              <li><a href="<%=request.getContextPath()%>/monthly_reports.jsp"><i class="fa fa-circle-o"></i>Monthly Reports</a></li>
            <li><a href="<%=request.getContextPath()%>/treasury_report.jsp"><i class="fa fa-circle-o"></i>Treasury Reports</a></li>
            <li><a href="<%=request.getContextPath()%>/supplementary_salary.jsp"><i class="fa fa-circle-o"></i>Supplementary Reports</a></li>
            <li><a href="<%=request.getContextPath()%>/yearly_report.jsp"><i class="fa fa-circle-o"></i>Yearly Reports</a></li>
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Yearly Reports</a></li> -->
          </ul>
        </li>
<!--         <li class="treeview"> <a href="#"><i class="fa fa-tasks"></i> <span>Admin Reports</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
<!--         <li class="treeview"> <a href="#"><i class="fa fa-server"></i> <span>Facility</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
<!--         <li class="treeview"> <a href="#"><i class="fa fa-link"></i> <span>Income Tax</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
<!--         <li class="treeview"> <a href="#"><i class="fa fa-money"></i> <span>Stipend</span> <i class="fa fa-angle-left pull-right"></i></a> -->
<!--           <ul class="treeview-menu"> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--             <li><a href="#"><i class="fa fa-circle-o"></i>Link in level 2</a></li> -->
<!--           </ul> -->
<!--         </li> -->
      </ul>
		<!-- /.sidebar-menu --> </section> <!-- /.sidebar --> </aside>
		
		
</body>
</html>