package org.movieXperience;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.TheatersearchzipDAO;
import com.movie.model.Theatermoviesearch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class TheatersearchzipDAOTest {

	private TheatersearchzipDAO theatersearchzipDAO;
	private Theatermoviesearch theatermoviesearch;
	@Before
	public void setUp() throws Exception {
		theatersearchzipDAO = new TheatersearchzipDAO("test");
		theatermoviesearch = new Theatermoviesearch();
	}

	@Test
	public void test1() {
		theatermoviesearch.setEmail_id("triveni@uncc.edu");
		theatermoviesearch.setMovie_id("1");
		theatermoviesearch.setMoviename("Titanic");
		theatermoviesearch.setSearchmovie("Titanic");
		theatermoviesearch.setTheater_id("1");
		theatermoviesearch.setTheatername("CarolinaCinemas");
		theatermoviesearch.setZipcode("28262");
		theatermoviesearch.setDate("01/02/2016");
		
		List<Theatermoviesearch> list = theatersearchzipDAO.selectList(theatermoviesearch);
		/*System.out.println(list.get(0).getZipcode());
		System.out.println(theatermoviesearch.getDate());*/
		Assert.assertEquals(list.get(0).getZipcode(), theatermoviesearch.getZipcode());
	}

}
