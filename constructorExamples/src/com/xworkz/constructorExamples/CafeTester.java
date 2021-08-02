package com.xworkz.constructorExamples;

import com.xworkz.constructorExamples.cafe.Cafe;

public class CafeTester {
	
	public static void main(String[] args) {
		
		Cafe cafe= new Cafe();
		
		cafe.cafeDetails();
		cafe.freshness();
		cafe.freshness("beaverages");
	}

}
