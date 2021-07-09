package com.galaxe.prescription.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {

	private boolean statusVerified;
	private String zipCode5;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String city;
	private String zipCode4;
	
}
