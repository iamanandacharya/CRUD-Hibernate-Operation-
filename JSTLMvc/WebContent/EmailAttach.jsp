<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form name="Email" action="EmailAttachServlet" method="post" enctype="multipart/form-data">  
            TO: <input type="text" name="to" size="50" required/>&nbsp;&nbsp;(Use comma(,) for multiple recipients)<br/><br/>
            CC: <input type="text" name="cc" size="50"/><br/><br/>  
            BCC: <input type="text" name="bcc" size="50"/><br/><br/>  
            Subject: <input type="text" name="subject" size="40" required><br/><br/>  
            Text:<br/><textarea rows="10" cols="70" name="msg" required></textarea><br/><br/>
            Attachment: <input type="file" name="file">
            <input type="submit" value="Send"/>&nbsp;&nbsp;<input type="reset" value="Reset"/>  
        </form>
</body>
</html>