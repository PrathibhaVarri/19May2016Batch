<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Admin</title>
<style type="text/css">
.errMsg{
	color: red;
	font-weight: bold;
	font-size: 14px;
}
#cntdiv{
	float: left;
	width: 82%;
	height: 100%;
	padding-left: 15px;
	background-color: silver;
}

</style>
<script type="text/javascript">

function load_addadmin(){
	  var xhr=new XMLHttpRequest();
	  var url="http://localhost:8085/FinalProject_CapStore/addAdmin";
	  xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
        	url=window.location.href;
            var data = xhr.responseText;
           document.getElementById('cntdiv').innerHTML=data;
        }
    };
  	xhr.open('GET',url, true);
  xhr.send();
}

</script>
</head>
<body>
<form:form action="addAdmin" method="post" commandName="admin" target="_parent">
<fieldset><legend>Admin Details</legend>
<table>
<tr>
	<th colspan="3">New Admin Details</th>
</tr>
<tr>
	<td>First Name:</td>
	<td><form:input path="adminFname"/></td>
	<td><form:errors path="adminFname" cssClass="errMsg"></form:errors>
</tr>
<tr>
	<td>Last Name:</td>
	<td><form:input path="adminLname"/></td>
	<td><form:errors path="adminLname" cssClass="errMsg"></form:errors>
</tr>
<tr>
	<td>Email Id:</td>
	<td><form:input path="admin_Email"/></td>
	<td><form:errors path="admin_Email" cssClass="errMsg"></form:errors>
</tr>
<tr>
	<td>Enter Password:</td>
	<td><form:password path="admin_password"/></td>
	<td><form:errors path="admin_password" cssClass="errMsg"></form:errors>
</tr>
<tr>
	<td>Confirm Password:</td>
	<td><form:password path="confirm_password"/></td>
	<td><form:errors path="confirm_password" cssClass="errMsg"></form:errors>
</tr>
<tr>
	<td></td>
	<td><input type="Submit" value="Submit" name="Submit" onclick="load_addadmin();"></td>
</tr>

</table>
</fieldset>
</form:form>
<div id="cntdiv">




</div>
<br><hr>

</body>
</html>