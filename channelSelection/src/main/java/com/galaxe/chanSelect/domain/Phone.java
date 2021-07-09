package com.galaxe.chanSelect.domain;

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
public class Phone {

	String bestTimeToCall;
	String number;
	String extension;
	int countryCallingCode;
	String phoneType;
	
}
