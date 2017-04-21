package org.movieXperience;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.movie.model.Login;;


public class LoginTest {
	Login login;

	@Before
	public void setUp() throws Exception {
		login = new Login();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUsername() {
			
		login.setEmailid("triveni@uncc.edu");
		    String Username = login.getEmailid();
					
		assertEquals(Username,"triveni@uncc.edu");
	}

	@Test
	public void testPassword() {
			
		login.setPassword("triv@123");
		    String Password = login.getPassword();
					
		assertEquals(Password,"triv@123");
	}
}
