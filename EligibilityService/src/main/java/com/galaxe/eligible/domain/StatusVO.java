package com.galaxe.eligible.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StatusVO {
	
	// Removed redundant Getter and Setter declarations - MJB
	private String eligStatus;	
	private String benefitGrp;
	
}

