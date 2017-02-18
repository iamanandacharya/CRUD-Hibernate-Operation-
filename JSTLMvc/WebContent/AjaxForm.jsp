<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container">
<br><br><br><br><br>
<center>

<form id="formId" name="formName" method="post" action="AjaxForm">
<input type="button" id="click" name="submit" value="submit" /><br/>
<div id="content"></div>
</form>
<br><a href="Form.jsp">Add</a>
</center>

<table id="tablecontent">
<tbody>
<tr>
 <th>Sr No.</th>
  <th> Name </th> 
 <th> Password </th> 
<th> Date of Birth </th> 
 <th> Address </th> 
 <th>Phone Number</th> 
 <th>Email</th> 
</tr>
</tbody>
</table>
<br>
<script src="js/jquery-1.11.3.js" type="text/javascript"></script>

<script type="text/javascript">
var form=$('#formId');
form.submit(function (){
	$.ajax({
		type: form.attr('method'),
		url: form.attr('action'),
		
		data: form.serialize(),
		success: function (data){
			var arr = [data];
			var j = 0;
			for(var i=0;i<data.length;i++){
				
				j=i+1;
				jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].Name + '</td><td>'+data[i].Password + '</td><td>'+data[i].Date +'</td></tr>');
			}
			}
		
	});
	return false;
	
});
<%-- 
function ajaxCalling() {
	var buttons = document.getElementById("buttons").value;
	
	jQuery.ajax({
		url : '<%=request.getContextPath()%>/AjaxForm',
		
		type : 'post',
		dataType:'JSON',
		data: form.serialize(),
		success : function(data) {
			var arr = [data];
			var j = 0;
			for(var i=0;i<data.length;i++){
				
				j=i+1;
				jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].Name + '</td><td>'+data[i].Password + '</td><td>'+data[i].Date +'</td></tr>');
			}
			}
		});
	return false;
	
};

 --%></script>
</body>
</html>