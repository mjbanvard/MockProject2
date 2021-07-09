package com.galaxe.chanSelect.resource;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.chanSelect.Service.ChanSelService;
import com.galaxe.chanSelect.domain.CSRequest;
import com.galaxe.chanSelect.domain.ChanResponse;
import com.galaxe.chanSelect.domain.Email;
import com.galaxe.chanSelect.domain.Phone;

@RestController
public class ChanSelController {
	
	@Autowired
	ChanSelService csService;
	
	Logger logger = LoggerFactory.getLogger(ChanSelController.class);
	
	@PostMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
//	public ResponseEntity<Object> getEmailAndPhone (@RequestBody CSRequest request) {
	public ChanResponse getEmailAndPhone (@RequestBody CSRequest request) {
				
		List<Email> eList = new ArrayList<Email>();
		List<Phone> pList = new ArrayList<Phone>();
		logger.trace("LOG: Changing json value to String");
		Date date = request.getDateOfBirth();
		
		eList = csService.getEmail(request.getId(), date);
		pList = csService.getPhone(request.getId(), date);
		
		logger.trace("LOG: Building the response.");
		ChanResponse csResponse = new ChanResponse();
		csResponse.setEmail(eList);
		csResponse.setPhone(pList);
		
//		return new ResponseEntity<Object>(cResponse, HttpStatus.OK);
		return csResponse;
		
	}

}
