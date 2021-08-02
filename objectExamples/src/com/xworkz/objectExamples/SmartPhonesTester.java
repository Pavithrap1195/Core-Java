package com.xworkz.objectExamples;

import com.xworkz.objectExamples.smartphones.SmartPhones;

public class SmartPhonesTester {
	
	public static void main(String a[]) {
		
		SmartPhones phones = new SmartPhones();
		phones.brandName="Realme";
		phones.internalStorageInGb=64;
		phones.batteryCapacityInMah=5000;
		phones.operatingSystem="Android";
		phones.processorBrand="Snapdragon";
		System.out.println(phones.brandName+" "+phones.internalStorageInGb+" "+phones.batteryCapacityInMah+" "+phones.operatingSystem+" "+phones.processorBrand);
		
		SmartPhones.multitasking();
		
		
	}

}
