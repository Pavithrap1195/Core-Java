class Athlete{
	
	String bornOn;
	String type;
	int diedAge;
	
	public Athlete(){
		System.out.println("Athlete object is created");
	}
	
	public void physicalStrength(){
		System.out.println("An athlete is a person who competes in one or more sports that involve physical strength, speed or endurance.");
	}
	
	public void setBornOn(String bornOn){
		this.bornOn=bornOn;
	}
	
	public String getBornOn(){
		return bornOn;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setDiedAge(int diedAge){
		this.diedAge=diedAge;
	}
	
	public int getDiedAge(){
		return diedAge;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}