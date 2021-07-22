class AreaDTO{
	
	private String areaName;
	private StreetDTO[] streets;
	
	public AreaDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setStreets(StreetDTO[] streets){
		this.streets=streets;
	}
	
	public StreetDTO[] getStreets(){
		return streets;
	}
	
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}
	
	public String getAreaName(){
		return areaName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}