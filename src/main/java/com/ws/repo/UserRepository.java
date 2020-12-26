package com.ws.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ws.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//-----> Select Methods
	
	@Query("SELECT COUNT(*) FROM com.ws.model.User WHERE mail=?1")
	public int existByMail(String mail);
	
	@Query("SELECT pwd FROM com.ws.model.User WHERE mail=?1")
	public String getPwdByMail(String mail);
	
	@Query("SELECT userStatus FROM com.ws.model.User WHERE mail=?1")
	public String getUserStatusByMail(String mail);
	
	public User findByMail(String mail);
	
	
	//------> Non Select Methods
	
	@Modifying
	@Query("UPDATE com.nt.model.User SET pwd=?2 WHERE mail=?1")
	public int updatePwd(String mail,String pwd);
}
