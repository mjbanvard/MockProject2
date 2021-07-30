package com.galaxe.orch.domain;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Recipient {
	
	// Recipient object built in the form of the final expected output format of the Orchestration service.
	
	private Integer id;

	private Date dateOfBirth;

	private Membership membership;

	private Name name;

	private List<Address> address;

	private List<Email> email;

	private List<Phone> phone;

	private String agn;
	
	private boolean eligStatus;
	
	private String benefitGrp;
	
	
}
