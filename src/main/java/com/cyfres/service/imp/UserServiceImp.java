package com.cyfres.service.imp;

import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.GenericDao;
import com.cyfres.dao.UserDao;
import com.cyfres.model.User;
import com.cyfres.service.UserService;

@Transactional
public class UserServiceImp extends GenericServiceImp<User> implements UserService {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public GenericDao<User> getDao() {
		return userDao;
	}

	public User findByNick(String nick) {
		return userDao.findByNick(nick);
	}

}
