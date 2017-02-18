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
SaaryId : <input type="text" name="salary_id" id="salary_id">
<table id="tableContent">
<thead>
<tr>
<th>Sr No.</th><th>allow_id</th><th>emp_id</th><th>Dedu Id</th><th>Month Of Slary</th><th>year_of_salary</th><th>date_of_salary_pay</th><th>net_pay</th><th>working_days</th><th>eff_days_work</th><th>leave_id</th>
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
	var salary_id = document.getElementById("salary_id").value;
	alert(salary_id);
	jQuery.ajax({
		url : "<%=request.getContextPath()%>/SalaryTexon",
		data : {
			"name" :salary_id,
		},
		type:"POST",
		dataType : "JSON",
		success : function(data) {
		var arr = [data];
		var j=0;
		for(var i=0;i<data.length;i++){
			j=i+1;
			
			
				jQuery('#tableContent').append('<tr><td>'+j+'</td><td>'+ '</td><td>'+data[i].AllowId + '</td><td>'+data[i].EmpId +'</td><td>'+data[i].DedId + '</td><td>'+data[i].MonthOfSalary + '</td><td>'+data[i].YearOfSalary + '</td><td>'+data[i].DateOfSalaryPay + '</td><td>'+data[i].NetPay + '</td><td>'+data[i].WorkingDays + '</td><td>'+data[i].EffDaysWork +'</td><td>'+data[i].LeaveId+'</td></tr>');
					
					
// 					+data[i].city+'</td><td>'+data[i].emp_code+'</td><td>'+data[i].designation+'</td></tr>');
		}
		}
		
});
	
}
</script>
</body>
</html>