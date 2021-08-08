package com.xworkz.examples;

import com.xworkz.examples.encapsulation.BroadBandDTO;

public class BroadBandUtil {
	public static void main(String[] args) {
		
		BroadBandDTO brand = new BroadBandDTO();
		brand.setName("Jio");
		brand.setPrice(1800);
		brand.isDoesSupport4g(true);
		System.out.println(brand.getName());
		System.out.println(brand.getPrice());
		System.out.println(brand.getDoesSupport4g());
	}

}
