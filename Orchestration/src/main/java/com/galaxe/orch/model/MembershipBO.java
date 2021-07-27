package com.galaxe.orch.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name= "membership_2")
public class MembershipBO {
	
	// Membership model built to match table structure. 
	// GroupId and CarrierId are not in a separate table, and so there is no need for a GroupBO.
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Getter
	@Setter
	@Column(name= "id")
	private int id;
	
	@Getter
	@Setter
	@Column(name= "member_id")
	private int memberId;
	
	@Getter
	@Setter
	@Column(name= "date_of_birth")
	private Date dateOfBirth;
	
	//The table was built to include both carrierId and group_id. These could be separated.
	
	@Getter
	@Setter
	@Column(name= "group_id")
	private String groupId;
	
	@Getter
	@Setter
	@Column(name= "carrier_id")
	private String carrierId;

}

