package org.movieXperience;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.TmoviesearchDAO;
import com.movie.model.Seatselection;
import com.movie.model.Theatermoviesearch;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class TmoviesearchDAOTest {
	private TmoviesearchDAO tmoviesearchDAO;
	private Theatermoviesearch theatermoviesearch;
	private Seatselection seatselection;
	
	@Before
	public void setUp() throws Exception {
		tmoviesearchDAO = new TmoviesearchDAO("test");
		theatermoviesearch = new Theatermoviesearch();
		seatselection = new Seatselection();
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
		
		List<Theatermoviesearch> list = tmoviesearchDAO.selectList(theatermoviesearch);
		/*System.out.println(list.size());
		System.out.println(list.get(0).getMoviename());*/
		Assert.assertEquals(list.get(0).getZipcode(), theatermoviesearch.getZipcode());
	}
	
	@Test
	public void test2() {
		theatermoviesearch.setEmail_id("triveni@uncc.edu");
		theatermoviesearch.setMovie_id("1");
		theatermoviesearch.setMoviename("Titanic");
		theatermoviesearch.setSearchmovie("Titanic");
		theatermoviesearch.setTheater_id("1");
		theatermoviesearch.setTheatername("CarolinaCinemas");
		theatermoviesearch.setZipcode("28262");
		theatermoviesearch.setDate("01/02/2016");
		
		List<Theatermoviesearch> list = tmoviesearchDAO.selectListTheatre(theatermoviesearch);
		/*System.out.println(list.size());
		System.out.println(list.get(0).getMoviename());*/
		Assert.assertEquals(list.get(0).getZipcode(), theatermoviesearch.getZipcode());
	}

	@Test
	public void test3() {
		theatermoviesearch.setEmail_id("triveni@uncc.edu");
		theatermoviesearch.setMovie_id("1");
		theatermoviesearch.setMoviename("Titanic");
		theatermoviesearch.setSearchmovie("Titanic");
		theatermoviesearch.setTheater_id("1");
		theatermoviesearch.setTheatername("CarolinaCinemas");
		theatermoviesearch.setZipcode("28262");
		theatermoviesearch.setDate("01/02/2016");
		
		List<Theatermoviesearch> list = tmoviesearchDAO.selectListTh(theatermoviesearch);
		/*System.out.println(list.get(0).getZipcode());
		System.out.println(theatermoviesearch.getDate());*/
		Assert.assertEquals(list.get(0).getZipcode(), theatermoviesearch.getZipcode());
	}
	
	@Test
	public void test4() {
		theatermoviesearch.setEmail_id("triveni@uncc.edu");
		theatermoviesearch.setMovie_id("1");
		theatermoviesearch.setMoviename("Titanic");
		theatermoviesearch.setSearchmovie("Titanic");
		theatermoviesearch.setTheater_id("1");
		theatermoviesearch.setTheatername("CarolinaCinemas");
		theatermoviesearch.setZipcode("28262");
		theatermoviesearch.setDate("01/02/2016");
		
		List<Theatermoviesearch> list = tmoviesearchDAO.selectListThm(theatermoviesearch);
		/*System.out.println(list.get(0).getZipcode());
		System.out.println(theatermoviesearch.getDate());*/
		Assert.assertEquals(list.get(0).getZipcode(), theatermoviesearch.getZipcode());
	}
	
	@Test
	public void test5() {
		seatselection.setCost("10");
		seatselection.setDate("01/02/2016");
		seatselection.setEmail_id("triveni@uncc.edu");
		seatselection.setMovie_id("1");
		seatselection.setSeats("1");
		seatselection.setTheater_id("1");
		
		List<Seatselection> list = tmoviesearchDAO.selectListseat(seatselection);
		/*System.out.println(list.get(0).getSeats());
		System.out.println(list.get(1).getSeats());*/
		Assert.assertNotNull(list);
		/*Assert.assertEquals(list.get(0).getSeats(),"1");
		Assert.assertEquals(list.get(1).getSeats(),"2");*/
	}
	
}
