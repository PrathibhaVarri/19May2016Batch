<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Homepage</title>
    
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<h1 align="center">Successfully logged IN! you are an Authorized User.</h1>

<!-- <a href="home"> go to home page</a> -->
<%-- <input type='<jsp:forward page="custhomepage.jsp"></jsp:forward>' > --%> 
<div class="container">
    <div class="row">    
        <div class="col-xs-8 col-xs-offset-2">
		    <div class="input-group">
               
                         
                <input type="text" class="form-control" name="x" placeholder="Search Product...">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                </span>
            </div>
        </div>
	</div>
</div>


<div align="right" >
<ul>
 <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">SignUp<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" target="" onclick="customer()">Customer</a></li>
            <li><a href="" target="">Admin</a></li>
            <li><a href="" target="">Merchant</a></li>
          <!--   <li><a href="" target="">3rd Party Merchant</a></li> -->
            </ul>
        </li>     
               
                                
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">LogIn<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="" target="">Customer</a></li>
            <li><a href="" target="">Admin</a></li>
            <li><a href="" target="">Merchant</a></li>
           <!--  <li><a href="" target="">3rd Party Merchant</a></li> -->
           </ul>
        </li> 
           
      </ul>
            </div>

 <div  class="container">

        <div class="row">

            <div class="col-md-3">
                <p class="lead">Categories</p>
             <!--    <div class="list-group"> -->
                <ul>
          
                  
                	<c:if test="${! empty categories }">
					<c:forEach items="${categories}" var="cat">
						
						<a href="#" class="list-group-item" onclick="${cat.categoryName}()">${cat.categoryName}</a>
					</c:forEach>
					
				</c:if>
              
               </ul> 
              </div>
              </div>
    </div>
              
           <!--  </div> -->


    
<div class="container">
 	<footer>
            <div class="row">
                <div class="col-lg-18">
                <ul>
                   <ul class="nav navbar-nav navbar-left">
                    <li>Copyright &copy; Your capgemini@capstore.com 2016</li> 
                   </ul>
                  
                   <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#">Helpdesk 24x7</a>
                    </li>
                    <li>
                        <a href="#">AboutUs</a>
                    </li>
                    <li>
                        <a href="#">ContactUs</a>
                    </li>
                
                </ul>
                </ul>
              
                </div>
                </div>
             </footer>
    </div>
</body>
</html>