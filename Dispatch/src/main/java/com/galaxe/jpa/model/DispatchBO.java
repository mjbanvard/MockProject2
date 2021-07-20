package com.galaxe.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dispatch")
public class DispatchBO {
	
	@Id
//	@Column(name = "id")
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	private Integer row_id;
	@Column(name = "member_id")
	private Integer id;
	@Column(name = "request")
	private String request;


}
