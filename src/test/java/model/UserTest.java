package model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.cyfres.model.User;

public class UserTest {
	@Test
	public void testName(){
		User user = new User();
		user.setName("name");
		assertEquals("name", user.getName());
	}

	@Test
	public void testNick(){
		User user = new User();
		user.setNick("nick");
		assertEquals("nick", user.getNick());
	}
	
	@Test
	public void testPassword(){
		User user = new User();
		user.setPassword("password");
		assertEquals("password", user.getPassword());
	}
	
	@Test
	public void testEmail(){
		User user = new User();
		user.setEmail("test@test.com");
		assertEquals("test@test.com", user.getEmail());
	}
	
	@Test
	public void testLevel(){
		User user = new User();
		Integer level = 3;
		user.setLevel(level);
		assertEquals(level, user.getLevel());
	}
	
	@Test
	public void testCreationTimestamp(){
		User user = new User();
		Date date = new Date();
		user.setCreationTimestamp(date);
		assertEquals(date, user.getCreationTimestamp());
	}
	
	@Test
	public void testActivation(){
		User user = new User();
		user.setActivation("activation");
		assertEquals("activation", user.getActivation());
	}
	
	@Test
	public void testActived(){
		User user = new User();
		user.setActived(true);
		assertEquals(true, user.isActived());
	}
	
	@Test
	public void testForgot(){
		User user = new User();
		user.setForgot(false);
		assertEquals(false, user.isForgot());
	}
}
