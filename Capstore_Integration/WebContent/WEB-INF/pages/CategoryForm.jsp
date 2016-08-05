<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Category</title>
<style type="text/css">
.errMsg{
	color: red;
	font-weight: bold;
	font-size: 14px;
}

</style>

</head>
<body>
<br><br>
<hr color="brown" width="1px">
<form:form action="addcategory" method="post" commandName="category" name="myForm" target="_parent">
<table align="center">
	<tr>
		<th colspan="3"></th>
	</tr>
	<tr>
		<td>Add New Category</td>
		<td><form:input path="categoryName"/></td>
		<td><form:errors path="categoryName" cssClass="errMsg"></form:errors>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" name="add" value="Add"></td>
	</tr>
	
</table>
</form:form>
<br><br>
<hr>
<h1>Existing Categories</h1>
<c:if test="${! empty categories }">
	<table align="center">
	<tr>
		<th>Category Id</th>
		<th>Category Name</th>
	</tr>
	<c:forEach items="${categories }" var="cat">
	<tr>
		<td>${cat.categoryId }</td>
		<td>${cat.categoryName }</td>
	</tr>
	
	</c:forEach>
	
	</table>
</c:if>
</body>
</html>