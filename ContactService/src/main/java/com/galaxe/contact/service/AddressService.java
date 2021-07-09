package com.galaxe.contact.service;

import java.util.List;

import com.galaxe.contact.domain.AddressVO;
import com.galaxe.contact.domain.GroupCarrierVO;

public interface AddressService {
	public List<AddressVO> getAddress(GroupCarrierVO request);
}
