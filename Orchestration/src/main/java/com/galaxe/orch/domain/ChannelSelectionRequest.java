package com.galaxe.orch.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChannelSelectionRequest {
	
	Integer id;
	Date dateOfBirth;

}
