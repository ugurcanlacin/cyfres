package com.cyfres.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.UserDao;
import com.cyfres.model.User;

@Transactional
public class UserDaoImp extends GenericDaoImp<User> implements UserDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

}
