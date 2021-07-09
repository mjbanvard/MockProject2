package com.galaxe.prescription.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Request {

	// Changed to Integer
	private Integer id;
	
	private String groupId;
	private String carrierId;
	
}
