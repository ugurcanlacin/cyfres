package com.cyfres.dao.imp;

import org.hibernate.SessionFactory;

import com.cyfres.dao.SeriesDao;
import com.cyfres.model.Series;

public class SeriesDaoImp extends GenericDaoImp<Series> implements SeriesDao{

	private SessionFactory sessionFactory;
	
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
