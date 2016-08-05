<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Customer SignIn page</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>
<script type="text/javascript">
function save() {
	alert("Hello....");
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open("GET", "http://localhost:8083/Capstore_Integration/saveCustomer", true);
    xhr.send();
}

</script>
</head>

<body>
<form:form action="saveCustomer" method="post" commandName="customer">
<table>
		<tr>
			<th colspan="3"><h1>Customer SignIN </h1></th>
		</tr>	
		<tr>
			<td>First Name:</td>
			<td><form:input path="CustomerFName" /></td>
			<td><form:errors path="CustomerFName" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><form:input path="CustomerLName" /></td>
			<td><form:errors path="CustomerLName" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><form:input path="Customer_Email"/></td>
				<td><form:errors path="Customer_Email" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:password path="CustomerPassword"/></td>
				<td><form:errors path="CustomerPassword" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Confirm Password:</td>
			<td><form:password path="ConfirmPassword"/></td>
				<td><form:errors path="ConfirmPassword" cssClass="errMsg"></form:errors></td>
		</tr>
		
		
		<tr>
			<td>Choose Gender:</td>
			<td><form:select path="Customer_Gender" >
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
			</form:select> </td>
				<td><form:errors path="Customer_Gender" cssClass="errMsg"></form:errors></td>
		</tr>
		
		<tr>
			<td>Contact:</td>
			<td><form:input path="Cust_Contact"/></td>
				<td><form:errors path="Cust_Contact" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Door No:</td>
			<td><form:input path="Cust_Dno"/></td>
				<td><form:errors path="Cust_Dno" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Street:</td>
			<td><form:input path="Cust_Street"/></td>
				<td><form:errors path="Cust_Street" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>City:</td>
			<td><form:input path="Cust_City"/></td>
				<td><form:errors path="Cust_City" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>State:</td>
			<td><form:input path="Cust_State"/></td>
				<td><form:errors path="Cust_State" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Pincode:</td>
			<td><form:input path="Cust_Pincode"/></td>
				<td><form:errors path="Cust_Pincode" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td></td>
			<td>
		<!-- 	 <a href="customerhome" onclick="save()">Save</a> -->
		<input type="submit" value="Save">
			</td>
			<td></td>
		</tr>
</table>
</form:form>
</body>
</html>
