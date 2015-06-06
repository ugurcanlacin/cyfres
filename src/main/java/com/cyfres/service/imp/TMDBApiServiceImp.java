package com.cyfres.service.imp;

import java.io.UnsupportedEncodingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import com.cyfres.service.APIService;
import com.cyfres.service.GenericAPIService;

public class TMDBApiServiceImp extends GenericAPIService implements APIService {
	private final String url = "http://api.themoviedb.org/3/";
	private final String apiKey = "6c25857474cec385c2121e4e72f79604";
	private String workingUrl;
	
	private void setApiKey() {
		workingUrl = workingUrl + "?api_key=" + apiKey;
	}

	public JSONObject searchSeries(String name) {
		setApiUrl("search/tv");
		setApiKey();
		addKeyword("query", name);
		setUrl(workingUrl);
		String data = retrieveHttpResponse("GET", null);
		JSONObject jsonData = (JSONObject)JSONValue.parse(data);
		return jsonData;
	}
	
	private void setApiUrl(String path) {
		workingUrl = url + path;
	}

	private void addKeyword(String keyword, String value) {
		try {
			workingUrl = workingUrl + "&" + keyword + "=" + java.net.URLEncoder.encode(value, "UTF-8");
		} catch (UnsupportedEncodingException e) {}
	}

	public JSONObject getSeries(String seriesId) {
		setApiUrl("tv/" + seriesId);
		setApiKey();
		setUrl(workingUrl);
		String data = retrieveHttpResponse("GET", null);
		JSONObject jsonData = (JSONObject)JSONValue.parse(data);
		return jsonData;
	}



}
