package com.xworkz.methods.example;

public class TajMahal extends Monument {
	
	public String located="Agra,Uttar Pradesh";
	public int heightInMeters=73;
	public int areaInHectares=17;
	
	@Override
	public String commemorate(){
		System.out.println(" It is the tomb of shah jahan favourite wife, Mumtaz Mahal");
		return "Symbol of Great Love";
		
	}
	
	public void printDetails() {
		System.out.println(located);
		System.out.println(heightInMeters);
		System.out.println(areaInHectares);
	}
	

}
