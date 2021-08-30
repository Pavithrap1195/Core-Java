package com.softdrinks.softdrinksapp.dto;

public class SoftDrinksDTO {
	
	private int softDrinksId;
	private String name;
	private double price;
	
	public SoftDrinksDTO() {
		// TODO Auto-generated constructor stub
	}

	public SoftDrinksDTO(int softDrinksId, String name, double price) {
		super();
		this.softDrinksId = softDrinksId;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SoftDrinksDTO [softDrinksId=" + softDrinksId + ", name=" + name + ", price=" + price + "]";
	}

	public int getSoftDrinksId() {
		return softDrinksId;
	}

	public void setSoftDrinksId(int softDrinksId) {
		this.softDrinksId = softDrinksId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
