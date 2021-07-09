package com.galaxe.orch.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {
	
	// Phone object built to output correct format for JSON Response.

	@Getter
	@Setter
	String bestTimeToCall;
	
	@Getter
	@Setter
	String number;
	
	@Getter
	@Setter
	String extension;
	
	@Getter
	@Setter
	int countryCallingCode;
	
	@Getter
	@Setter
	String phoneType;
	
}
