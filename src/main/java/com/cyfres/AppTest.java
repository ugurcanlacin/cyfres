package com.cyfres;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyfres.dao.UserDao;
import com.cyfres.dao.imp.UserDaoImp;
import com.cyfres.model.User;


public class AppTest {

	private static SessionFactory sessionFactory ;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private static UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		User u = new User();
		u.setName("omer");
		u.setCreationTimestamp(new Date());
		u.setEmail("omer@mail.com");
		u.setPassword("pass2");
		u.setNick("nickomer");
		
		
		userDao.persist(u);
		
		session.getTransaction().commit();
		session.close();
		context.close();
	}

}
