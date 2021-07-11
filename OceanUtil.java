class OceanUtil{
	
	public static void main(String a[]){
		Ocean ocean=new Ocean();
		ocean.saltWater();
		
		Pacific pacific =new Pacific();
		pacific.setAreaInSqkm(165200000);
		pacific.setAverageDepthInMeter(4280);
		pacific.saltWater();
		pacific.foragingHabitat();
		
		Ocean ocea=new Pacific();
		Pacific paci=(Pacific)ocea;
		paci.foragingHabitat();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}