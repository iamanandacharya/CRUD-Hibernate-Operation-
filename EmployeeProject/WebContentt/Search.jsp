<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- jQuery 2.1.4 -->
<script src="js/jQuery-2.1.4.min.js" type="text/javascript"></script>
<!-- Bootstrap 3.3.2 JS -->
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/fastclick.min.js" type="text/javascript"></script>
<!-- Slimscroll -->
<script src="js/jquery.slimscroll.min.js" type="text/javascript"></script>
<!-- AdminLTE App -->
<script src="js/app.min.js" type="text/javascript"></script>
<script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/my.css" />

<style>
table th, td {
	border-collapse: collapse;
	padding: 10px;
}

th, td {
	padding: 15px;
	text-align: left;
}
</style>
</head>
<body id="main">
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<a href="Employee.jsp"><h2>Add Employee</h2></a> <a href="EmpView.jsp"><h1>View</h1></a>
		Name : <input type="text" name="name" id="Name"> <input
			type="submit" name="Button" onclick="ajaxCalling()" id="butt"
			value="Button">

		<table id="tablecontent" border="1" width="90%">
			<tbody>
				<tr>
					<th>No</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address</th>
					<th>Phone</th>
					<th>Gender</th>
					<th>Role</th>
					<th>Date Of Birth</th>
					<th>Edit</th>
					<th>Update</th>
				</tr>
			</tbody>
		</table>
		<br>
	</center>
	<script src="js/jquery-1.11.3.js" type="text/javascript"></script>

	<script type="text/javascript">


function ajaxCalling() {
var Name = document.getElementById("Name").value;

	jQuery.ajax({
		url : 'AjaxUseServlet',
		data : {
			"name" : Name,
		},
		type : 'Get',
		dataType:'JSON',
		success : function(data) {
			
			var arr = [data];
			var j = 0;
			for(var i=0;i<data.length;i++){
				
				j=i+1;
				//jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].first_name + '</td><td>'+data[i].last_name + '</td><td>'+data[i].address+ '</td><td>'+phone+ '</td><td>'+gender+ '</td><td>'+role+ '</td><td>'+date_of_birth+'</td></tr>');
				jQuery('#tablecontent').append(
						'<tr><td>' 
						+ j 
						+'</td><td>'+
						data[i].firstName 
						+'</td><td>'+
						data[i].lastName 
						+'</td><td>'+
						data[i].address
						+'</td><td>'+
						data[i].phone
						+'</td><td>'+
						data[i].gender
						+'</td><td>'+
						data[i].role 
						+'</td><td>'+
						data[i].dateOfBirth 
						+'</td></tr>');
				
			}
		}
	});

}


</script>

</body>
</html>