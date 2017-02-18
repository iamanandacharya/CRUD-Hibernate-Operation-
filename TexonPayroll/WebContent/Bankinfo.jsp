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
Bank Name : <input type="text" name="bankName" id="bankName">
<table id="tablecontent">
<thead>
<tr>
 <th>Sr No.</th><th> BankName</th><th> Bank Account Number</th> <th> Bank Account Type </th> <th>Bank Address </th> <th>Branch Name</th>  <th>Mode of Payment</th> 
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
function ajaxCalling() {
	var bankName = document.getElementById("bankName").value;
	alert(bankName);
	jQuery.ajax({
		url:"<%=request.getContextPath()%>/BankListServlet",
		data : {
			"name" : bankName,
		},
		type : "post",
		dataType:"JSON",
		success : function(data) {
			
			var arr = [data];
			var j = 0;
			for(var i=0;i<data.length;i++){
				
				j=i+1;
				jQuery('#tablecontent').append('<tr><td>' + j +'</td><td>'+data[i].bankName + '</td><td>'+data[i].bankAccNum + '</td><td>'+data[i].bankAccType + '</td><td>'+data[i].bankAddress + '</td><td>'+data[i].branchName + '</td><td>'+data[i].modeOfPay+'</td></tr>');
			}
		}
	});
}

</script>
</body>
</html>