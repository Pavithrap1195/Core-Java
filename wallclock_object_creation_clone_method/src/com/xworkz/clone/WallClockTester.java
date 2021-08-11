package com.xworkz.clone;

import com.xworkz.clone.example.WallClock;

public class WallClockTester {
	
	public static void main(String[] args) {
		
		WallClock wall = new WallClock();
		
		wall.setName("Onida");
		wall.setPrice(800.00);
		wall.setShape("Circular");
		
		System.out.println(wall.getName()+" "+wall.getPrice()+" "+wall.getShape());
		
		try {
		WallClock clock = (WallClock)wall.clone();
		
		clock.setPrice(1000.00);
		System.out.println(clock.getName()+" "+clock.getPrice()+" "+clock.getShape());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
