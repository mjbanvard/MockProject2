package com.galaxe.prescription.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PrescriptionVO {
	
	private int id;
	private Integer memberId;
	private String groupId;
	private String carrierId;
	private String agn;

}
