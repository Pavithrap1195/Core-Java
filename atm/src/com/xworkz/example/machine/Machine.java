package com.xworkz.example.machine;

import com.xworkz.example.exception.ATMException;

public class Machine {
	
	public void withDraw(int amt) {
		
		if(amt > 20000 || amt <100 || amt % 100 != 0) {
			throw new ATMException();
		}else {
			System.out.println("Collect the cash");
		}
	}

}
