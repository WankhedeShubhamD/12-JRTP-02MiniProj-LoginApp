package com.ws.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.model.Country;

public interface CountryRepository extends JpaRepository<Country,Integer> {

}
