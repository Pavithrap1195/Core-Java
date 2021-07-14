class ElectronicDeviceUtil{
	
	public static void main(String a[]){
		
		ElectronicDevice elect =new Television();
		Television tele =(Television)elect;
		tele.printDetails();
		System.out.println(tele.expensive());
		
		ElectronicDevice ele =new ElectronicDevice();
		boolean ty=ele.equals(elect);
		System.out.println(ty);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}