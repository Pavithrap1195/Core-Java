package com.xworkz.equals.example;

public class StudyTable extends Furniture {
	
	public String type;
	public double price;
	public boolean portable;
	
	@Override
	public int costlier() {
		System.out.println("StudyTable is very important which makes works easy");
		return 25000;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void isPortable(boolean portable) {
		this.portable=portable;
	}
	
	public boolean getPortable() {
		return portable;
	}
	
	
	
	

}
