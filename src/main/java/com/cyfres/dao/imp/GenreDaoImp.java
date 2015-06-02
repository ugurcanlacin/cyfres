package com.cyfres.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.GenreDao;
import com.cyfres.model.Genre;
@Transactional
public class GenreDaoImp extends GenericDaoImp<Genre> implements GenreDao{

	private SessionFactory sessionFactory;	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory;
	}

}
