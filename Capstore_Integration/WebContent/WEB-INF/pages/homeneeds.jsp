<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>footware</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
                
                
                 <c:if test="${! empty products4 }">
					<c:forEach items="${products4}" var="prod4">
					
					
                	<div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail">
                            <img src="/Capstore_Integration/images/digitals1.png" alt="">
                            <div class="caption">
                                <h4 class="pull-right">${prod4.getPrice()}</h4>
                                <h4> ${prod4.getProductName()}   </h4>
                                 <p class="pull-right">${prod4.getQuantity()}-items</p>
                                <p>${prod4.getDescription()}</p>
                               
                            </div>
                          
                        </div>
                    </div>
                
                	</c:forEach>
					
				</c:if> 
                
              </div>
</body>
</html>