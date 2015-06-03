package com.cyfres.dao;

import com.cyfres.model.User;

public interface UserDao extends GenericDao<User>{
	public User findByNick(String nick);
}
