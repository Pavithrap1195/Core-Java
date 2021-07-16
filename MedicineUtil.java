class MedicineUtil{
	
	static{
		System.out.println("Executing medicineutil");
	}
	
	public static void main(String a[]){
		Medicine med=new Medicine();
		
		{
			System.out.println("Medicine static block is started");
			Medicine.cures();
			System.out.println("Medicine static block is ended");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}