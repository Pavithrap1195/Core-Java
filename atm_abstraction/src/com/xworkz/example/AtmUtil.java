package com.xworkz.example;

import com.xworkz.example.abstraction.AtmMachine;
import com.xworkz.example.abstraction.Sbi;
import com.xworkz.example.abstraction.SbiAtm;

public class AtmUtil {
	
	public static void main(String[] args) {
		AtmMachine machine=new AtmMachine();
		SbiAtm sbi=new SbiAtm();  //Abstraction
		machine.slot(sbi);
		Sbi s=new SbiAtm();
		s.createAccount();
	}

}
