package com.xworkz.brandsapp.dto;

import java.io.Serializable;

public class BrandsDTO implements Serializable {
	
	private int brandId;
	private String brandName;
	private int established;
	private String industryType;
	private String headQuarter;
	
	public BrandsDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getEstablished() {
		return established;
	}

	public void setEstablished(int established) {
		this.established = established;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getHeadQuarter() {
		return headQuarter;
	}

	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}

	@Override
	public String toString() {
		return "BrandsDTO [brandId=" + brandId + ", brandName=" + brandName + ", established=" + established
				+ ", industryType=" + industryType + ", headQuarter=" + headQuarter + "]";
	}
	
	

}
