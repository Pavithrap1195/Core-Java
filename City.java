class City{
	
	boolean isCapital;
	String foundedBy;
	int establishedIn;
	
	
	public City(){
		System.out.println("City object is created");
	}
	
	public void settledPlace(){
		System.out.println("A city is a large human settlement.");
	}
	
	public void setIsCapital(boolean isCapital){
		this.isCapital=isCapital;
	}
	
	public boolean getIsCapital(){
		return isCapital;
	}
	
	public void setFoundedBy(String foundedBy){
		this.foundedBy=foundedBy;
	}
	
	public String getFoundedBy(){
		return foundedBy;
	}
	
	public void setEstablishedIn(int establishedIn){
		this.establishedIn=establishedIn;
	}
	
	public int getEstablishedIn(){
		return establishedIn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}