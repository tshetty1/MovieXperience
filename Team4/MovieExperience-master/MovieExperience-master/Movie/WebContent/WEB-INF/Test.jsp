<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Zipcode</title>

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
				</p> <small>John peter <cite>Source Title</cite></small>
			</blockquote>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
				<c:forEach items="${theatres}" var = "theater">
			<c:url value="TMtheaterlist" var="theaterlink">
			
			<%-- <c:param name="movie_id" value="${theater.movie_id}"/>--%>
			<c:param name="theater_id" value="${theater.theater_id}"/> 
				<c:param name="theatername" value="${theater.theatername}"/>
				<c:param name="moviename" value="${theater.moviename}"/>
				<c:param name="zipcode" value = "${theater.zipcode}"/>
				<c:param name="date" value="${theater.date}" />
				
			</c:url>	
			<c:import url="${theaterlink}"/>
			<a href =<c:url value="${theaterlink}"/>> ${theater.theatername}</a>
			</c:forEach>
			
			<c:forEach items = "${movies}" var = "movies">
			<c:url value="TMtheaterlist" var="movielink">
			
			<c:param name="movie_id" value="${movies.movie_id}"/>
			<%-- <c:param name="theater_id" value="${movie.theater_id}"/> --%>
				<c:param name="moviename" value="${movies.moviename}"/>
				<c:param name="theatername" value="${movies.theatername}"/>
				<c:param name="zipcode" value="${movies.zipcode}"/>
				<c:param name="date" value="${movies.date}"/>
				
			</c:url>
			<c:import url="${movielink}"/>
			<a href =<c:url value = "${movielink}"/>>${movies.moviename}</a>
			</c:forEach>
				<%-- ${TmovieTjsp} --%>
				</div>
				</nav>
				</div>
				</div>
					<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
	
</body>
</html>