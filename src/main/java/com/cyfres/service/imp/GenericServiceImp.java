package com.cyfres.service.imp;

import com.cyfres.dao.GenericDao;
import com.cyfres.service.GenericService;

public abstract class GenericServiceImp<T> implements GenericService<T> {
	
	public abstract GenericDao<T> getDao();

	public void persist(T o) {
		getDao().persist(o);
	}

	public T find(Integer id) {
		return getDao().find(id);
	}

	public void update(T o) {
		getDao().update(o);
	}

	public void delete(T o) {
		getDao().delete(o);
	}

	public void merge(T o) {
		getDao().merge(o);
	}
}
