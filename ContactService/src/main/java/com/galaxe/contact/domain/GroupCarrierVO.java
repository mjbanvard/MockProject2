package com.galaxe.contact.domain;

public class GroupCarrierVO {
	
	
	//Change to Integer, moved to top of list.
	// Latest: removed Id!
//	Integer id;
	
	String groupId;
	String carrierId;
	
	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
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
}
