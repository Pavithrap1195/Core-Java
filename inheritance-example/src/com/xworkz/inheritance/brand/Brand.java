package com.xworkz.inheritance.brand;

public class Brand {
	
	public int brandId;
	public String headQuarter;
	public int foundedOn;
	public String type;
	
	public Brand() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	/*public Brand(int brandId,String headQuarter,int foundedOn,String type) {
		this.brandId=brandId;
		this.headQuarter=headQuarter;
		this.foundedOn=foundedOn;
		this.type=type;
	}*/
	
	public void popularity() {
		System.out.println("We will come across diffrent brands in every industry");
	}
	
	public void printDetails() {
		System.out.println(this.brandId+" "+this.headQuarter+" "+this.foundedOn+" "+this.type);
	}
	
	

}
