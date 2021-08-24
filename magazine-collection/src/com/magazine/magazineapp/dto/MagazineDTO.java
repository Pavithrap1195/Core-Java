package com.magazine.magazineapp.dto;

import java.io.Serializable;

public class MagazineDTO implements Serializable {
	
	private int magazineId;
	private String magazineName;
	private double price;
	private int noOfPages;
	private String type;
	
	public MagazineDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(int magazineId) {
		this.magazineId = magazineId;
	}

	public String getMagazineName() {
		return magazineName;
	}

	public void setMagazineName(String magazineName) {
		this.magazineName = magazineName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MagazineDTO [magazineId=" + magazineId + ", magazineName=" + magazineName + ", price=" + price
				+ ", noOfPages=" + noOfPages + ", type=" + type + "]";
	}
	
	

}
