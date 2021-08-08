package com.xworkz.example.hashcode;

public class Apartment {
	
	public int appartmentId;
	public String name;
	public String location;
	public int noOfFlats;
	public int noOfBlocks;
	public boolean amenitiesAvailable;
	
	public Apartment() {
		System.out.println();
	}
	
	@Override
	public int hashCode() {
		return this.appartmentId;
	}
	
	@Override
	public boolean equals(Object apartment) {
		if(apartment instanceof Apartment) {
			Apartment apart1=(Apartment)apartment;
			if(this.hashCode()==apart1.hashCode()) {
				return true;
			}else {
				System.out.println("Hashcode are different");
			}
			if(this.name.equals(apart1.name)) {
				return true;
			}else {
				System.out.println("Names are different");
			}
			if(this.location.equals(apart1.location)) {
				return true;
			}else {
				System.out.println("Location is different");
			}
			if(this.noOfFlats==apart1.noOfFlats) {
				return true;
			}else {
				System.out.println("No of flats are different");
			}
			if(this.noOfBlocks==apart1.noOfBlocks) {
				return true;
			}else {
				System.out.println("No of blocks are different");
			}
			if(this.amenitiesAvailable==apart1.amenitiesAvailable) {
				return true;
			}else {
				System.out.println("Amenities are not available");
			}
		}else {
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
				
				
}
	
