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
<th>Sr No.</th><th>emp_id</th><th>basic</th><th>HRA</th><th>convey_allow</th><th>medical_allow</th><th>special_allow</th><th>monthly_incentive</th><th>perquisites</th><th>child_edu_allow</th><th>gross</th><th>balance_forward</th><th>reimbursement</th><th>total_allow</th><th>month</th><th>year</th><th>modified_date</th>
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
		url : "<%=request.getContextPath()%>/DemoLsit",
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
			
			
				jQuery('#tableContent').append('<tr><td>'+j+'</td><td>'+ '</td><td>'+data[i].Empid + data[i].Basic + '</td><td>'+data[i].Hra +'</td><td>'+data[i].ConveyAllow + '</td><td>'+data[i].MedicalAllow + '</td><td>'+data[i].SpecialAllow + '</td><td>'+data[i].MonthlyIncentive + '</td><td>'+data[i].Perquisites + '</td><td>'+data[i].ChildEduAllow + '</td><td>'+data[i].Gross +  '</td><td>'+data[i].BalanceForward +  '</td><td>'+data[i].Reimbursement +  '</td><td>'+data[i].Totalallow + '</td><td>'+data[i].month +'</td><td>'+data[i].year + '</td><td>'+data[i].ModiDate+'</td></tr>');
					
					
// 					+data[i].city+'</td><td>'+data[i].emp_code+'</td><td>'+data[i].designation+'</td></tr>');
		}
		}
		
});
	
}

</script>
<!-- <script src="js/jquery-1.11.3.js" type="text/javascript"></script>
<script type="text/javascript">
function ajaxCalling(){
	var emp_id = document.getElementById("emp_id").value;
	alert(emp_id);
	jQuery.ajax({
		url : "<%=request.getContextPath()%>/AllowancesServlet",
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
			jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].AllowId + '</td><td>'+data[i].Empid + '</td><td>'+data[i].Basic + '</td><td>'+ data[i].Hra + '</td><td>'+data[i].ConveyAllow +'</td><td>'+data[i].MedicalAllow + '</td><td>'+data[i].SpecialAllow + '</td><td>'+data[i].MonthlyIncentive + '</td><td>'+data[i].Gross + '</td><td>'+data[i].Gross + '</td><td>'+data[i].BalanceForward + '</td><td>'+data[i].Reimbursement + +'</td><td>'+data[i].ChildAllow + '</td><td>'+data[i].Totalallow + '</td><td>'+data[i].year + '</td><td>'+data[i].month + '</td><td>'+data[i].ModiDate+'</td></tr>');
			alert(emp_id);
					
// 					+data[i].city+'</td><td>'+data[i].emp_code+'</td><td>'+data[i].designation+'</td></tr>');
		}
		}
		
});
	
}

</script>
 -->

</body>
</html>