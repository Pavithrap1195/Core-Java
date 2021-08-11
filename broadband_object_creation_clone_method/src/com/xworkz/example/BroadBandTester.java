package com.xworkz.example;

import com.xworkz.example.clone.BroadBand;

public class BroadBandTester {
	
	public static void main(String[] args)  {
		
		BroadBand broadband = new BroadBand();
		broadband.setName("Jio");
		broadband.setPrice(600.00);
		broadband.setDoesSupport4g(true);
		
		System.out.println(broadband.getName()+" "+broadband.getPrice()+" "+broadband.isDoesSupport4g());
		
		try {
		BroadBand band = (BroadBand)broadband.clone();
		band.setPrice(800.00);
		System.out.println(band.getName()+" "+band.getPrice()+" "+band.isDoesSupport4g());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
