package com.ws.exceptions;



public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException() {
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
	
}
