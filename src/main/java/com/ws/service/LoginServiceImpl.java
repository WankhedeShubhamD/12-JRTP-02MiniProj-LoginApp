package com.ws.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.ws.model.City;
import com.ws.model.Country;
import com.ws.model.State;
import com.ws.model.User;
import com.ws.repo.CityRepository;
import com.ws.repo.CountryRepository;
import com.ws.repo.StateRepository;
import com.ws.repo.UserRepository;

public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private CountryRepository countryRepo;
	
	@Autowired
	private StateRepository stateRepo;
	
	@Autowired
	private CityRepository cityRepo;
	
	
	@Override
	public boolean isEmailUnique(String mail) {
		//return status
		return userRepo.existByMail(mail)==0?true:false;
	}

	@Override
	public boolean saveUser(User user) {
		
		user.setUserStatus("LOCKED");
		user.setPwd("USR"+new Random(1000));
		//save the user
		userRepo.save(user);
	
		return true;
	}

	@Override
	public String checkUserAuthentication(String mail, String pwd) {
		//authentication message with initial message in case below operation failed to execute
		String authMessage =null;
		
		//check different authentications to generate authMessage
		if(userRepo.existByMail(mail)==0 && userRepo.getPwdByMail(mail).equals(pwd))
			authMessage="INVALID_CREDENTIALS";
		else if(userRepo.getUserStatusByMail(mail)==("LOCKED"))
			authMessage="USER_LOCKED";
		else
			authMessage="LOGIN_SUCCESS";
		
		
		return authMessage;
	}

	@Override
	public boolean checkTempPwdValid(String mail, String oldPwd) {
		//check old pwd with existing pwd and return boolean
		return userRepo.getPwdByMail(mail).equals(oldPwd)?true:false;
	}


	@Override
	public boolean unlockUser(String mail, String newPwd) {
		//retrive user
		User user = userRepo.findByMail(mail);
		user.setUserStatus("UNLOCKED");
		user.setPwd(newPwd);
		
		//save changes
		userRepo.save(user);
		
		//return true
		return true;
	}

	@Override
	public String forgotPassword(String mail) {
		
		return userRepo.existByMail(mail)==1 ?userRepo.getPwdByMail(mail): null;
	}

	@Override
	public Map<Integer, String> getContries() {
		List<Country> contriesList = countryRepo.findAll();
		
		Map<Integer,String> countriesMap = new LinkedHashMap<>();
		//copy list to map
		for(Country contry:contriesList) {
			countriesMap.put(contry.getCountryId(), contry.getCountryName());
		}
		
		return countriesMap;
	}

	@Override
	public Map<Integer, String> getStateFromCountry(Integer countryId) {
		List<State> statesList = stateRepo.findByCountryId(countryId);
		
		Map<Integer,String> statesMap = new LinkedHashMap<>();
		//copy list to map
		for(State state:statesList) {
			statesMap.put(state.getStateId(), state.getStateName());
		}
		
		return statesMap;
	}

	@Override
	public Map<Integer, String> getCityFromState(Integer stateId) {
		List<City> citiesList = cityRepo.findByStateId(stateId);
		
		Map<Integer,String> citiesMap = new LinkedHashMap<>();
		//copy list to map
		for(City city:citiesList) {
			citiesMap.put(city.getCityId(), city.getCityName());
		}
		
		return citiesMap;
	}

}
