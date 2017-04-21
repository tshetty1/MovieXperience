<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Order Summary</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <script src="ststic/js/script.js"></script>
<link rel="static/stylesheet" href="resources/css/style.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
    

  </head>
 
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-2">
			<img alt="Bootstrap Image Preview" class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/IMPRESSIONS/multimedia/png/128/video.png" >
			</div>
			<div class="col-md-10 ">
			<div class="page-header">
				<h1>
					TheatreXperience!!
				</h1>
			</div>
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
	
	<div class="row">
		<div class="col-md-12 Absolute-Center">
	<div class="page-header">
				<h3 class="text-muted text-center">
				Booking Details
				</h3>
	</div>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
				<div class="well text-center col-md-12 col-md-offset-2">
				<div class="row ">
				<div class="col-md-12 ">
				
                      <label for="zipcode" class="col-xs-5">ZipCode :</label>
                                             <div class="col-xs-7">
                      <h3> ${Tmovie.zipcode }</h3>
                      </div>
                
                <br>
               
                      <label for="date" class="col-xs-5">Date:</label> 
                      <div class="col-xs-7">
                      <h3>${Tmovie.date }</h3>
                      </div>
                  
                  <br>
                  
                     <label for="moviename" class="col-xs-5">Movie:</label> 
                     <div class="col-xs-7">
                     <h3>${Tmovie.moviename }</h3>
                     </div>
                
                <br>
                
                      <label for="theatername" class="col-xs-5">Theater:</label> 
                      <div class="col-xs-7">
                      <h3>${Tmovie.theatername }</h3>
                     
            
                <br>
                  
                  <form class="navbar-form navbar-left" role="search" action="/Movie/Seatmap.html"  method= "post" >
					<button  value="Seatmap" class="btn btn-lg active btn-primary btn-block">
						Book seat
					</button>
					</form>
                <br>
				</div>
				</div>
				</div>
				</div>
				</div>
				</nav>
				</div>
				</div>
				
					<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
	
</body>
</html>