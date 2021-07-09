package com.galaxe.eligible.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "status")
public class StatusBO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="memid")
	private int memId;
	
	@Column(name="status")
	private String eligStatus;
	
	@Column(name="benefits")
	private String benefitGrp;
	
	@Column(name="groupid")
	private String groupId;
	
	@Column(name="carrierid")
	private String carrierId;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemId() {
		return memId;
	}

	public void setMemId(int memberId) {
		this.memId = memberId;
	}

	public String getEligStatus() {
		return eligStatus;
	}

	public void setEligStatus(String eligStatus) {
		this.eligStatus = eligStatus;
	}

	public String getBenefitGrp() {
		return benefitGrp;
	}

	public void setBenefitGrp(String benefitGrp) {
		this.benefitGrp = benefitGrp;
	}

}
	