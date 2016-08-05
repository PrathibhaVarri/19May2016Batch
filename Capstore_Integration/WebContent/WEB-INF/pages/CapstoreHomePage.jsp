<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Homepage</title>
    
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript">
function mens() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/mens", true);
    xhr.send();
}
function womens() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/womens", true);
    xhr.send();
}
function kids() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/kids", true);
    xhr.send();
}
function homeneeds() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/homeneeds", true);
    xhr.send();
}
function Gadgets() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/Gadgets", true);
    xhr.send();
}
function sorted() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/sorted", true);
    xhr.send();
}
function sorted1() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/sorted1", true);
    xhr.send();
}

function customer() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/customer", true);
    xhr.send();
}

function custLogin() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/CustomerLogIn", true);
    xhr.send();
}

function merchant() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/merchant", true);
    xhr.send();
}

function merchantLogin() {
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/MerchantLogIn", true);
    xhr.send();
}

function admLogIn(){
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            var data = xhr.responseText;
            document.getElementById('ajax').innerHTML=data;
        }
    };
    xhr.open('GET', "http://localhost:8083/Capstore_Integration/AdminLogIn", true);
    xhr.send();
}

</script>
</head>

<body>
<br>
<br>
<br>
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
<br>
    <!-- Navigation -->
       <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><font face="Dollie Script Personal Use" size="10" color="white">CapStore</font>  </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
               
          
               
                <ul class="nav navbar-nav navbar-right">
                <li><a href=""> <img alt="" width="25px" height="25px"src="/Capstore_Integration/images/Home.png"/></a> </li>
                    
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">SignUp<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" target="" onclick="customer()">Customer</a></li>
            <li><a href="#" target="" onclick="merchant()">Merchant</a></li>
            <li><a href="" target=""></a></li>
          <!--   <li><a href="" target="">3rd Party Merchant</a></li> -->
            </ul>
        </li>     
               
                                
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">LogIn<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" target="" onclick="custLogin()">Customer</a></li>
            <li><a href="#" target="" onclick="admLogIn()">Admin</a></li> 
            <li><a href="#" target="" onclick="merchantLogin()">Merchant</a></li>
           <!--  <li><a href="" target="">3rd Party Merchant</a></li> -->
           </ul>
        </li> 
           
      </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
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
                <br>
                <p class="lead">PRICE</p>
               <ul>
               
               <a href="#" class="list-group-item" onclick="sorted()">price-LOW to HIGH</a>
              <a href="#" class="list-group-item" onclick="sorted1()">price-HIGH to LOW</a>
               </ul>
              </div>
           <!--  </div> -->


            <div id="ajax" class="col-md-9">

                <div class="row carousel-holder">

                    <div class="col-md-12">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                 <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                                <div class="item active">
                                    <img class="slide-image" src="/Capstore_Integration/images/myimg.jpg" alt="">
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="/Capstore_Integration/images/digitals1.png" alt="">
                                </div>
                               <!--  <div class="item">
                                    <img class="slide-image" src="/dynamic1/images/download.png" alt="">
                                </div> -->
                            </div>
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>
                        </div>
                    </div>

                </div>

                <div class="row">
                
                
                 <c:if test="${! empty products }">
					<c:forEach items="${products}" var="prod">
					
					
                	<div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail">
                            <img src="/Capstore_Integration/images/myimg.jpg" alt="">
                            <div class="caption">
                                <h4 class="pull-right">${prod.getPrice()}</h4>
                              <a href=""><h4> ${prod.getProductName()}</h4></a>
                                 <p class="pull-right">${prod.getQuantity()}-items</p>
                                <p>${prod.getDescription()}</p>
                               
                            </div>
                          
                        </div>
                    </div>
                
                	</c:forEach>
					
				</c:if> 
                
              </div>

            </div>

        </div>

    </div>

    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
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