package org.movieXperience;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.SearchmovieDAO;
import com.movie.model.Moviesearch;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class SearchmovieDAOTest {

	private SearchmovieDAO searchmovieDAO;
	
	@Before
	public void setUp() throws Exception {
		searchmovieDAO = new SearchmovieDAO("test");
	}

	@Test
	public void test1() {
		String searchmovie = "Titanic";
		List<Moviesearch> list = searchmovieDAO.selectList(searchmovie);
		Assert.assertEquals(list.size(),4);
		
	}
	
	@Test
	public void test2() {
		String searchmovie = "ABCD";
		List<Moviesearch> list = searchmovieDAO.selectList(searchmovie);
		Assert.assertEquals(list.size(),0);
	}

}
