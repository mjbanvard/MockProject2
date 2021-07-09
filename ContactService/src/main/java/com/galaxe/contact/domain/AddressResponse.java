package com.galaxe.contact.domain;

import java.util.List;

public class AddressResponse {
	//Removed 'Response' from variable name, 
	List<AddressVO> address;

	public List<AddressVO> getAddress() {
		return address;
	}

	public void setAddress(List<AddressVO> address) {
		this.address = address;
	}
	
	
}
