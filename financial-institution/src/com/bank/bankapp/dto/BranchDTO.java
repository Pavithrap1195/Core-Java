package com.bank.bankapp.dto;

public class BranchDTO {

	private int branchId;
	private String branchName;
	private String ifscCode;
	private String address;
	private long contactNumber;

	public BranchDTO() {
		System.out.println(this.getClass().getSimpleName() + " Objects are created");
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "BranchDTO[branchId=" + branchId + ",branchName=" + branchName + ",ifscCode=" + ifscCode + ",address="
				+ address + ",contactNumber=" + contactNumber + "]";
	}

}
