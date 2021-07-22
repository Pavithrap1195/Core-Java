class StreetDTO{
	
	private String streetName;
	private String[] streetNo;
	
	public StreetDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setStreetNo(String[] streetNo){
		this.streetNo=streetNo;
	}
	
	public String[] getStreetNo(){
		return streetNo;
	}	
	
	public void setStreetName(String streetName){
		this.streetName=streetName;
	}
	
	public String getStreetName(){
		return streetName;
	}
	
	
	
	
	
}