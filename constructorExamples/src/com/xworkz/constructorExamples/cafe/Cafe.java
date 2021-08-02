package com.xworkz.constructorExamples.cafe;

public class Cafe {
	String name;
	String location;
	String timings;
	
	public Cafe() {
		this("One Star","Kanakpura","9 AM to 10 PM");
		System.out.println("With zero parameter");
	}
	
	public Cafe(String name,String location,String timings) {
		System.out.println("With three paramters");
		this.name=name;
		this.location=location;
		this.timings=timings;
		//cafeDetails();
		
	}
	
	public void cafeDetails() {
		System.out.println(this.name+" "+this.location+" "+this.timings);
	}
	
	public void freshness() {
		System.out.println("Visiting cafe will give freshness");
	}
	
	public void freshness(String beaverages) {
		System.out.println(beaverages+" Gives relaxation for mind");
	}

}
