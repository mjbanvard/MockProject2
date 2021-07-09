package com.galaxe.prescription.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="agn")
public class PrescriptionBO {
	
	// Changed @Table to match table name
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id") 
	private int id;
	
	@Column(name= "member_id")
	private @NonNull Integer memberId;
	
	@Column(name= "group_id")
	private @NonNull String groupId;
	
	@Column(name= "carrier_id")
	private @NonNull String carrierId;
	
	@Column(name= "agn_number")
	private @NonNull String agn;
	

}
