<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>TexonGlobal | Log in</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.4 -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="css/dashboard.min.css" rel="stylesheet" type="text/css" />
<%
 String message= null;
 %>
</head>
<body class="login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="#"><img src="images/logo-main.png"></a>
		</div>
		
		<!-- /.login-logo -->
		<div class="login-box-body" id="payroll_login"> <p class="login-box-msg">Sign in</p>
			<form action="<%=request.getContextPath()%>/LoginServlet" method="post" class="margin-bottom10">
				<b> <%   message=(String)request.getAttribute("msg");
                    if(message!=null){   %> <h5> <label style="color: red"><%=message %></label> </h5> <%} %>
				</b>
				<div class="form-group has-feedback"> <input type="text" name="user_name" class="form-control" placeholder="User Id" required /> <span class="glyphicon glyphicon-user form-control-feedback"></span> </div>
				<div class="form-group has-feedback"> <input type="password" name="user_password" class="form-control" placeholder="Password" required /> <span class="glyphicon glyphicon-lock form-control-feedback"></span> </div>
				<div class="row"> 
				   <div class="col-xs-8"> 
				      <div class="checkbox"> <label> <input type="checkbox"> Remember Me </label> </div> 
				    </div>
					<div class="col-xs-4"> <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button> </div>
				</div>
			</form>
			<div class=""> <a href="forgot-password.html">I forgot my password</a> <a href="register.html" class="text-center pull-right">Register a new membership</a> </div>
		</div>
		<div class="lockscreen-footer text-center"> Copyright &copy; 2015 <b class="text-blue">Texon Global Pvt. Ltd. </b><br /> All rights reserved </div>
	</div>
	
	
	
	<script src="js/jQuery-2.1.4.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script type='text/javascript' id='target'>; 
	var _glc ='36a7211a_a525_41de_a757_2aa0383f0631';
	var glcpath = (('https:' == document.location.protocol) ? 'https://demo.weblychat.com:8080/' :'http://192.168.1.119/');
	var glcspt = document.createElement('script'); 
	glcspt.type = 'text/javascript';glcspt.async = true;
	glcspt.src = glcpath + 'ClickToChat/js/App_weblychat.js';
	var s = document.getElementById('target');
	s.parentNode.insertBefore(glcspt,s)
	</script>
</body>
</body>
</html>