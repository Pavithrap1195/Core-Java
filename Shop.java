class Shop{
	
	public static String name;
	public static String location;
	public static int noOfFloors;
	
	public Shop(){
		System.out.println("Shop object is created ");
	}
	
	{
		System.out.println("Shop init block is started");
		name="Royal mart";
		location="Anjananagar";
		noOfFloors=3;
		System.out.println(name+" "+location+" "+noOfFloors);
		System.out.println("Shop init block is ended");
	}
	
	static{
		System.out.println("Shop static block is started");
		name="Royal mart";
		location="Anjananagar";
		noOfFloors=3;
		System.out.println(name+" "+location+" "+noOfFloors);
		System.out.println("Shop static block is ended");
	}
	
	public static void purchasing(){
		System.out.println("All the necessary items is available");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}