package com.xworkz.encap.examples;

public class PowerBankDTO {
	
	private String brandName;
	private double price;
	private String color;
	private int batteryCapacityInMah;
	
	public PowerBankDTO() {
		
	}
	
	public void setBrandName(String brandName) {
		this.brandName=brandName;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setBatteryCapacityInMah(int batteryCapacityInMah) {
		this.batteryCapacityInMah=batteryCapacityInMah;
	}
	
	public int getBatteryCapacityInMah() {
		return batteryCapacityInMah;
	}
	
	

}
