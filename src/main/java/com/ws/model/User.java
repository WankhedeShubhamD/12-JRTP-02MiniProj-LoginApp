package com.ws.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_MASTER")
public class User {
	@Id
	@GeneratedValue
	private Integer userId;
	
	@Column(name = "FIRST_NAME",length = 20)
	@Type(type = "string")
	private String firstName;
	
	@Column(name = "LAST_NAME",length = 20)
	@Type(type = "string")
	private String lastName;
	
	@Id
	@Column(name="MAIL",unique = true,length = 40)
	@Type(type = "string")
	private String mail;
	
	@Column(name="PWD",length = 20)
	@Type(type = "string")
	private String pwd;
	
	@Column(name = "PHONE_NUMBER")
	@Type(type = "long")
	private Long phoneNumber;
	
	@Column(name = "DOB")
	private LocalDate DOB;
	
	@Column(name = "GENDER",length = 1)
	@Type(type = "string")
	private String gender;
	
	@Column(name="COUNTRY_ID")
	@Type(type = "int")
	private Integer countryId;
	
	@Column(name="STATE_ID")
	@Type(type = "int")
	private Integer stateId;
	
	@Column(name="CITY_ID")
	@Type(type = "int")
	private Integer cityId;
	
	@Column(name="STATUS",length = 20)
	@Type(type = "string")
	private String userStatus="locked";
	
}
