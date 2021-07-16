class Minerals{
	
	public static String name;
	public static String symbol;
	public static int atomicNumber;
	public static double densityIngpcm3;
	public static String color;
	
	public Minerals(){
		System.out.println("Minerals object is created");
	}
	
	{
		System.out.println("Minerals init block is started");
		name="Copper";
		symbol="Cu";
		atomicNumber=29;
		densityIngpcm3=8.96;
		color="Orange";
		System.out.println(name+" "+symbol+" "+atomicNumber+" "+densityIngpcm3+" "+color);
		System.out.println("Minerals init block is ended");
	}

	static{
		System.out.println("Minerals static block is started");
		name="Copper";
		symbol="Cu";
		atomicNumber=29;
		densityIngpcm3=8.96;
		color="Orange";
		System.out.println(name+" "+symbol+" "+atomicNumber+" "+densityIngpcm3+" "+color);
		System.out.println("Minerals static block is ended");
	}
	
	public static void naturallyOccuring(){
		System.out.println("Mineral is a chemical compound");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



