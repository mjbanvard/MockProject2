package com.galaxe.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AddressVO {
	
	String statusVerified;
	String zipCode5;
	String addressLine1;
	String addressLine2;
	String addressLine3;
	String addressType;
	String addressVerified;
	String city;
	String state;
	String zipCode4;

}
