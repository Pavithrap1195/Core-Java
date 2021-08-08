package com.xworkz.example.abstraction;

public class SbiAtm extends Sbi {
	
	@Override
	public void connectBankDB() {
		System.out.println("Connect to Sbi-DB");
	}

}
