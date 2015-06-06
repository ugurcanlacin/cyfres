package com.cyfres;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyfres.dao.SeriesDao;
import com.cyfres.dao.UserDao;
import com.cyfres.dao.imp.UserDaoImp;
import com.cyfres.model.Series;
import com.cyfres.model.User;
import com.cyfres.service.SeriesService;
import com.cyfres.service.imp.SeriesServiceImp;
import com.cyfres.service.imp.TMDBApiServiceImp;


public class AppTest {

	/*
	 * SESSION FACTORY
	 * */
	private static SessionFactory sessionFactory ;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * DAOs
	 * */
	
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
	/*
	 * SERVICEs
	 * */
	private static SeriesService seriesService;
	
	public static SeriesService getSeriesService() {
		return seriesService;
	}
	public static void setSeriesService(SeriesService seriesService) {
		AppTest.seriesService = seriesService;
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TMDBApiServiceImp test = new TMDBApiServiceImp();
		JSONObject seriesData = test.searchSeries("Breaking Bad");
		JSONArray results = (JSONArray)seriesData.get("results");
		JSONObject serieData = (JSONObject)results.get(0);
		
		Series series = new Series();
		series.setName(serieData.get("name").toString());
		seriesService.merge(series);
	}

}
