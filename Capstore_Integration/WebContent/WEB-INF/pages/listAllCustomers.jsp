<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%System.out.println(" this is  page "); %>

<table>
		<tr>
			<th colspan="2">
				
		</th>
		</tr>

		<tr>
			<td>customerId</td>
			<td>firstName</td>
			<!-- <td>lastName</td>
			<td>eMail</td>
			<td>type</td>
			<td>DNo</td>
			<td>street</td>
			<td>state</td>
			<td>pinCode</td>
			<td>phoneNumber</td>
		
			<td>startDate</td>
			<td>endDate</td>
			<td>regFee</td>
		
			<td>Edit</td> -->
		</tr>
		
		
		<c:forEach items="${listOfCustomers}" var="c">
			<tr>
				<td>${c.getCustomerID()}</td>
			<%-- 	<td>${merchant1.getMerchantFName() }</td>
				<td>${merchant1.getMerchantLName()}</td>
				<td>${merchant1.getMerchant_Email() }</td>
				<td>${merchant1.getMerchanttype()}</td>
				<td>${merchant1.getP_MDNo() }</td>
				<td>${merchant1.getP_MStreet()}</td>
				<td>${merchant1.getP_MState()}</td>
				<td>${merchant1.getP_MPin() }</td>
				<td>${merchant1.getMerchant_contact() }</td>
			
				<td>${merchant1.getStartDate() }</td>
				<td>${merchant1.getEndDate() }</td>
				<td>${merchant1.getMerchantInt_Payment() }</td> --%>
			
				<td><a href="deleteAccount/${merchant1.getMerchantId()}">Delete</a>
					<a href="editAccount/${merchant1.getMerchantId()}">Edit</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	
	<div id="cntdiv"> </div>
</body>
</html>