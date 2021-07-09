package com.galaxe.prescription.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Membership {
	
	private String dateOfBirth;
	private Group group;

}
