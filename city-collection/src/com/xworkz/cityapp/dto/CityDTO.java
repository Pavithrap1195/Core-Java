package com.xworkz.cityapp.dto;

import java.io.Serializable;

public class CityDTO implements Serializable {
	
	private int cityId;
	private String cityName;
	private int establishedOn;
	
	
	public CityDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public int getEstablishedOn() {
		return establishedOn;
	}


	public void setEstablishedOn(int establishedOn) {
		this.establishedOn = establishedOn;
	}


	@Override
	public String toString() {
		return "CityDTO [cityId=" + cityId + ", cityName=" + cityName + ", establishedOn=" + establishedOn + "]";
	}
	
	

}
