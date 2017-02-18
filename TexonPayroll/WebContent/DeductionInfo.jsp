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
Employee id : <input type="text" name="emp_id" id="emp_id">
<table id="tableContent">
<thead>
<tr>
<th>Sr No.</th><th>EmpId</th><th>Prof.Tax</th><th>Income Tax</th><th>Other Deduction</th><th>Total Deduction</th><th>Month</th><th>Year</th><th>Modification</th><th>PF</th>
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
	var emp_id = document.getElementById("emp_id").value;
	alert(emp_id);
	jQuery.ajax({
		url : "<%=request.getContextPath()%>/Deductionservlet",
		data : {
			"name" :emp_id,
		},
		type:"POST",
		dataType : "JSON",
		success : function(data) {
		var arr = [data];
		var j=0;
		for(var i=0;i<data.length;i++){
			j=i+1;
			jQuery('#tableContent').append('<tr><td>'+j+'</td><td>'+'</td><td>'+data[i].EmpId +data[i].ProfTax +'</td><td>'+data[i].IncomeTax + '</td><td>'+data[i].OtherDeduction + '</td><td>'+data[i].TotalDeduction + '</td><td>'+data[i].Month + '</td><td>'+data[i].Year + '</td><td>'+ data[i].ModificationDate +'</td><td>'+data[i].PF+'</td></tr>');
					
					
// 					+data[i].city+'</td><td>'+data[i].emp_code+'</td><td>'+data[i].designation+'</td></tr>');
		}
		}
		
});
	
}

</script>

</body>

</html>