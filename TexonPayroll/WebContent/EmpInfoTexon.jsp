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
EmpCode : <input type="text" name="emp_code" id="emp_code">
<table id="tableContent">
<thead>
<tr>
<th>Sr No.</th><th>EmpName</th><th>city</th><th>EmpCode</th><th>Designation</th>
</tr>
</thead>
<tbody>

</tbody>
</table>
<br>
<input type="button" name="Button" onclick="ajaxCalling()" value="Button">
</center>
<script src="js/jquery-1.11.3.js" type="text/javascript"></script>
<script type="text/javascript">
function ajaxCalling(){
	var emp_code = document.getElementById("emp_code").value;
	alert(emp_code);
	 $("#tableContent").find("tr:gt(0)").remove();
	jQuery.ajax({
		url : "<%=request.getContextPath()%>/EmpListServlet",
		data : {
			"name" :emp_code,
		},
		type:"POST",
		dataType : "JSON",
		success : function(data) {
		var arr = [data];
		var j=0;
		for(var i=0;i<data.length;i++){
			j=i+1;
			jQuery('#tableContent').append('<tr><td>'+j+'</td><td>'+data[i].empName + '</td><td>'+data[i].city +'</td><td>'+data[i].emp_code + '</td><td>'+data[i].designation+'</td></tr>');
					
					
// 					+data[i].city+'</td><td>'+data[i].emp_code+'</td><td>'+data[i].designation+'</td></tr>');
		}
		}
		
});
	
}

</script>

</body>
</html>