package com.cyfres.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.SeriesDao;
import com.cyfres.model.Series;

@Transactional
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
