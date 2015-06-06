package com.cyfres.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

public abstract class GenericAPIService {
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String retrieveHttpResponse(String method, ArrayList<String> parameters) {
		String data = null;
		if(method.equals("GET")) {
			data = retrieveHttpGetResponse(parameters);
		} else if (method.equals("POST")) {
			data = retrieveHttpPostResponse(parameters);
		}
		return data;
	}

	private String retrieveHttpPostResponse(ArrayList<String> parameters) {
		try {
			HttpURLConnection con = initConnection("POST");
			int responseCode = con.getResponseCode();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			if (responseCode == 200)
				return response.toString();
		} catch (IOException exception) {
		}
		return null;
	}

	private String retrieveHttpGetResponse(ArrayList<String> parameters) {
		try {
			HttpURLConnection con = initConnection("GET");
			int responseCode = con.getResponseCode();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			if (responseCode == 200)
				return response.toString();
		} catch (IOException exception) {
		}
		return null;
	}

	private HttpURLConnection initConnection(String method) throws MalformedURLException,
			IOException, ProtocolException {
		URL obj = new URL(getUrl());
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod(method);
		return con;
	}

	public String getUrl() {
		return url;
	}
}
