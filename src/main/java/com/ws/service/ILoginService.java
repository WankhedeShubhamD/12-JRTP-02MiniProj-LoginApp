package com.ws.service;

import java.util.Map;

import com.ws.model.User;

public interface ILoginService {
	
	
	public boolean isEmailUnique(String mail);
	public boolean saveUser(User user);
	public String checkUserAuthentication(String mail,String pwd);
	
	public boolean checkTempPwdValid(String mail,String oldPwd);
	public boolean unlockUser(String mail,String pwd);
	public String forgotPassword(String mail);
	
	public Map<Integer,String> getContries();
	public Map<Integer,String> getStateFromCountry(Integer countryId);
	public Map<Integer,String> getCityFromState(Integer stateId);
}
