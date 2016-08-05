<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    


    <title>Customer page</title>
   <!--   <link href="/Customerhomepage/css/bootstrap.min.css" rel="stylesheet">
		<link href="/Customerhomepage/css/shop-homepage.css" rel="stylesheet"> -->
		
 	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js">
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
  
  
  </script> 


</head>
<body>
<br><br><br>
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
                <a class="navbar-brand" href="#"><font face="Dollie Script Personal Use" size="10" color="white">CapStore<!-- <img alt="" src="/CapStore/images/sogeti.jpg" width="50px" height="50px"> --></font>  </a>
            </div>




            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                   
          	<li><a href="custhomepage" target="">Home</a></li>
            <li><a href="" target="">Cart</a></li>
            
          
           
               
                                 
            <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">Hello! Customer<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="" target="">MY Profile</a></li>
            <li><a href="" target="">MY Orders</a></li>
            <li><a href="" target="">WishList</a></li>
            <li><a href="" target="">Cart</a></li>
            <li><a href="" target="">Change Password</a></li>
            <li><a href="home" target="">LogOut</a></li>
           </ul>
        </li>     
      </ul>
        </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
     <div class="container">

        <div class="row">

            <div class="col-md-3">
             <!--  <p class="lead">Category</p>-->
                <div class="list-group">
                <ul class="nav navbar-nav navbar-left">
                <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">Category<span class="caret"></span></a>
          <ul class="dropdown-menu">
          <c:if test="${! empty categories }">
					<c:forEach items="${categories}" var="cat">
						
						<li> <a href="#" class="list-group-item" onclick="${cat.categoryName}()">${cat.categoryName}</a></li>
						 
						
					</c:forEach>
			</c:if>
           
           </ul>
           
           </ul>
        
        </div>
        
        <br>
        <br>
        
   	 <a class="lead">Search By Merchants</a>
  
        <form>
				
				<p><input type="checkbox" name="merchantname" value="chaitu"/>chaitu</p>
				<p><input type="checkbox" name="merchantname" value="karthi"/>karthi</p>
				<p><input type="checkbox" name="merchantname" value="soumya"/>soumya</p>
				<p><input type="checkbox" name="merchantname" value="siddu"/>siddu</p>
				<p><input type="checkbox" name="merchantname" value="mouni"/>mouni</p>
				<p><input type="checkbox" name="merchantname" value="tulasi"/>tulasi</p>
				<p><input type="checkbox" name="merchantname" value="kiran"/>kiran</p>
				
			</form>
			 
			
			<br>
			<br>
			
			<a class="lead">Search By Ratings</a>
  
        <form>
				
				<p><input type="checkbox" name="Ratings" value="one"/>one</p>
				<p><input type="checkbox" name="Ratings" value="two"/>two</p>
				<p><input type="checkbox" name="Ratings" value="three"/>three</p>
				<p><input type="checkbox" name="Ratings" value="four"/>four</p>
				<p><input type="checkbox" name="Ratings" value="five"/>five</p>
				
				
			</form>
			
			
			<br>
			<br>
			
			<a class="lead">Sort by price</a>
  
          <ul>
               
               <a href="#" class="list-group-item" onclick="sorted()">price-LOW to HIGH</a>
              <a href="#" class="list-group-item" onclick="sorted1()">price-HIGH to LOW</a>
               </ul>
     
               
            </div>

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
                            <img src="/Capstore_Integration/images/lenovo.jpg" alt="">
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
                
                                
 <!--    /container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

   <!--  Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
</body>

</html>