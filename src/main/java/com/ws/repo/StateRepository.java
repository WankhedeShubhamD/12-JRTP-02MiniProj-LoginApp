package com.ws.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.model.State;

public interface StateRepository extends JpaRepository<State,Integer> {
	public List<State> findByCountryId(Integer countryId);
}
