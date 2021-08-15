package com.mobile.mobileapp.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	
	private int applicationId;
	private String applicationName;
	private String size;
	private String type;
	private boolean internetRequired;
	
	public ApplicationDTO() {
		System.out.println(this.getClass().getSimpleName()+" Objects are created");
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isInternetRequired() {
		return internetRequired;
	}

	public void setInternetRequired(boolean internetRequired) {
		this.internetRequired = internetRequired;
	}
	
	@Override
	public String toString() {
		
		return "AppplicationDTO [applicationId="+applicationId+",applicationName="+applicationName+",size="+size+",type="+type+",internetRequired="+internetRequired+"]";
	}
	
	

}
