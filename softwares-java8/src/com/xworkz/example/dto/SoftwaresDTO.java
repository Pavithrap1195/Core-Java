package com.xworkz.example.dto;

public class SoftwaresDTO implements Comparable<SoftwaresDTO> {
	
	private int softwareId;
	private String name;
	
	public SoftwaresDTO() {
		// TODO Auto-generated constructor stub
	}

	public SoftwaresDTO(int softwareId, String name) {
		super();
		this.softwareId = softwareId;
		this.name = name;
	}

	public int getSoftwareId() {
		return softwareId;
	}

	public void setSoftwareId(int softwareId) {
		this.softwareId = softwareId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SoftwaresDTO [softwareId=" + softwareId + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(SoftwaresDTO o) {
		// TODO Auto-generated method stub
		return this.getSoftwareId()-o.getSoftwareId();
	}
	

}
