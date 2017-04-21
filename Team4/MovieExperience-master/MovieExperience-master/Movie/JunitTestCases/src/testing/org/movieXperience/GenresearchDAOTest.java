package org.movieXperience;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.GenresearchDAO;
import com.movie.model.Moviesearch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class GenresearchDAOTest {

	private GenresearchDAO genresearchDAO;
	
	@Before
	public void setUp() throws Exception {
		genresearchDAO = new GenresearchDAO("test");
	}

	@Test
	public void test1() {
		String searchGenre = "Action";
		List<Moviesearch> list = genresearchDAO.selectList(searchGenre);
		Assert.assertEquals(list.size(), 3);
	}
	
	@Test
	public void test2() {
		String searchGenre = "Adventure";
		List<Moviesearch> list = genresearchDAO.selectList(searchGenre);
		Assert.assertEquals(list.size(), 0);
	}

}
