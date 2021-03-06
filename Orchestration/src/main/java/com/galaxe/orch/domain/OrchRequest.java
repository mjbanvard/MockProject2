package com.galaxe.orch.domain;

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
public class OrchRequest {
	
	//Request object, built to receive incoming request, in JSON format.
	// dateOfBirth is being input as String, in order to change its format and its Type to Date. This occurs in the controller.
	
	Integer id;
	String dateOfBirth;

}
