package com.galaxe.jpa.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galaxe.jpa.domain.Recipient;

public class ObjectToJson {
	
	public String objectToJson(Recipient recipient) {
		ObjectMapper obj = new ObjectMapper();
		String mapperString=null;
		try {
			mapperString = obj.writeValueAsString(recipient);
		}catch (Exception E){
			E.printStackTrace();
		}
		return mapperString;
	}
	

}
