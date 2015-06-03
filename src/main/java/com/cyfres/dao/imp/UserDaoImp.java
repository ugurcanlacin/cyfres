package com.cyfres.dao.imp;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.UserDao;
import com.cyfres.model.User;

@Transactional
public class UserDaoImp extends GenericDaoImp<User> implements UserDao {

	private SessionFactory sessionFactory;

	public User findByNick(String nick) {
		User user = null;
		String hql = "from User u where u.nick=:nick";
		user = (User) sessionFactory.getCurrentSession().createQuery(hql)
				.setParameter("nick", nick).uniqueResult();
		return user;

	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

}
