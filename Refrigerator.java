class Refrigerator{
	
	public static String companyName;
	public static int electricityConsumptionUnitsPerYear;
	public static String modelNumber;
	public static String volume;
	
	public Refrigerator(){
		System.out.println("Refrigerator object is created");
	}
	
	{
		System.out.println("Refrigerator init block is started");
		companyName="Whirlpool";
		electricityConsumptionUnitsPerYear=170;
		modelNumber="DC 215 F/2018";
		volume="200 liters";
		System.out.println(companyName+" "+electricityConsumptionUnitsPerYear+" "+modelNumber+" "+volume);
		System.out.println("Refrigerator init block is ended");
	}

	static{
		System.out.println("Refrigerator static block is started");
		companyName="Whirlpool";
		electricityConsumptionUnitsPerYear=170;
		modelNumber="DC 215 F/2018";
		volume="200 liters";
		System.out.println(companyName+" "+electricityConsumptionUnitsPerYear+" "+modelNumber+" "+volume);
		System.out.println("Refrigerator static block is ended");
	}
	
	public static void cools(){
		System.out.println("Refrigerator provides cooling effect");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}