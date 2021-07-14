class SmartPhones{
	
	public int smartPhonesId;
	public String brandName;
	public int internalStorageInGb;
	public int batteryCapacityInMah;
	public String operatingSystem;
	
	public SmartPhones(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.smartPhonesId;
	}
	
	@Override
	public boolean equals(Object phone){
		if(phone instanceof SmartPhones){
			SmartPhones smart =(SmartPhones)phone;
			if(this.hashCode()==smart.hashCode()){
				return true;
			}
			if(this.brandName.equals(smart.brandName)){
				return true;
			}else{
				System.out.println("Brand name is different");
			}
			if(this.internalStorageInGb==smart.internalStorageInGb){
				return true;
			}else{
				System.out.println("Internal storage is different");
			}
			if(this.batteryCapacityInMah==smart.batteryCapacityInMah){
				return true;
			}else{
				System.out.println("Battery capacity is different");
			}
			if(this.operatingSystem.equals(smart.operatingSystem)){
				return true;
			}else{
				System.out.println("Operating system is different");
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}