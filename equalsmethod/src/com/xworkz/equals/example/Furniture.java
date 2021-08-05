package com.xworkz.equals.example;

public class Furniture {
	
	public String type;
	public double price;
	public boolean portable;
	
	public Furniture() {
		this("Wood",10000,false);
		try {
			System.out.println(Class.forName("com.xworkz.equals.example.Furniture"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Furniture(String type,double price,boolean portable) {
		this.type=type;
		this.price=price;
		this.portable=portable;
		System.out.println(this.type+" "+this.price+" "+this.portable);
	}
	
	public int costlier() {
		System.out.println("Furniture are costlier");
		return 15000;
		
	}
	
	@Override
	public boolean equals(Object furni) {
		if(furni instanceof Furniture) {
			return true;
		}
		return false;
	}

}
