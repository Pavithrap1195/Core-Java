package com.xworkz.example;

import com.xworkz.example.clone_method.Country;

public class CountryTester {
	
	public static void main(String[] args) {
		Country country = new Country();
		
		country.setName("India");
		country.setPopulation(1000000000);
		country.setCapitalCity("New Delhi");
		
		System.out.println(country.getName()+" "+country.getPopulation()+" "+country.getCapitalCity());
		
		try {
			Country country2=(Country)country.clone();
			country2.setPopulation(1100000000);
			System.out.println(country2.getName()+" "+country2.getPopulation()+" "+country2.getCapitalCity());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
