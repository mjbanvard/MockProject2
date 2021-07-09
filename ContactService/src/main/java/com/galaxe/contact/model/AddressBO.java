package com.galaxe.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressBO {
	
	AddressBO(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	@Column(name="group_id")
	private String groupId;
	
	@Column(name="carrier_id")
	private String carrierId;
	
	@Column(name="status_verified")
	private String statusVerified;
	
	@Column(name="zip_code5")
	private String zipCode5;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="address_line3")
	private String addressLine3;
	
	@Column(name="address_type")
	private String addressType;
	
	@Column(name="address_verified")
	private String addressVerified;
	
	@Column(name="city")
	private String city;
	
	@Column(name = "zip_code4")
	private String zipCode4;
	
	@Column(name="state")
	private String state;
	
	//Added this here! 
	@Column(name="member_id")
	private Integer memId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
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

	public void setZipCode5(String zipCode5) {
		this.zipCode5 = zipCode5;
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

	public String getZipCode4() {
		return zipCode4;
	}

	public void setZipCode4(String zipCode4) {
		this.zipCode4 = zipCode4;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}
}
	
