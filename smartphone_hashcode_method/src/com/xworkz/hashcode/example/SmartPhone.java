package com.xworkz.hashcode.example;

public class SmartPhone {
	
	public int smartPhoneId;
	public String brandName;
	public int internalStorageInGb;
	public int batteryCapacityInMah;
	public String operatingSystem;
	
	public SmartPhone() {
		System.out.println();
	}
	
	@Override
	public int hashCode() {
		return this.smartPhoneId;
	}
	
	@Override
	public boolean equals(Object phone) {
		if(phone instanceof SmartPhone) {
			SmartPhone smart=(SmartPhone)phone;
			if(this.hashCode()==smart.hashCode()) {
				return true;
			}else {
				System.out.println("Hashcodes are different");
			}
				if(this.brandName.equals(smart.brandName)) {
					return true;
				}else {
					System.out.println("Names are different");
				}
					if(this.internalStorageInGb==smart.internalStorageInGb) {
						return true;
					}else {
						System.out.println("Internal storage are different");
					}
						if(this.batteryCapacityInMah==smart.batteryCapacityInMah) {
							return true;
						}else {
							System.out.println("Battery capacity are different");
						}
							if(this.operatingSystem.equals(smart.operatingSystem)) {
								return true;
							}else {
								System.out.println("Operating system are different");
							}
		}else {
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
}
