<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Seat Selection</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <script src="ststic/js/script.js"></script>
<link rel="static/stylesheet" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<script>
   		var seats;
   		function boxDisable(t) {
   			
   			
   		    if (t.checked) {
   		    	
   		    	if(seats==null || seats==""){
   		    		seats="'"+t.value+"'"+",";
   		    	}
   		    	else{
   		    		seats=seats+"'"+t.value+"'"+",";
   		    	}
   		    	
   		    } else {
   		    	var str = "'"+t.value+"'"+",";
   		    	seats=seats.replace(str,"");
   		    	
   		    }
   		    
   		 document.selection.seats.value = seats;
   		 
   		    
   		}
   		
   		
   		</script>
      

  </head>
 
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<img alt="Bootstrap Image Preview" src="http://png.clipart.me/graphics/thumbs/102/vector-illustration-of-cinema-clap-and-film-reel_102906023.jpg" class="img-circle">
			<div class="page-header">
				<h1>
					TheatreXperience!!
				</h1>
			</div>
			<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">MovieXperience</a> 
				</div>
				
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">MyAccount</a>
						</li>
						<li>
							<a href="#">SignOut</a>
						</li>
						
						
							</ul>
					</nav>
				</div>
				
			
		</div>
	</div>
	<div class="row">
		<div class="col-md-6">
			<div class="page-header">
				<h1>
					 <small>Enjoy Free movie ticket booking!</small>
				</h1>
			</div>
			<blockquote>
				<p>
					The best online store for free movie watching.. I love it!!
				</p> 
			</blockquote>
			
			
			
			<!-- <div class="container"> -->
  <h2>Seat Selection</h2>
  <form class="form-horizontal" role="form" id = "selection" name="selection" action="/Movie/payment" method= "post">
  
  <table style="width:100%" border=yes>
  <c:forEach items = "${seat1}" var = "seats">
  <tr>
  <td>
  <h3><input type="checkbox" onclick="boxDisable(this);" name="check" value= "${seats.getSeats()}"></h3>
  </td>
  <td><h3>${seats.getSeats()}</h3></td></tr>
  </c:forEach>
  </table>
  
  <input name="seats" id="seats" type="text" readonly >
   
   
    <button type="submit" class="btn btn-default">proceed to payment</button>
  </form>
</div>
			
			
			
			
			
			<!-- close it finally -->
			</div></div>
			</body>
			</html>
			