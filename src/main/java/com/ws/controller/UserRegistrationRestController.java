package com.ws.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.model.User;

@RestController
@RequestMapping("/user_reg")
public class UserRegistrationRestController {
	
	//---> post handler method to  signUp
	@PostMapping( value = "/signUp",
			consumes = {
					MediaType.APPLICATION_JSON_VALUE
			}
	)
	public ResponseEntity<String> handleSingUp(@RequestBody User user) {
		return null;
	}
	
	
	//---> Get Method to get the contries list
	@GetMapping(value="/contries",
				produces = {
						MediaType.APPLICATION_JSON_VALUE
				}
			)
	public ResponseEntity<Map<Integer,String>> handlePopulateCountry(){
		return null;
	}
	
	//-----> Get handler method to get states list
	@GetMapping(value="/states",
			produces = {
					MediaType.APPLICATION_JSON_VALUE
			}
		)
	public ResponseEntity<Map<Integer,String>> handlePopulateState(){
		return null;
	}
	

	//-----> Get handler method to get cities list
	@GetMapping(value="/cities",
			produces = {
					MediaType.APPLICATION_JSON_VALUE
			}
		)
	public ResponseEntity<Map<Integer,String>> handlerPopulateCity(){
		return null;
	}
	
}
