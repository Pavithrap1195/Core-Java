class TajMahal extends Monument{
	
	@Override
	public void commemorate(){
		System.out.println(super.getLocated());
		System.out.println(super.getHeightInMeter());
	    System.out.println(super.getAreaInHectares());
	    System.out.println("Invoked commemorate method in tajmahal");
	}
	
	public void tomb(){
		System.out.println(" It is the tomb of shah jahan favourite wife, Mumtaz Mahal");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}