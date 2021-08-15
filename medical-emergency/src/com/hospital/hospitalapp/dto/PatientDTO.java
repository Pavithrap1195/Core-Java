package com.hospital.hospitalapp.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	
	private String patientId;
	private String patientName;
	private String address;
	private long mobileNo;
	private int age;
	
	public PatientDTO() {
		System.out.println(this.getClass().getSimpleName()+" Objects are created");
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PatientDTO[patientId="+patientId+",patientName="+patientName+",address="+address+",mobileNo="+mobileNo+",age="+age+"]";
	}
	
	

}
