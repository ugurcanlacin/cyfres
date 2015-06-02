package com.cyfres.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.SeasonDao;
import com.cyfres.model.Season;
@Transactional
public class SeasonDaoImp extends GenericDaoImp<Season> implements SeasonDao{

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
