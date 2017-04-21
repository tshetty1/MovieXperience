package org.movieXperience;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.LoginDAO;
import com.movie.model.Login;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class LoginDAOTest {
	private LoginDAO loginDao;
	
	@Before
	public void setUp() throws Exception {
		loginDao=new LoginDAO("test");
	}

	@Test
	public void test1() {
		Login login=new Login();
		login.setEmailid("triveni@uncc.edu");
		login.setPassword("triv@123");
		login=loginDao.selectLogin(login);
		Assert.assertEquals("triveni@uncc.edu", login.getEmailid());
		/*if((login!=null))
		{
			System.out.println("Inside Test");
			Assert.assertTrue(true);
		}
		else
			fail("SignIn Test failed!!");
		*/
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		Login login=new Login();
		login.setEmailid("deepika@uncc.edu");
		login.setPassword("deep@123");
		login=loginDao.selectLogin(login);
		Assert.assertEquals("deepika@uncc.edu", login.getEmailid());
	}

}
