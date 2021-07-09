package com.galaxe.orch.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Name {

	// Name object built to output correct format for JSON Response.
	
	@Getter
	@Setter
	String firstName;
	
	@Getter
	@Setter
	String lastName;
}
