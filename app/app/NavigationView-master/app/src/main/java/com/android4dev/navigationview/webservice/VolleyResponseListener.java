package com.android4dev.navigationview.webservice;

import org.json.JSONObject;

import java.util.Map;

public interface VolleyResponseListener {
	
	public Map<String, String> OnPreExecute();
	public void OnSuccessListener(JSONObject mJsonObject);
	public void OnErrorListener(String msg);
	

}
