class LightFactory{
	
	//Object creation logic
	public static Switch getLight(String input){
		
		if(input.equalsIgnoreCase("TubeLight")){
			return new TubeLightImpl();
		}
		else if(input.equalsIgnoreCase("CflBulb")){
			return new CflBulbImpl();
		}
		else{
			System.out.println("No light Found");
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}