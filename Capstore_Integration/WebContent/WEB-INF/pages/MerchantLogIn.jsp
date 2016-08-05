<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Merchant LogIn page</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>
</head>
<body>
<form:form action="mer_login" method="post" commandName="merchant">
<table>
		<tr>
			<th colspan="3"><h1> Merchant LogIN </h1></th>
		</tr>	
		<tr>
			<td>Enter EmailId:</td>
			<td><form:input path="Merchant_Email" /></td>
			<td><form:errors path="Merchant_Email" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Enter password:</td>
			<td><form:password path="Merchant_password" /></td>
			<td><form:errors path="Merchant_password" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="submit" value="LogIN"/>
			</td>
		</tr>
		</table>
	</form:form>	
</body>
</html>