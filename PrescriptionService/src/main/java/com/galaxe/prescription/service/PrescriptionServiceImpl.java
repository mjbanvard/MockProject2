package com.galaxe.prescription.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.prescription.dao.PrescriptionDAO;
import com.galaxe.prescription.domain.PrescriptionVO;
import com.galaxe.prescription.domain.Request;
import com.galaxe.prescription.model.PrescriptionBO;
import com.galaxe.prescription.utilities.Mapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("prescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {
	
	@Autowired
	PrescriptionDAO prescriptionDAO;

//	@Override
//	public String getAgnNumber(String groupId, String carrierId) {
////		List<PrescriptionBO> boNumber = scriptDAO.findAgnNumberByGroupIdAndCarrierId(groupId, carrierId);
//		List<PrescriptionBO> boNumber = prescriptionDAO.findByGroupIdAndCarrierId(groupId, carrierId);
////		PrescriptionBO agnNumber = prescriptionDAO.findByGroupIdAndCarrierId(groupId, carrierId);
//		List<PrescriptionVO> voNumber = Mapper.listBoToVo(boNumber);
//		log.trace("Inside the getAgnNumber in ServiceImpl.");
//		String agnString = "";
////		String agnString = agnNumber.getAgn();
//		for(PrescriptionVO pVo : voNumber) {
//			agnString = pVo.getAgn();
//			log.trace("did you get the agn? " + agnString);
//		}
//		return agnString;
//	}
	
	
	@Override
	public String getAgnString(Request request) {
		String agnNumber = "";
		try {
			agnNumber = prescriptionDAO.findByMemberIdAndGroupIdAndCarrierId(request.getId(), request.getGroupId(), request.getCarrierId());
		} catch(Exception e) {
			log.error("Error trying to retrieve agn: " + e.getMessage());
			e.printStackTrace();
		}
		return agnNumber;
	}

}
