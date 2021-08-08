package com.xworkz.hashcode;

import com.xworkz.hashcode.example.SmartPhone;

public class SmartPhoneUtil {
	
	public static void main(String[] args) {
		
		SmartPhone ph=new SmartPhone();
		
		ph.smartPhoneId=405;
		ph.brandName="Realme";
		ph.internalStorageInGb=64;
		ph.batteryCapacityInMah=4500;
		ph.operatingSystem="Android";
		System.out.println(ph.brandName);
		System.out.println(ph.hashCode());
		
		SmartPhone smart=new SmartPhone();
		
		smart.smartPhoneId=401;
		smart.brandName="Redmi";
		smart.internalStorageInGb=32;
		smart.batteryCapacityInMah=5000;
		smart.operatingSystem="Android";
		System.out.println(smart.brandName);
		System.out.println(smart.hashCode());
		
		boolean type=smart.equals(ph);
		System.out.println(type);
	}

}
