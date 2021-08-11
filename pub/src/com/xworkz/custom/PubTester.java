package com.xworkz.custom;

import com.xworkz.custom.example.PubException;
import com.xworkz.custom.exception.Bouncer;

public class PubTester {
	
	public static void main(String[] args) {
		
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.checkAge(17);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
