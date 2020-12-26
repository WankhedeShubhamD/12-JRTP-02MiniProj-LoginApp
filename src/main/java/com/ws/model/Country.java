package com.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Table(name = "COUNTRY_MASTER")
@Data
public class Country {
	@Id
	@Column(name="COUNTRY_ID")
	@Type(type = "int")
	private Integer countryId;
	
	@Column(name = "COUNTRY_NAME",length = 20)
	@Type(type = "string")
	private String countryName;
}
