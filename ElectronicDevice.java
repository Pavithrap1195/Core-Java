class ElectronicDevice{
	
	public double price=50000.00;
	public String brand="Samsung";
	public String color ="Black";
	
	public ElectronicDevice(){
		System.out.println();
	}
	
	public Number expensive(){
		return 38;
	}
	
	@Override
	public boolean equals(Object elec){
		if(elec instanceof ElectronicDevice){
			return true;
		}
		return false;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}