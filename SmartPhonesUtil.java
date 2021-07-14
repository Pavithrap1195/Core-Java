class SmartPhonesUtil{
	
	public static void main(String a[]){
		
		SmartPhones smart =new SmartPhones();
		smart.smartPhonesId=45;
		smart.brandName="Realme";
		smart.internalStorageInGb=64;
		smart.batteryCapacityInMah=5000;
		smart.operatingSystem="Android";
		System.out.println(smart.brandName);
		System.out.println(smart.hashCode());
		
		SmartPhones smartphone =new SmartPhones();
		smartphone.smartPhonesId=405;
		smartphone.brandName="Samsung";
		smartphone.internalStorageInGb=128;
		smartphone.batteryCapacityInMah=4000;
		smartphone.operatingSystem="Android";
		System.out.println(smartphone.brandName);
		System.out.println(smartphone.hashCode());
		
		boolean type =smartphone.equals(smart);
		System.out.println(type);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}