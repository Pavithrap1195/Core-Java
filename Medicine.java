class Medicine{
	
	public static String name;
	public static double price;
	public static String expiryDate;
	public static String manufactureDate;
	
	public Medicine(){
		System.out.println("Medicine object is created");
	}
	
	{
		System.out.println("Medicine init block is started");
		name="Rantac";
		price=10;
		expiryDate="22 10 2021";
		manufactureDate="11 05 2021";
		System.out.println(name+" "+price+" "+expiryDate+" "+manufactureDate);
		System.out.println("Medicine init block is ended");
	}
	
	static{
		System.out.println("Medicine static block is started");
		name="Rantac";
		price=10;
		expiryDate="22 10 2021";
		manufactureDate="11 05 2021";
		System.out.println(name+" "+price+" "+expiryDate+" "+manufactureDate);
		System.out.println("Medicine static block is ended");
	}
	
	public static void cures(){
		System.out.println("Medicine cures any health issues");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}