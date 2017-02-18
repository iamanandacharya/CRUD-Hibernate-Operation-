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
<input type="submit" name="Button" onclick="ajaxCalling()" value="Button" id = "buttons">
<br><a href="Form.jsp">Add</a>
</center>
<script src="js/jquery-1.11.3.js" type="text/javascript"></script>

<script type="text/javascript">
function ajaxCalling() {
	var buttons = document.getElementById("buttons").value;
	
	jQuery.ajax({
		url : "<%=request.getContextPath()%>/AjaxForm",
		
		type : "post",
		dataType:"JSON",
		success : function() {
			
		
			
				jQuery('#tablecontent').append('<tr><td>' + 
						"<%=session.getAttribute("name")%>" + 
						'</td><td>'+
						"<%=session.getAttribute("password")%>" + 
						'</td><td>'+"<%=session.getAttribute("date")%>" + 
						'</td><td>'+"<%=session.getAttribute("address")%>" + 
						'</td><td>'+ "<%=session.getAttribute("phoneNumber")%>"+
						'</td><td>'+"<%=session.getAttribute("email")%>"+
						'</td></tr>');
			
				
				
		}
	});
}

</script>
</body>
</html>