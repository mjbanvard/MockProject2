package com.galaxe.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.contact.dao.AddressDAO;
import com.galaxe.contact.domain.AddressVO;
import com.galaxe.contact.domain.GroupCarrierVO;
import com.galaxe.contact.model.AddressBO;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDAO addressDao;

	@Override
	public List<AddressVO> getAddress(GroupCarrierVO request) {

		List<AddressBO> addresses = addressDao.findByGroupIdAndCarrierId(request.getGroupId(), request.getCarrierId());
		List<AddressVO> addressesVO = listBotolistVo(addresses);

		return addressesVO;
	}

	private List<AddressVO> listBotolistVo(List<AddressBO> address) {

		List<AddressVO> avoList = new ArrayList<AddressVO>();
		for (AddressBO add : address) {
			AddressVO avo = new AddressVO();
			avo.setStatusVerified(add.getStatusVerified());
			avo.setZipCode5(add.getZipCode5());
			avo.setAddressLine1(add.getAddressLine1());
			avo.setAddressLine2(add.getAddressLine2());
			avo.setAddressLine3(add.getAddressLine3());
			avo.setAddressType(add.getAddressType());
			avo.setAddressVerified(add.getAddressVerified());
			avo.setCity(add.getCity());
			avo.setState(add.getState());
			avo.setZipCode4(add.getZipCode4());

			avoList.add(avo);
		}

		return avoList;
	}

//	private List<AddressVO> listBoToListVo(List<AddressBO> listAddressBo) {
//		List<AddressVO> listAddressVo = new ArrayList<AddressVO>();
////		for (AddressBO addressBo : listAddressBo) {
////
//////			listAddressVo.add(boToVo(addressBo));
////		}
//
//		return listAddressVo;
//	}

}
