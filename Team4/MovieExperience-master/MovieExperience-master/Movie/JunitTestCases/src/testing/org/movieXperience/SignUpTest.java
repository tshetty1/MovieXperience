package org.movieXperience;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.movie.model.Signup;





public class SignUpTest {
	Signup sign;

	@Before
	public void setUp() throws Exception {
		sign = new Signup();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUsername() {
			
		sign.setEmailid("triveni@uncc.edu");
		    String Username = sign.getEmailid();
					
		assertEquals(Username,"triveni@uncc.edu");
	}

	@Test
	public void testPassword() {
			
		sign.setPassword("triv@123");
		    String Password = sign.getPassword();
					
		assertEquals(Password,"triv@123");
	}
	
	@Test
	public void testPasswordTwo() {
			
		sign.setPasswordtwo("triv@123");
		    String Password = sign.getPasswordtwo();
					
		assertEquals(Password,"triv@123");
	}
	@Test
	public void testFirstName() {
			
		sign.setFirstname("triveni");
		    String firstname = sign.getFirstname();
					
		assertEquals(firstname,"triveni");
	}
	@Test
	public void testLastName() {
			
		sign.setLastname("shetty");
		    String lastname = sign.getLastname();
					
		assertEquals(lastname,"shetty");
	}
	

}
