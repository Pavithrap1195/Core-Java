package com.dmart.dmartapp.dto;

import java.io.Serializable;

public class ProductsDTO implements Serializable {
	
	private String productId;
	private String productName;
	private double price;
	private String quality;
	private String brandName;
	private String productType;
	
	public ProductsDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}
	
	public void setProductId(String productId) {
		this.productId=productId;
	}
	
	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	@Override
	public String toString() {
		return "ProductsDTO [productId="+productId+",productName="+productName+",price="+price+",quality="+quality+",brandName="+brandName+",productType="+productType+"]";
	}
	
	

}
