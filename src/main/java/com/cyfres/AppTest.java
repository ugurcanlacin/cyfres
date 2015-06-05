package com.cyfres;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyfres.dao.SeriesDao;
import com.cyfres.dao.UserDao;
import com.cyfres.dao.imp.UserDaoImp;
import com.cyfres.model.Series;
import com.cyfres.model.User;
import com.cyfres.service.TMDBConnection;


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
	
	private static SeriesDao seriesDao;
	
	public static SeriesDao getSeriesDao() {
		return seriesDao;
	}
	public static void setSeriesDao(SeriesDao seriesDao) {
		AppTest.seriesDao = seriesDao;
	}
	public static void main(String[] args) {
		TMDBConnection connection = new TMDBConnection();
		try {
			connection.sendGet();
		} catch (Exception e) {
			
		}
		
	}

}
