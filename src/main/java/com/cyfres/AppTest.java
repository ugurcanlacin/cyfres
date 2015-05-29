package com.cyfres;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyfres.model.Genre;
import com.cyfres.model.User;

public class AppTest {
	private static SessionFactory sessionFactory ;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*User user = new User();

		user.setNick("testerboy");
		user.setLevel(5);
		user.setActived(true);
		user.setActivation("ajsdjfasjfuaorni");
		user.setName("test");
		user.setEmail("test@test.com");
		user.setCreationTimestamp(new Date());
		user.setPassword("password");
		session.save(user);
		*/
		
		Genre genre = new Genre();
		genre.setName("Action");
		session.save(genre);
		
		session.getTransaction().commit();
		session.close();
		context.close();
	}
}
