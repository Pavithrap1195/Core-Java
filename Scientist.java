class Scientist{
	

    int bornOn;
    String knownFor;
    int diedOn;
	
	public Scientist(){
		System.out.println("Scientist object is created");
	}
	
	public void inventions(){
		System.out.println("A scientist is a person who conducts scientific research");
	}
	
	public void setBornOn(int bornOn){
		this.bornOn=bornOn;
	}
	
	public int getBornOn(){
		return bornOn;
	}
	
	public void setKnownFor(String knownFor){
		this.knownFor=knownFor;
	}
	
	public String getKnownFor(){
		return knownFor;
	}
	
	public void setDiedOn(int diedOn){
		this.diedOn=diedOn;
	}
	
	public int getDiedOn(){
		return diedOn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}