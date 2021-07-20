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
public class PhoneVO {
	
	String bestTimeToCall;
	String number;
	String memExtension;
	int countryCallingCode;
	String phoneType;

}
