package com.xworkz.custom.example;

//custom checked exception
public class PubException extends Exception {
	
	public String getMessage() {
		return "You are too young to enter the PUB";
	}

}
