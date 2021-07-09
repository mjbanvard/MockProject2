package com.galaxe.chanSelect.Service.Impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.chanSelect.Service.ChanSelService;
import com.galaxe.chanSelect.dao.EmailDAO;
import com.galaxe.chanSelect.dao.PhoneDAO;
import com.galaxe.chanSelect.domain.Email;
import com.galaxe.chanSelect.domain.Phone;
import com.galaxe.chanSelect.model.EmailBO;
import com.galaxe.chanSelect.model.PhoneBO;
import com.galaxe.chanSelect.utility.Mapper;

@Service
public class ChanSelServiceImpl implements ChanSelService {

	@Autowired
	EmailDAO emailDAO; 
	
	@Autowired
	PhoneDAO phoneDAO;
	
	public ChanSelServiceImpl() {};
	
	@Override
	public List<Email> getEmail(Integer memId, Date date) {
		List<Email> domainList = new ArrayList<Email>();
		//date = Date.valueOf("2001-01-01");
		List<EmailBO> modelList = emailDAO.findByMemIdAndDateOfBirth(memId, date);
		for (EmailBO ebo : modelList) {
			domainList.add(Mapper.emBoToVo(ebo));
		}
		
		return domainList;
	}

	@Override
	public List<Phone> getPhone(Integer memberId, Date date) {
		List<Phone> domainList = new ArrayList<Phone>();
		List<PhoneBO> modelList = phoneDAO.findByMemIdAndDateOfBirth(memberId, date);
		
		for (PhoneBO pBo : modelList) {
			domainList.add(Mapper.phBoToVo(pBo));
		}
		
		return domainList;
	}

}
