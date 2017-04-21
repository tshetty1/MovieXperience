package com.movie.model;

public class Theatermoviesearch {
private String Zipcode;
private String email_id;
private String movie_id;
private String theater_id;
private String Date;
private String Theatername;
private String moviename;
private String Searchmovie;


public String getSearchmovie() {
	return Searchmovie;
}

public void setSearchmovie(String searchmovie) {
	Searchmovie = searchmovie;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public String getZipcode() {
	return Zipcode;
}

public void setZipcode(String zipcode) {
	Zipcode = zipcode;
}

public String getMoviename() {
	return moviename;
}

public void setMoviename(String moviename) {
	this.moviename = moviename;
}

public String getTheatername() {
	return Theatername;
}

public void setTheatername(String theatername) {
	Theatername = theatername;
}



public String getMovie_id() {
	return movie_id;
}

public void setMovie_id(String movie_id) {
	this.movie_id = movie_id;
}

public String getTheater_id() {
	return theater_id;
}

public void setTheater_id(String theater_id) {
	this.theater_id = theater_id;
}


public String getEmail_id() {
	return email_id;
}

public void setEmail_id(String email_id) {
	this.email_id = email_id;
}

}
