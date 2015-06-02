package com.cyfres.service.imp;

import org.springframework.transaction.annotation.Transactional;

import com.cyfres.dao.GenericDao;
import com.cyfres.dao.SeriesDao;
import com.cyfres.model.Series;
import com.cyfres.service.SeriesService;
@Transactional
public class SeriesServiceImp extends GenericServiceImp<Series> implements SeriesService{

	private SeriesDao seriesDao;
	
	
	public SeriesDao getSeriesDao() {
		return seriesDao;
	}


	public void setSeriesDao(SeriesDao seriesDao) {
		this.seriesDao = seriesDao;
	}


	@Override
	public GenericDao<Series> getDao() {
		return seriesDao;
	}

}
