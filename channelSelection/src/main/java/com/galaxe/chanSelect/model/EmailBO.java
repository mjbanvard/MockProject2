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
@Table(name="mem_email")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class EmailBO {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="mem_id")
	Integer memId;
	
	@Column(name="date_of_birth")
	Date dateOfBirth;
	
	@Column(name="mem_email")
	String memEmail;
	
	@Column(name="undeliverable")
	boolean undeliverable;	
	
}
