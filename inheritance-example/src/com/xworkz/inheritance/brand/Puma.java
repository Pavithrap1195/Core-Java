package com.xworkz.inheritance.brand;

public class Puma extends Brand {
	
	
	public Puma() {
		System.out.println();
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void manufactures() {
		System.out.println("Puma is a no.1 brand");
	}

}
