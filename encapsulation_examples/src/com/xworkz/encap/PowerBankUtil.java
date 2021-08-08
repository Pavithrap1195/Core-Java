package com.xworkz.encap;

import com.xworkz.encap.examples.PowerBankDTO;

public class PowerBankUtil {
	
	public static void main(String[] args) {
		
		PowerBankDTO power=new PowerBankDTO();
		power.setBrandName("Zebronics");
		power.setPrice(1000);
		power.setColor("White");
		power.setBatteryCapacityInMah(5000);
		System.out.println(power.getBrandName());
		System.out.println(power.getPrice());
		System.out.println(power.getColor());
		System.out.println(power.getBatteryCapacityInMah());
	}

}
