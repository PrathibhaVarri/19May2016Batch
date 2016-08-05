<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<form:form action="updatenewpassword" method="post" commandName="adminpwdchange">
<table>
<tr>
	<th colspan="2"></th>
</tr>
<tr>
	<td>Enter Current Password:</td>
	<td><form:password path="admin_password"/>
</tr>

<tr>
	<td>Enter new Password:</td>
	<td><form:password path="change_password"/>
</tr>
<tr>
	<td>Confirm new Password:</td>
	<td><form:password path="confirm_password"/>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Update" name="Update"></td>
</tr>

</table>
</form:form>
</body>
</html>