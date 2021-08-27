package com.xworkz.example.dto;

public class BeachDTO implements Comparable<BeachDTO> {
	
	private int beachId;
	private String name;
	private String location;
	
	public BeachDTO() {
		// TODO Auto-generated constructor stub
	}

	public BeachDTO(int beachId, String name, String location) {
		super();
		this.beachId = beachId;
		this.name = name;
		this.location = location;
	}

	public int getBeachId() {
		return beachId;
	}

	public void setBeachId(int beachId) {
		this.beachId = beachId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BeachDTO [beachId=" + beachId + ", name=" + name + ", location=" + location + "]";
	}
	
	@Override
	public int compareTo(BeachDTO o) {
		// TODO Auto-generated method stub
		return this.getBeachId()-o.getBeachId();
	}

}
