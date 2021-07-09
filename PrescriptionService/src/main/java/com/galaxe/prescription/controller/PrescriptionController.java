package com.galaxe.prescription.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.prescription.domain.AgnResponse;
import com.galaxe.prescription.domain.Recipient;
import com.galaxe.prescription.domain.RecipientRequest;
import com.galaxe.prescription.domain.RecipientResponse;
import com.galaxe.prescription.domain.Request;
import com.galaxe.prescription.service.PrescriptionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PrescriptionController {
	
	@Autowired
	PrescriptionService prescriptionService;
	
//	@RequestMapping(value= "/getAgnNumber/{groupId}/{carrierId}", method= RequestMethod.POST)
//	public List<PrescriptionVO> getAgnNumber(@PathVariable("groupId") String groupId, @PathVariable("carrierId") String carrierId) {
//		List<PrescriptionVO> agnNumber = new ArrayList<PrescriptionVO>();
//		try {
//			agnNumber = prescriptionService.getAgnNumber(groupId, carrierId);
//		} catch(Exception e) {
//			System.out.println("Uh oh, there was an issue: " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("Inside the getAgnNumber method in controller.");
//		return agnNumber;
//	}
	
//	@PostMapping(value= "/", produces= MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseEntity<Object> buildMember(@RequestBody RecipientRequest recRequest) {
//		RecipientResponse recResponse = new RecipientResponse();
//		try {
//			Recipient recipient = recRequest.getRecipient();
//			String groupId = recipient.getMembership().getGroup().getGroupId();
//			String carrierId = recipient.getMembership().getGroup().getCarrierId();
//			recipient.setAgn(prescriptionService.getAgnNumber(groupId, carrierId));
//			recResponse.setRecipient(recipient);
//			log.trace("Building a recipient with agn number.");
//		} catch(Exception e) {
//			log.error("Error! " + e.getLocalizedMessage());
//		}
//		return new ResponseEntity<Object>(recResponse, HttpStatus.OK);
//	}
	
	
	@PostMapping(value= "/"/* , produces= MediaType.APPLICATION_JSON_VALUE */)
	@ResponseBody
//	public ResponseEntity<Object> getAgnNumber(@RequestBody Request request) {
	public AgnResponse getAgnNumber(@RequestBody Request request) {
//	public String getAgnNumber(@RequestBody Request request) {
		AgnResponse response = new AgnResponse();
		String agnNumber = "";
		try {
			agnNumber = prescriptionService.getAgnString(request);
			response.setAgn(agnNumber);
			log.trace("grabbing the agn number as a String.");
		} catch(Exception e) {
			log.error("Error! " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		
//		return new ResponseEntity<Object>(response, HttpStatus.OK);
//		return response;
		return response;
	}

}
