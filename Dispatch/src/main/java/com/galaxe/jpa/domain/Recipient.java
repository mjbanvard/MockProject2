package com.galaxe.jpa.domain;

import java.sql.Date;
import java.util.List;

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
public class Recipient {
	
	private Integer id;
	private Date dateOfBirth;
	private MembershipVO membership;
	private NameVO name;
	private List<AddressVO> address;
	private String agn;
	private List<EmailVO> email;
	private List<PhoneVO> phone;
	private boolean eligStatus;
	private String benefitGrp;
}
