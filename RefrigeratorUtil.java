class RefrigeratorUtil{
	
	static{
		System.out.println("Executing RefrigeratorUtil");
	}
	
	public static void main(String a[]){
		Refrigerator refre=new Refrigerator();
		
		{
			System.out.println("Refrigerator static block is started");
			Refrigerator.cools();
			System.out.println("Refrigerator static block is started");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}