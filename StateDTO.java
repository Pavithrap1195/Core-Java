class StateDTO{
	
	private String stateName;
	private CityDTO[] cities;
	
	public StateDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setCities(CityDTO[] cities){
		this.cities=cities;
	}
	
	public CityDTO[] getCities(){
		return cities;
	}
	
	public void setStateName(String stateName){
		this.stateName=stateName;
	}
	
	public String getStateName(){
		return stateName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}