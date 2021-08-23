package com.xworkz.metroapp.dto;

import java.io.Serializable;

public class MetroDTO implements Serializable{
	
	private int metroId;
	private String metroName;
	private String startingPoint;
	private String endingPoint;
	
	public MetroDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getMetroId() {
		return metroId;
	}

	public void setMetroId(int metroId) {
		this.metroId = metroId;
	}

	public String getMetroName() {
		return metroName;
	}

	public void setMetroName(String metroName) {
		this.metroName = metroName;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getEndingPoint() {
		return endingPoint;
	}

	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}

	@Override
	public String toString() {
		return "MetroDTO [metroId=" + metroId + ", metroName=" + metroName + ", startingPoint=" + startingPoint
				+ ", endingPoint=" + endingPoint + "]";
	}
	
	

}
