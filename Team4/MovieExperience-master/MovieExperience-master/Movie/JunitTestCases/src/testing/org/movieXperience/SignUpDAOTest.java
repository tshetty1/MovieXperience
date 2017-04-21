package org.movieXperience;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movie.dao.MyBatisConnectionFactory;
import com.movie.dao.SignUpDAO;
import com.movie.model.Signup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-dispatcher-servlet.xml"})

public class SignUpDAOTest {
	private SignUpDAO signUpDAO;
	private SqlSessionFactory sqlSessionFactory; 
	private Signup signUp;
	
	@Before
	public void setUp() throws Exception {
		signUpDAO = new SignUpDAO("test");
		sqlSessionFactory = new MyBatisConnectionFactory("test").getSqlSessionFactory();
		signUp = new Signup();
	}
	
	

	@Test
	public void test1() {
		
		signUp.setEmailid("Dummy@uncc.edu");
		signUp.setFirstname("Dummy");
		signUp.setLastname("Dummy");
		signUp.setPassword("dummy@123");
		signUp.setPasswordtwo("dummy@123");
		signUpDAO.insert(signUp);
		
		
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			String emaildId = signUp.getEmailid();
			Signup signUpResult = (Signup) session.selectOne("SignUp.getinsert",emaildId);
			Assert.assertEquals(signUpResult.getEmailid(), signUp.getEmailid());
		} finally {
			session.close();
		}
		/*Assert.assertTrue(true);*/
	}
	@After
	public void tearDown() throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		try {
			session.delete("SignUp.deleteById",signUp.getEmailid());
			session.commit();
		} finally {
			session.close();
		}
	}
}
