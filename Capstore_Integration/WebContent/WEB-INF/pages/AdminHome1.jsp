<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
<link rel="stylesheet" href="../css/capcss.css" type="text/css"> 

<style type="text/css">
#menudiv{
	color: black; 
	text-decoration: none;
	font-size: 20px;
	padding: 5px;
}
h1, h2, h3 {
	font-family: sans-serif, 'Trebuchet MS', Arial;
	font-weight: bold;
	color: blue;
}
.menu{
	margin: 5px 20px;
	padding: 5px;
	background-color: orange;
}
a {
    color:#525252;
    text-decoration:none;
}
#dropdown_nav {
    height: 35px;
    margin:0;
    padding:0;
    width:100%;
    padding:0px;
    display:inline-block;
    list-style:none;
    -moz-box-shadow:inset 0px 0px 1px #fff;
    -webkit-box-shadow:inset 0px 0px 1px #fff;
    border:1px solid #ccc;
    -moz-border-radius:5px;
    -webkit-border-radius:5px;
    background: lightgray;
}
#dropdown_nav li {
    padding-top: 4px;
    float:left;
    position:relative;
    display:inline-block;
}
#dropdown_nav li a {
    padding:12px 45px 10px 45px;
    border-right:1px solid #ccc;
}
#dropdown_nav li a:hover {
    background:#00a1e4;
    color: white;
}
#wrap	{
	width: 100%; /* Spans the width of the page */
	height: 50px; 
	margin: 0; /* Ensures there is no space between sides of the screen and the menu */
	z-index: 99; /* Makes sure that your menu remains on top of other page elements */
	position: relative; 
	background-color: #366b82;
	}
.navbar	{
	height: 50px;
    padding: 0;
	margin: 0;
	position: absolute; 
	border-right: 1px solid #54879d; 
	}
.navbar li 	{
			height: auto;
			width: 150px;  /* Each menu item is 150px wide */
			float: left;  /* This lines up the menu items horizontally */
			text-align: center;  /* All text is placed in the center of the box */
			list-style: none;  /* Removes the default styling (bullets) for the list */
			font: normal bold 12px/1.2em Arial, Verdana, Helvetica;  
			padding: 0;
			margin: 0;
			background-color: #366b82;
                        }
.navbar a	{							
		padding: 18px 0;  /* Adds a padding on the top and bottom so the text appears centered vertically */
		border-left: 1px solid #54879d; /* Creates a border in a slightly lighter shade of blue than the background.  Combined with the right border, this creates a nice effect. */
		border-right: 1px solid #1f5065; /* Creates a border in a slightly darker shade of blue than the background.  Combined with the left border, this creates a nice effect. */
		text-decoration: none;  /* Removes the default hyperlink styling. */
		color: white; /* Text color is white */
		display: block;
		}
.navbar li ul 	{
		display: none;  /* Hides the drop-down menu */
		height: auto;									
		margin: 0; /* Aligns drop-down box underneath the menu item */
		padding: 0; /* Aligns drop-down box underneath the menu item */			
		}
.navbar li:hover ul 	{
                        display: block; /* Displays the drop-down box when the menu item is hovered over */
                        }
.navbar li ul li a 	{
		border-left: 1px solid #1f5065; 
		border-right: 1px solid #1f5065; 
		border-top: 1px solid #74a3b7; 
		border-bottom: 1px solid #1f5065; 
		}
				
.navbar li ul li a:hover	{background-color: #366b82; }

#sidebar{
	float: left;
	width: 15%; 
	height: 100%; 
	margin: 0; 
	z-index: 99;
	position: relative; 
	color: white;
	padding-right: 20px;
} 
.sidemenu{
	text-align: center;
	color: white;
	font-size:15px;
	font-weight: bold;
	background-color: #366b82;
	padding: 15px;
	text-decoration: none;
} 
.sidemenu a{
	color: white;
}
#cntdiv{
	float: left;
	width: 82%;
	height: 100%;
	padding-left: 15px;
	background-color: silver;
}
 
#footer {
  position: absolute;
  bottom: 0;
  width: 98%;
  height: 40px;
  background-color: #366b82;
  
} 
.footnav-right{
	float: right;
	color: white;
	padding-right: 10px;
	padding-left: 25px;
} 
.footnav-left{
	float: left;
	color: white;
	padding-left: 10px;

}
    
</style>
<script>


      function load_category(){
    	  var xhr = new XMLHttpRequest();
    	  var url="http://localhost:8083/Capstore_Integration/createCategory";
    	    xhr.onreadystatechange = function() {
    	        if (xhr.readyState == 4) {
    	        	url=window.location.href;
    	            var data = xhr.responseText;
    	           document.getElementById('cntdiv').innerHTML=data;
    	        }
    	    };
    	    xhr.open('GET',url, true);
    	    xhr.send();
    	  /* 	var data=window.location.href
    	  	/*'<object type="type/html" data="CategoryForm.jsp" ></object>'
            document.getElementById("cntdiv").innerHTML='<object type="type/html" data=data ></object>' */
  }
      
  function load_admin(){
    	  var xhr=new XMLHttpRequest();
    	  var url="http://localhost:8083/Capstore_Integration/createAdmin";
    	  xhr.onreadystatechange = function() {
  	        if (xhr.readyState == 4) {
  	        	url=window.location.href;
  	            var data = xhr.responseText;
  	           document.getElementById('cntdiv').innerHTML=data;
  	        }
  	    };
  	  	xhr.open('GET',url, true);
	    xhr.send();
      } 
  

   function  mail(){
    	  var xhr=new XMLHttpRequest();
    	  var url="http://localhost:8083/Capstore_Integration/mail";
    	  xhr.onreadystatechange = function() {
  	        if (xhr.readyState == 4) {
  	        	url=window.location.href;
  	            var data = xhr.responseText;
  	           document.getElementById('cntdiv').innerHTML=data;
  	        }
  	    };
  	  	xhr.open('GET',url, true);
	    xhr.send();
  }
   
   function listAll(){
		var xhr = new XMLHttpRequest();
	    xhr.onreadystatechange = function() {
	        if (xhr.readyState == 4) {
	            var data = xhr.responseText;
	            document.getElementById('cntdiv').innerHTML=data;
	        }
	    };
	   
	  /*   xhr.open('GET', 'http://localhost:8083/Capstore/listAll', true); */
	     xhr.open('GET', 'http://localhost:8083/Capstore_Integration/listAll', true); 
	    xhr.send();
	}
  
   function  listAllCustomers(){
		var xhr = new XMLHttpRequest();
	    xhr.onreadystatechange = function() {
	        if (xhr.readyState == 4) {
	            var data = xhr.responseText;
	            document.getElementById('cntdiv').innerHTML=data;
	        }
	    };
	   
	  /*   xhr.open('GET', 'http://localhost:8083/Capstore/listAll', true); */
	     xhr.open('GET', 'http://localhost:8083/Capstore_Integration/listAllCustomers', true); 
	    xhr.send();
	}
   function  discount(){
		var xhr = new XMLHttpRequest();
	    xhr.onreadystatechange = function() {
	        if (xhr.readyState == 4) {
	            var data = xhr.responseText;
	            document.getElementById('cntdiv').innerHTML=data;
	        }
	    };
	   
	  /*   xhr.open('GET', 'http://localhost:8083/Capstore/listAll', true); */
	     xhr.open('GET', 'http://localhost:8083/Capstore_Integration/discount', true); 
	    xhr.send();
	}
</script>
</head>
<body >
<br>
<h1 align="center" style="font-weight: bold; font-size: 30px; color: maroon; font-family: sans-serif;">CAPSTORE</h1>
<br><br>
<div id="wrap" >
		  <ul class="navbar">
			 <li><a href="home" >Home</a></li>
			 <li><a href="#"  onclick="load_category();">Category</a>
				<!-- <ul>
				   <li><a href="#">Data Listing</a></li>
				   <li><a href="#">Web Scheduling</a></li>
				   <li><a href="#">Google Maps Application</a></li>
				</ul>   -->       
			 </li>
			 <li><a href="#" >Person</a>
				<ul>
				   <li><a href="#" target="cntdiv">Create User</a></li>
				   <li><a href="#" target="cntdiv">Activate User</a></li>
				 <!--   <li><a href="#">Ranking Report</a></li> -->
				</ul>         
			 </li>
			 <li><a href="#" onclick="load_admin()">Sub Admin</a>
				<!-- <ul>
				   <li><a href="#">Business Dashboard</a></li>
				   <li><a href="#">Web Pivot Table</a></li>
				   <li><a href="#">Interactive Report</a></li>
				   <li><a href="#">What-If Analysis</a></li>
				</ul> -->         
			 </li>
			 <li><a href="#">Product</a>
				<ul>
				   <li><a href="#" >Add Product</a></li>
				   <li><a href="#" target="cntdiv">Remove Product</a></li>
				   <li><a href="#" target="cntdiv">Update Product</a></li>
				   <li><a href="#" target="cntdiv">View All Products</a></li>
				</ul>         
			 </li>
			 <li><a href="#">Offers</a>
				<ul>
				   <li><a href="#" onclick="discount()">Discount</a></li>
				   <li><a href="#">Coupons</a></li>
				   <li><a href="#" >Promos</a></li>
				</ul>         
			 </li>
			  <li><a href="#">Mails</a>
				<ul>
				   <li><a href="#"  onclick="mail()">Compose</a></li>
				   <li><a href="#" target="cntdiv">Inbox</a></li>
				   <li><a href="#" target="cntdiv">Outbox</a></li>
				</ul>         
			 </li>
			 <li><a href="#">Profile</a>
				<ul>
				   <li><a href="changepwd" target="cntdiv">Change Password</a></li>
				   <li><a href="#" target="cntdiv">Logout</a></li>
				  <!--  <li><a href="#">Outbox</a></li> -->
				</ul>         
			 </li>
		  </ul>
</div>

<br><br><br>
<div id="sidebar">
<ul><li></li><li></li><li></li><li></li><li></li><li></li></ul>
<ul style="text-decoration: none;">
	<li class="sidemenu"><a href="#" onclick="listAllCustomers()">Customers</a></li>
</ul>
<ul>
	<li class="sidemenu"><a href="#" onclick="listAll()">Merchants</a></li>
</ul>
<ul>
	<li class="sidemenu"><a href="#" target="cntdiv">Orders</a></li>
	<li class="sidemenu"><a href="#" target="cntdiv">Refunds</a></li>
	<li class="sidemenu"><a href="#" target="cntdiv">Returns</a></li>
</ul>

<ul>
	<li class="sidemenu"><a href="#" target="cntdiv">Feedback</a></li>
</ul>

<ul>
	<li class="sidemenu"><a href="#" target="cntdiv">Business Analysis</a></li>
</ul>
</div>

<div id="cntdiv">



</div>


<div id="footer">
        <hr>
        <footer>
            <div >
            <a href="#" class="footnav-left">Copyright &copy; Capgemini@capstore.com 2016</a>
            <a href="#" class="footnav-right" target="cntdiv">Helpdesk 24x7</a>
            <a href="#" class="footnav-right" target="cntdiv">About Us</a>
            <a href="#" class="footnav-right" target="cntdiv">Contact Us</a>
                </div>
                </footer>
                </div>
</body>

</html>