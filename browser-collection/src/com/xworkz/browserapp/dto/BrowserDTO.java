package com.xworkz.browserapp.dto;

import java.io.Serializable;

public class BrowserDTO implements Serializable {
	
	private int browserId;
	private String browserName;
	private String developer;
	
	public BrowserDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getBrowserId() {
		return browserId;
	}

	public void setBrowserId(int browserId) {
		this.browserId = browserId;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "BrowserDTO [browserId=" + browserId + ", browserName=" + browserName + ", developer=" + developer + "]";
	}
	 
	
	

}
