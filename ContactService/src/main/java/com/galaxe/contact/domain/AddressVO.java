package com.galaxe.contact.domain;

public class AddressVO {
	private String statusVerified;
	private String zipCode5;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressType;
	private String addressVerified;
	private String city;
	private String state;
	private String zipCode4;
		
	public String getZipCode4() {
		return zipCode4;
	}

	public void setZipCode4(String zipCode4) {
		this.zipCode4 = zipCode4;
	}

	public AddressVO(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
	public AddressVO() {
		
	}
	public String getStatusVerified() {
		return statusVerified;
	
	}
	
	public void setStatusVerified(String statusVerified) {
		this.statusVerified = statusVerified;
	}
	public String getZipCode5() {
		return zipCode5;
	}
	public void setZipCode5(String zipCode) {
		this.zipCode5 = zipCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressVerified() {
		return addressVerified;
	}
	public void setAddressVerified(String addressVerified) {
		this.addressVerified = addressVerified;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
