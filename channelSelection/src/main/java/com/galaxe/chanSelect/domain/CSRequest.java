package com.galaxe.chanSelect.domain;

import java.sql.Date;

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
public class CSRequest {
	
	Integer id;
	Date dateOfBirth;
}
