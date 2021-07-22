class AddressDTO{
	
	private CountryDTO countries;
	
	public AddressDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setCountries(CountryDTO countries){
		this.countries=countries;
	}
	
	public CountryDTO getCountries(){
		return countries;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}