package com.ws.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.model.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	public List<City> findByStateId(Integer stateId);
}
