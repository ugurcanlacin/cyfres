package com.cyfres.service;
import org.json.simple.JSONObject;

public interface APIService {
	public JSONObject searchSeries(String name);
	public JSONObject getSeries(String seriesId);
}
