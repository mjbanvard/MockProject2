package com.galaxe.jpa.service;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galaxe.jpa.domain.Recipient;
import com.google.gson.Gson;



public class ObjectToJson {
	
	public String objectToJsonString(Recipient recipient) {
		ObjectMapper obj = new ObjectMapper();
		String mapperString=null;
		JSONObject mapperJSON;
		
		try {
			mapperString = obj.writeValueAsString(recipient);
		}catch (Exception E){
			E.printStackTrace();
		}
		
		return mapperString;
	}
	
	public JSONObject objectToJson(Recipient recipient) {
		
		JSONObject mapperJSON = null;
		Gson gson = new Gson();
		String jsonString = gson.toJson(recipient);
		try {
			mapperJSON = new JSONObject(jsonString);
		} catch (JSONException je) {
			je.printStackTrace();
		}
//		ObjectMapper obj = new ObjectMapper();
//		String mapperString=null;
//		JSONObject mapperJSON = null;
//		
//		try {
//			mapperString = obj.writeValueAsString(recipient);
//			mapperJSON = (JSONObject)JSONObject.stringToValue(mapperString);
//		}catch (Exception E){
//			E.printStackTrace();
//		}
//		
		return mapperJSON;
	}

}
