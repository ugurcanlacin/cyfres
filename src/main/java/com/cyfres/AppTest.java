package com.cyfres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyfres.model.Cast;
import com.cyfres.model.Genre;
import com.cyfres.model.Series;
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
		
		Series s = new Series();
		s.setName("Game of Thrones");
		
		Genre g = new Genre();
		g.setName("Drama");
		Genre g2 = new Genre();
		g2.setName("Fantasy");
		
		Set<Genre> genreSet = new HashSet<Genre>();
		genreSet.add(g);
		genreSet.add(g2);
		
		Cast c = new Cast();
		c.setName("Kit Harington");
		Cast c2 = new Cast();
		c2.setName("Sophie Turner");
		
		Set<Cast> castSet = new HashSet<Cast>();
		castSet.add(c);
		castSet.add(c2);
		
		s.setCast(castSet);
		s.setGenre(genreSet);
		
		session.merge(s);
		
		session.getTransaction().commit();
		session.close();
		context.close();
	}
}
