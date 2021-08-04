package com.xworkz.inherit.example;

public class Vaccine {
	
	public int vaccineId;
	public String foundBy;
	public int noOfDoses;
	
	public Vaccine() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void immunity() {
		System.out.println("Vaccine provides immunity");
	}
	
	public void printDetails() {
		System.out.println(vaccineId+" "+foundBy+" "+noOfDoses);
	}
}
