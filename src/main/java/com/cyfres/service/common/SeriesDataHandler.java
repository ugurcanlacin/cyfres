package com.cyfres.service.common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class SeriesDataHandler {
	private int SERIES_DATA_QUANTITY = 5;
	private Map temporarySeriesMap = null;
	
	public String getCustomizedJSONData(JSONObject seriesData){
		JSONArray results = (JSONArray)seriesData.get("results");
		List  jsonList = new LinkedList();
		for (int i = 0; i < SERIES_DATA_QUANTITY; i++) {
			JSONObject serieData = (JSONObject)results.get(i);
			temporarySeriesMap = new HashMap();
			temporarySeriesMap.put("id",serieData.get("id"));
			temporarySeriesMap.put("first_air_date",serieData.get("first_air_date"));
			temporarySeriesMap.put("original_name",serieData.get("original_name"));
			temporarySeriesMap.put("poster_path",serieData.get("poster_path"));
			jsonList.add(temporarySeriesMap);
		}
		return JSONValue.toJSONString(jsonList);
	}
	
	

	
	
	
	
}
