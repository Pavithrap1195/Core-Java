package com.xworkz.electronics.dto;

import java.io.Serializable;

public class ElectronicShopDTO implements Serializable {
	
	private int electronicShopId;
	private String shopName;
	private String location;
	
	public ElectronicShopDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getElectronicShopId() {
		return electronicShopId;
	}

	public void setElectronicShopId(int electronicShopId) {
		this.electronicShopId = electronicShopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ElectronicShopDTO [electronicShopId=" + electronicShopId + ", shopName=" + shopName + ", location="
				+ location + "]";
	}
	
	

}
