package com.galaxe.prescription.service;

import org.springframework.stereotype.Service;

import com.galaxe.prescription.domain.Request;

@Service
public interface PrescriptionService {
	
//	public String getAgnNumber(String groupId, String carrierId);
	
	// Trimmed down to one method
	public String getAgnString(Request request);
	
//	public String getAgnAsString(String groupId, String carrierId);

}
