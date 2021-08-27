package com.xworkz.example.dto;

public class TransportationDTO implements Comparable<TransportationDTO> {
	
	private int transportationId;
	private String name;
	private String typeOfMode;
	
	public TransportationDTO() {
		// TODO Auto-generated constructor stub
	}

	public TransportationDTO(int transportationId, String name, String typeOfMode) {
		super();
		this.transportationId = transportationId;
		this.name = name;
		this.typeOfMode = typeOfMode;
	}

	@Override
	public String toString() {
		return "TransportationDTO [transportationId=" + transportationId + ", name=" + name + ", typeOfMode="
				+ typeOfMode + "]";
	}

	public int getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(int transportationId) {
		this.transportationId = transportationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfMode() {
		return typeOfMode;
	}

	public void setTypeOfMode(String typeOfMode) {
		this.typeOfMode = typeOfMode;
	}
	
	@Override
	public int compareTo(TransportationDTO o) {
		// TODO Auto-generated method stub
		return this.getTransportationId()-o.getTransportationId();
	}

}
