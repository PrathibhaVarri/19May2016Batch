<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <!--  <meta charset="utf-8"> -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Merchant Page</title>

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div width="100px"; height="1000px";>
</div>

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
                <li><a href="home"> <img alt="" width="25px" height="25px"src="/Capstore_Integration/images/Home.png"/></a> </li>
                    
                                 <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">Products<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Welcome.html" target="display_screen">Add Product</a></li>
            <li><a href="" target="display_screen">Remove Product</a></li>
            <li><a href="" target="display_screen">Track Delivery</a></li>
            <li><a href="" target="display_screen">Update</a></li>
                <li><a href="" target="display_screen">View Products</a></li>
            <li><a href="" target="display_screen">Feedback</a></li>
            </ul>
        </li>     
               
                     
                        
                    <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="">Offers<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="" target="display_screen">Discounts</a></li>
            <li><a href="" target="display_screen">Coupons</a></li>
         
           </ul>
           
        </li> 
        
 <li>   <a href="home" />Logout</a> </li>
       </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
		<div style="width:100% ; height:800px" name="display_screen">
		
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
                    <li>Copyright &copy; capgemini@capstore.com 2016</li> 
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