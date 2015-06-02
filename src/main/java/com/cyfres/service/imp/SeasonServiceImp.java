package com.cyfres.service.imp;

import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.GenericDao;



import com.cyfres.dao.SeasonDao;
import com.cyfres.model.Season;
import com.cyfres.service.SeasonService;


@Transactional
public class SeasonServiceImp extends GenericServiceImp<Season> implements SeasonService{

	private SeasonDao seasonDao;
	
	
	public SeasonDao getSeasonDao() {
		return seasonDao;
	}


	public void setSeasonDao(SeasonDao seasonDao) {
		this.seasonDao = seasonDao;
	}

	@Override
	public GenericDao<Season> getDao() {
		return seasonDao;
	}

}
