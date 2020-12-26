package com.ws.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unlock_acc")
public class UnlockAccountRestController {
	
	//---> Post handler method to perform login
	@PostMapping("/login",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> handleLogin(@RequestBody String mail, @RequestBody String pwd) {
		return null;
	}
	
	//----> Post handler method to unlock the acc and update with new password
	@PostMapping(value="/unlock",
			consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> handleUnlockUser(@RequestBody String mail,@RequestBody String oldPwd,@RequestBody String newPwd){
		return null;
	}
	
	//----> Post handler method to get forgotten password through mail
	@PostMapping(value="/forgotPwd",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> handleForgotPwd(@RequestBody String mail) {
		return null;
	}

	
}
