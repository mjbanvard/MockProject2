package com.galaxe.chanSelect.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="mem_phone")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class PhoneBO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="mem_id")
	Integer memId;
	
	@Column(name="date_of_birth")
	Date dateOfBirth;
	
	@Column(name="best_time_to_call")
	String bestTimeToCall;
	
	@Column(name="mem_phone")
	String memPhone;
	
	@Column(name="mem_extension")
	String memExtension;
	
	@Column(name="country_calling_code")
	int countryCallingCode;
	
	@Column(name="phone_type")
	String phoneType;

}
