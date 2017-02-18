<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br><br>
<center>
Name : <input type="text" name="Name" id="name">

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
<input type="submit" name="Button" onclick="ajaxCalling()" value="Button">
</center>
<script src="js/jquery-1.11.3.js" type="text/javascript"></script>

<script type="text/javascript">
function ajaxCalling() {
	var Name = document.getElementById("name").value;

	jQuery.ajax({
		url : '<%=request.getContextPath()%>/AjaxUseServlet',
		data : {
			"name" : Name,
		},
		type : 'post',
		dataType:'JSON',
		success : function(data) {
			
			var arr = [data];
			var j = 0;
			for(var i=0;i<data.length;i++){
				
				j=i+1;
				jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].Name + '</td><td>'+data[i].Password + '</td><td>'+data[i].Date +'</td></tr>');
				}
		}
	});
}

</script>
</body>
</html>