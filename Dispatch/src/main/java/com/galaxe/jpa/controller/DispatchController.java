package com.galaxe.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.jpa.domain.DispatchVO;
import com.galaxe.jpa.domain.Recipient;
import com.galaxe.jpa.domain.RecipientRequest;
import com.galaxe.jpa.service.DispatchService;
import com.galaxe.jpa.service.ObjectToJson;

@RestController
public class DispatchController {
	@Autowired
	DispatchService ds;
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
//	public ResponseEntity<Object> getSaveRequest(@RequestBody RecipientRequest resRequest) {
	public HttpStatus getSaveRequest(@RequestBody Recipient recipient) {
	
		DispatchVO dispatch = new DispatchVO();
		ObjectToJson otj = new ObjectToJson();
		HttpStatus httpStatus = null;
		String request = otj.objectToJson(recipient);
		
		dispatch.setRequest(request);	
		dispatch.setId(recipient.getId());
//		dispatch.setRequest(recipient.toString());
		
		try {
			ds.getSaveRequest(dispatch);
			httpStatus = HttpStatus.ALREADY_REPORTED;
		}
		catch(Exception e) {
			e.printStackTrace();
			httpStatus = HttpStatus.I_AM_A_TEAPOT;
		}
//		return new ResponseEntity<Object>(null,HttpStatus.OK);
		return httpStatus;
		
		
	}

}
