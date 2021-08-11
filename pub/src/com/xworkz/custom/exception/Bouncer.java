package com.xworkz.custom.exception;

import com.xworkz.custom.example.PubException;

public class Bouncer {
	
	public void checkAge(int age) throws PubException {
		
		if(age < 18) {
			
			PubException exception = new PubException();
			throw exception;
			
		}else {
			System.out.println("You can enter and enjoyyy");
		}
	}

}
