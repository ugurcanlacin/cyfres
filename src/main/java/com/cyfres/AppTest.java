package com.cyfres;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		


		
		session.getTransaction().commit();
		session.close();
		context.close();
	}

}
