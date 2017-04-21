package org.movieXperience;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.movie.model.Moviesearch;


public class MoviesearchTest {
	Moviesearch movie;

	@Before
	public void setUp() throws Exception {
		movie = new Moviesearch();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMovieName() {
			
		movie.setMoviename("Titanic");
		    String Moviename = movie.getMoviename();
					
		assertEquals(Moviename,"Titanic");
	}
	
	@Test
	public void testMovieLink() {
			
		movie.setMovielink("static/video/mov_bbb.m4");
		    String MovieLink = movie.getMovielink();
					
		assertEquals(MovieLink,"static/video/mov_bbb.m4");
	}

}
