package com.ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name = "CITY_MASTER")
public class City {
	@Id
	@Column(name="CITY_Id")
	@Type(type="int")
	private Integer cityId;
	
	@Column(name = "CITY_NAME",length = 20)
	@Type(type = "string")
	private String cityName;
	
	@Column(name = "STATE_ID")
	@Type(type = "int")
	private Integer stateId;
}
