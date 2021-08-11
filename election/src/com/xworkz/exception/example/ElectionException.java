package com.xworkz.exception.example;

//custom checked exception
public class ElectionException extends Exception {
	
	public String getMessage() {
		return "You are not eligible to vote";
	}

}
