package org.movieXperience.controller;

import static org.junit.Assert.*;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.movie.controller.HelloController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class HelloControllerTest {
	@InjectMocks
	private HelloController helloController;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		helloController = new HelloController();
		mockMvc=MockMvcBuilders.standaloneSetup(helloController).build();
	}

	@Test
	public void test() throws Exception{
		mockMvc.perform(post("/Theaterhomepage")).andExpect(status().isOk())
		.andExpect(view().name("Zipcode"));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void test1() throws Exception{
		mockMvc.perform(post("/homeeperience")).andExpect(status().isOk())
		.andExpect(view().name("HomeXperience"));
		
		//fail("Not yet implemented");
	}

}
