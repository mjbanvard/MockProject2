package com.galaxe.orch.domain;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Membership {

	// Membership object, containing Group object, built to output correct format for JSON Response.
	
	@Getter
	@Setter
	Date dateOfBirth;
	
	@Getter
	@Setter
	Group group;
}
