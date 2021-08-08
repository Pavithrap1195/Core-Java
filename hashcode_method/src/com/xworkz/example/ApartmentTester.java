package com.xworkz.example;

import com.xworkz.example.hashcode.Apartment;

public class ApartmentTester {
	
	public static void main(String[] args) {
		
		Apartment apart = new Apartment();
		
		apart.appartmentId=62;
		apart.name="Rohan Akriti";
		apart.location="Uttarahalli";
		apart.noOfFlats=540;
		apart.noOfBlocks=6;
		apart.amenitiesAvailable=true;
		System.out.println(apart.name);
		System.out.println(apart.hashCode());
		
		Apartment ment = new Apartment();
		
		ment.appartmentId=63;
		ment.name="Rohan Akriti";
		ment.location="Sarjapur";
		ment.noOfFlats=540;
		ment.noOfBlocks=6;
		ment.amenitiesAvailable=true;
		System.out.println(ment.name);
		System.out.println(ment.hashCode());
		
		boolean type=ment.equals(apart);
		System.out.println(type);
	}

}
