<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="register">
<s:textfield name="Name" label="Name"> </s:textfield>
<s:password name="password" label="password"></s:password>
<s:textarea name="address" label="Address"></s:textarea>
<s:date name="date" />
<s:textfield name="email" label="Email"></s:textfield>
<s:submit label="Submit"></s:submit>

</s:form>