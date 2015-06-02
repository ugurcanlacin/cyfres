package com.cyfres.service.imp;

import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.GenericDao;
import com.cyfres.dao.GenreDao;
import com.cyfres.model.Genre;
import com.cyfres.service.GenreService;
@Transactional
public class GenreServiceImp extends GenericServiceImp<Genre> implements GenreService{

	private GenreDao genreDao;
	
	
	public GenreDao getGenreDao() {
		return genreDao;
	}


	public void setGenreDao(GenreDao genreDao) {
		this.genreDao = genreDao;
	}


	@Override
	public GenericDao<Genre> getDao() {
		return genreDao;
	}

}
