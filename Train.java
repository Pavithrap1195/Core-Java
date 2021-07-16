class Train{
	
	public static int trainNo;
	public static String trainName;
	public static String source;
	public static String destination;
	
	public Train(){
		System.out.println("Train object is created");
	}
	
	{
		System.out.println("Train init block is started");
		trainNo=47589;
		trainName="Shathabdi express";
		source="Mysore";
		destination="Chennai";
		System.out.println(trainNo+" "+trainName+" "+source+" "+destination);
		System.out.println("Init train data");
		System.out.println("Train init block is ended");
	}
	
	static{
		System.out.println("Train static block is started");
		trainNo=47589;
		trainName="Shathabdi express";
		source="Mysore";
		destination="Chennai";
		System.out.println(trainNo+" "+trainName+" "+source+" "+destination);
		System.out.println("Init train data");
		System.out.println("Train static block is ended");
	}
	
	public static void carryingPassenger(){
		System.out.println("Train carrys passengers in bulk");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}