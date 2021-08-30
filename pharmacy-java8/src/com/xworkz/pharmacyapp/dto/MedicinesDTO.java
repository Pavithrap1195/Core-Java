package com.xworkz.pharmacyapp.dto;

public class MedicinesDTO implements Comparable<MedicinesDTO> {
	
	private int medicineId;
	private String name;
	private double price;
	
	public MedicinesDTO() {
		// TODO Auto-generated constructor stub
	}

	public MedicinesDTO(int medicineId, String name, double price) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
	}
	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MedicinesDTO [medicineId=" + medicineId + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(MedicinesDTO o) {
		// TODO Auto-generated method stub
		return this.getMedicineId()-o.getMedicineId();
	}

}
