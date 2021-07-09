package com.galaxe.orch.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
	
	// Address object built to output correct format for JSON Response.
		
	@Getter
	@Setter
	String statusVerified;
	
	@Getter
	@Setter
	String zipCode5;
	
	@Getter
	@Setter
	String addressLine1;
	
	@Getter
	@Setter
	String addressLine2;
	
	@Getter
	@Setter
	String addressLine3;
	
	@Getter
	@Setter
	String addressType;
	
	@Getter
	@Setter
	String addressVerified;
	
	@Getter
	@Setter
	String city;
	
	@Getter
	@Setter
	String state;
	
	@Getter
	@Setter
	String zipCode4;


}
