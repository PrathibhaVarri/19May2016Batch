<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Merchant SignIN page</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>
</head>
<body>
<form:form action="saveMerchant" method="post" commandName="merchant">
</head>
<table>
		<tr>
			<th colspan="3"><h1> Merchant SignIN </h1></th>
		</tr>	
		<tr>
			<td>First Name:</td>
			<td><form:input path="MerchantFName" /></td>
			<td><form:errors path="MerchantFName" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><form:input path="MerchantLName" /></td>
			<td><form:errors path="MerchantLName" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><form:input path="Merchant_Email"/></td>
				<td><form:errors path="Merchant_Email" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:password path="Merchant_password"/></td>
				<td><form:errors path="Merchant_password" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Confirm Password:</td>
			<td><form:password path="ConfirmPassword"/></td>
				<td><form:errors path="ConfirmPassword" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Contact:</td>
			<td><form:input path="merchant_contact"/></td>
				<td><form:errors path="merchant_contact" cssClass="errMsg"></form:errors></td>
		</tr>
		
		<tr>
			<td>Choose Gender:</td>
			<td><form:select path="merchant_gender" >
				<form:option value="male">Male</form:option>
				<form:option value="female">Female</form:option>
			</form:select>
			 </td>
				<td><form:errors path="merchant_gender" cssClass="errMsg"></form:errors></td>
		</tr>
		
		<tr>
			<td>Choose type:</td>
			<td><form:select path="Merchanttype" >
				<form:option value="${1 }">merchant</form:option>
				<form:option value="${2 }">3rd party merchant</form:option>
			</form:select>
			 </td>
				<td><form:errors path="Merchanttype" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Permanant_Merchant DoorNo:</td>
			<td><form:input path="P_MDNo"/></td>
				<td><form:errors path="P_MDNo" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Permanant_Merchant Street:</td>
			<td><form:input path="P_MStreet"/></td>
				<td><form:errors path="P_MStreet" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Permanant_Merchant City:</td>
			<td><form:input path="P_MCity"/></td>
				<td><form:errors path="P_MCity" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Permanant_Merchant State:</td>
			<td><form:input path="P_MState"/></td>
				<td><form:errors path="P_MState" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Permanant_Merchant Pincode:</td>
			<td><form:input path="P_MPin"/></td>
				<td><form:errors path="P_MPin" cssClass="errMsg"></form:errors></td>
		</tr>
		
		<!-- <tr>
			<td> <input type="checkbox" name="address" value="details">tick if warehouse address is same as above address <br>
		</td>
		</tr> -->
		
		<tr>
			<td>Warehouse_Merchant Door No:</td>
			<td><form:input path="W_MDno"/></td>
				<td><form:errors path="W_MDno" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Warehouse_Merchant Street:</td>
			<td><form:input path="W_MStreet"/></td>
				<td><form:errors path="W_MStreet" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Warehouse_Merchant City:</td>
			<td><form:input path="W_MCity"/></td>
				<td><form:errors path="W_MCity" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Warehouse_Merchant State:</td>
			<td><form:input path="W_MState"/></td>
				<td><form:errors path="W_MState" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>Warehouse_Merchant Pincode:</td>
			<td><form:input path="W_MPin"/></td>
				<td><form:errors path="W_MPin" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>MerchantInt_Payment :</td>
			<td><form:input path="MerchantInt_Payment"/></td>
				<td><form:errors path="MerchantInt_Payment" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>start date:</td>
			<td><form:input path="startDate"/></td>
				<td><form:errors path="startDate" cssClass="errMsg"></form:errors></td>
		</tr>
		<tr>
			<td>end date:</td>
			<td><form:input path="endDate"/></td>
				<td><form:errors path="endDate" cssClass="errMsg"></form:errors></td>
		</tr> 
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Save"/>
			</td>
		</tr>
	</table>

</form:form>


</body>
</html>