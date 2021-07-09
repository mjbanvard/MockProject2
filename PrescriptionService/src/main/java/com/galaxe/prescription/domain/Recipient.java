package com.galaxe.prescription.domain;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Recipient {
	
	private long id;
	private String dateOfBirth;
	private Membership membership;
	private Name name;
	private List<Address> address;
	private String agn;

}
