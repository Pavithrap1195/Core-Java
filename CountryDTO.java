class CountryDTO{
	
	private String countryName;
	private StateDTO[] states;
	
	public CountryDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setStates(StateDTO[] states){
		this.states=states;
	}
	
	public StateDTO[] getStates(){
		return states;
	}
	
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}
	
	public String getCountryName(){
		return countryName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}