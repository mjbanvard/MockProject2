package com.galaxe.orch.model;

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

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="name")
public class NameBO {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Getter
	@Setter
	@Column(name= "id")
	private int id;
	
	@Getter
	@Setter
	@Column(name= "member_id")
	private int memberId;
	
	@Getter
	@Setter
	@Column(name= "date_of_birth")
	private Date dateOfBirth;
	
	@Getter
	@Setter
	@Column(name= "first_name")
	private String firstname;
	
	@Getter
	@Setter
	@Column(name= "last_name")
	private String lastname;

}

