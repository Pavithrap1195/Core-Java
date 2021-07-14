class Furniture{
	
	public String type="Wooden,plastic,steel";
	public double price=1500;
	public boolean isPortable=false;
	
	public Furniture(){
		System.out.println();
	}
	
	public Object studyPurpose(){
		return "study table";
	}
	
	@Override
	public boolean equals(Object furn){
		if(furn instanceof Furniture){
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}