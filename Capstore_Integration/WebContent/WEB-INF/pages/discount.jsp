<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discount Form</title>
<script type="text/javascript">
function lstAll(){
	
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('cnt').innerHTML=data;
        }
    };
   /*  xhr.open('GET', 'http://localhost:8087/Spring4Form/listall', true);  */
    xhr.open('GET', '../Spring4Form/listall', true);
    xhr.send();
}
</script>
</head>
<body>
<div>
<form:form action="saveDiscount" modelAttribute="saveDiscount" method="post" commandName="discount">
<table>
	<tr>
		<th colspan="3"><h1>Discount Form</h1></th>
	</tr>
	
 	<tr>
		<td>Enter ProductId :</td>
		<td><form:input path="product"/></td>
		<td><form:errors path="product"></form:errors></td>
	</tr> 
	
	<tr>
		<td>Discount Percentage:</td>
		<td><form:input path="discount_percentage"/></td>
		<td><form:errors path="discount_percentage"></form:errors></td>
	</tr>
	
	<tr>
		<td>Discount Starting date:</td>
		<td><form:input path="startDate"/></td>
		<td><form:errors path="startDate"></form:errors></td>
	</tr>
	
	<tr>
		<td>Discount Ending date:</td>
		<td><form:input path="endDate"/></td>
		<td><form:errors path="endDate"></form:errors></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Save" /></td>
		<td></td>
	</tr>

</table>
</form:form>
</div>

 <div>
<table>

		<tr>
			<th>productId</th>
			<th>Product Name</th>
		</tr>	
		<c:forEach items="${products}" var="prod">
		<tr>
			<td>${prod.productId}</td>
			<td>${prod.productName}</td>
		</tr>
		</c:forEach>
</table>
</div>

<a href="#" onclick="lstAll()">List All</a>
<div id="cnt">
</div>

</body>
</html>
