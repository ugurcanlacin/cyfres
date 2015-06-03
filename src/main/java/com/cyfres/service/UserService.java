package com.cyfres.service;

import com.cyfres.model.User;

public interface UserService extends GenericService<User>{
	public User findByNick(String nick);
}
