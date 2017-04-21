package org.movieXperience;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.movie.model.Theatermoviesearch;

public class TheatermoviesearchTest {
	Theatermoviesearch theater;

	@Before
	public void setUp() throws Exception {
		theater = new Theatermoviesearch();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testZipcode() {
			
		theater.setZipcode("28262");
		    String zipcode = theater.getZipcode();
					
		assertEquals(zipcode,"28262");
	}
	@Test
	public void testDate() {
			
		theater.setDate("2016-01-01");
		    String date1 = theater.getDate();
					
		assertEquals(date1,"2016-01-01");
	}
	@Test
	public void testTheatername() {
			
		theater.setTheatername("RegalCinemas");
		    String theatername = theater.getTheatername();
					
		assertEquals(theatername,"RegalCinemas");
	}
	@Test
	public void testMoviename() {
			
		theater.setMoviename("Titanic");
		    String moviename = theater.getMoviename();
					
		assertEquals(moviename,"Titanic");
	}
	@Test
	public void testSearchMovie() {
			
		theater.setSearchmovie("Titanic");
		    String searchmovie = theater.getSearchmovie();
					
		assertEquals(searchmovie,"Titanic");
	}

}
