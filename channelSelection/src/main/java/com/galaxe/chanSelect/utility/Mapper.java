package com.galaxe.chanSelect.utility;

import com.galaxe.chanSelect.domain.Email;
import com.galaxe.chanSelect.domain.Phone;
import com.galaxe.chanSelect.model.EmailBO;
import com.galaxe.chanSelect.model.PhoneBO;

public class Mapper {
	
	Mapper(){}
	
	public static Email emBoToVo(EmailBO eBo) {
		Email eVo = new Email();
		eVo.setAddress(eBo.getMemEmail());
		eVo.setUndeliverable(eBo.isUndeliverable());
		return eVo;
	}

	public static Phone phBoToVo(PhoneBO pBo) {
		Phone pVo = new Phone();
		pVo.setBestTimeToCall(pBo.getBestTimeToCall());
		pVo.setNumber(pBo.getMemPhone());
		pVo.setCountryCallingCode(pBo.getCountryCallingCode());
		pVo.setExtension(pVo.getExtension());
		pVo.setPhoneType(pBo.getPhoneType());
		return pVo;
	}
}
