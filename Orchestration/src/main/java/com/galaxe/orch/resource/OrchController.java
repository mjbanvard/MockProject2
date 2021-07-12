package com.galaxe.orch.resource;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.galaxe.orch.domain.ChannelSelectionRequest;
import com.galaxe.orch.domain.ChannelSelectionResponse;
import com.galaxe.orch.domain.ContactInfoRequest;
import com.galaxe.orch.domain.ContactInfoResponse;
import com.galaxe.orch.domain.EligibilityResponse;
import com.galaxe.orch.domain.EligibityRequest;
import com.galaxe.orch.domain.OrchRequest;
import com.galaxe.orch.domain.PrescriptionServiceRequest;
import com.galaxe.orch.domain.PrescriptionServiceResponse;
import com.galaxe.orch.domain.Recipient;
import com.galaxe.orch.service.OrchService;

@RestController
public class OrchController {

	@Autowired
	OrchService orchServ;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Object> getOrchestration(@RequestBody OrchRequest orchReq) {
		
		Recipient recipient = new Recipient();
		recipient.setId(orchReq.getId());
		recipient.setDateOfBirth(Date.valueOf(orchReq.getDateOfBirth()));
		
		recipient = buildRecipient(recipient);
		HttpStatus httpStatus = postToDispatch(recipient);
		
		return new ResponseEntity<Object>(recipient, httpStatus /*HttpStatus.OK*/);
	}
	
	public Recipient buildRecipient(Recipient recipient) {
		
//		GetNameAndMembership getNameAndMembership = new GetNameAndMembership();
//		getNameAndMembership.main(recipient);
		
		getNameAndMembership(recipient);
		getContactInfo(recipient);
		getChannelSelection(recipient);
		getPrescriptionService(recipient);
		getElegibilityService(recipient);
		postToDispatch(recipient);
		
		return recipient;
	}

	private Recipient getNameAndMembership(Recipient recipient) {
		
		Integer id = recipient.getId();
		Date dateOfBirth = recipient.getDateOfBirth();
		
		recipient.setMembership(orchServ.getMembership(id, dateOfBirth));
		recipient.setName(orchServ.getName(id, dateOfBirth));
		
		return recipient;
		
	}

//	@ResponseBody
	public Recipient getContactInfo(Recipient recipient) {
		
		final String uri = "http://localhost:1000/";
		RestTemplate rT = new RestTemplate();
		
		String groupId = recipient.getMembership().getGroup().getGroupId();
		String carrierId = recipient.getMembership().getGroup().getCarrierId();
		
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest(groupId, carrierId);
		ContactInfoResponse contactInfoResponse = new ContactInfoResponse();
		try {
			contactInfoResponse = rT.postForObject(uri, contactInfoRequest, ContactInfoResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		recipient.setAddress(contactInfoResponse.getAddress());
		
		return recipient;
	}
	
//	@ResponseBody
	public Recipient getChannelSelection(Recipient recipient) {
		
		final String uri = "http://localhost:2000/";
		RestTemplate rT = new RestTemplate();
		
		Integer id = recipient.getId();
		Date dateOfBirth = recipient.getDateOfBirth();
		
		ChannelSelectionRequest channelSelectionRequest = new ChannelSelectionRequest(id, dateOfBirth);
		ChannelSelectionResponse channelSelectionResponse = new ChannelSelectionResponse();
		try {
			channelSelectionResponse = rT.postForObject(uri, channelSelectionRequest, ChannelSelectionResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		recipient.setEmail(channelSelectionResponse.getEmail());
		recipient.setPhone(channelSelectionResponse.getPhone());
		
		return recipient;
	}
		
//	@ResponseBody
	public Recipient getPrescriptionService(Recipient recipient) {
		
		final String uri = "http://localhost:3000/";
		RestTemplate rT = new RestTemplate();
		
		Integer id = recipient.getId();
		String groupId = recipient.getMembership().getGroup().getGroupId();
		String carrierId = recipient.getMembership().getGroup().getCarrierId();
		
		PrescriptionServiceRequest prescripitionServiceRequest = new PrescriptionServiceRequest(id, groupId, carrierId);
		PrescriptionServiceResponse prescripitionServiceResponse = new PrescriptionServiceResponse();
		try {
			prescripitionServiceResponse = rT.postForObject(uri, prescripitionServiceRequest, PrescriptionServiceResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		recipient.setAgn(prescripitionServiceResponse.getAgn());
		
		return recipient;
	}
	
//	@ResponseBody
	public Recipient getElegibilityService(Recipient recipient) {
		
		final String uri = "http://localhost:4000/";
		RestTemplate rT = new RestTemplate();
		
		Integer id = recipient.getId();   
		String groupId = recipient.getMembership().getGroup().getGroupId();
		String carrierId = recipient.getMembership().getGroup().getCarrierId();
		
		EligibityRequest eligibilityRequest = new EligibityRequest(id, groupId, carrierId);
		EligibilityResponse eligibilityResponse = new EligibilityResponse();
		try {
			eligibilityResponse = rT.postForObject(uri, eligibilityRequest, EligibilityResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		recipient.setEligStatus(eligibilityResponse.isEligStatus());
		recipient.setBenefitGrp(eligibilityResponse.getBenefitGrp());
		
		return recipient;
	}
	
	public HttpStatus postToDispatch(Recipient recipient) {
	
		final String uri = "http://localhost:5000/";
		RestTemplate rT = new RestTemplate();
		
		HttpStatus response = null;
		try {
			response = rT.postForObject(uri, recipient, HttpStatus.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}

}
