package com.cyfres.controller;

import javax.annotation.Resource;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cyfres.model.User;
import com.cyfres.service.APIService;
import com.cyfres.service.common.SeriesDataHandler;
import com.cyfres.service.imp.TMDBApiServiceImp;

@Controller
@RequestMapping("/service")
public class SeriesController {

	@Resource(name="tmdbApiServiceImp")
	APIService apiService;
	
	@Resource(name="seriesDataHandler")
	SeriesDataHandler seriesDataHandler;
	

	public APIService getApiService() {
		return apiService;
	}

	public void setApiService(APIService apiService) {
		this.apiService = apiService;
	}
	
	//id(TMDB ID), poster_path(contains tmdb image url path),series title, series first air date

	@RequestMapping(value="/search",method = RequestMethod.POST)
	public ModelAndView searchSeriesByTitle(@RequestParam String title){
		JSONObject seriesData = apiService.searchSeries(title);
		String customizedJSONData = seriesDataHandler.getCustomizedJSONData(seriesData);
		ModelAndView model = new ModelAndView("seriesByTitle");
		model.addObject("jsonresult", customizedJSONData);
		return model;
	}
	

	
	
	
	
}
