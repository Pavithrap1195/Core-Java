package com.harddisk.harddiskapp.dto;

import java.io.Serializable;

public class HardDiskDTO implements Serializable {
	
	private String hardDiskId;
	private String hardDiskName;
	private String price;
	private String storage;
	
	public HardDiskDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getHardDiskId() {
		return hardDiskId;
	}

	public void setHardDiskId(String hardDiskId) {
		this.hardDiskId = hardDiskId;
	}

	public String getHardDiskName() {
		return hardDiskName;
	}

	public void setHardDiskName(String hardDiskName) {
		this.hardDiskName = hardDiskName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "HardDiskDTO [hardDiskId=" + hardDiskId + ", hardDiskName=" + hardDiskName + ", price=" + price
				+ ", storage=" + storage + "]";
	}
	
	
	

}
