class ApplicationDTO{
	
	private int applicationId;
	private String name;
	private String sizeInMb;
	private String type;
	private boolean internetRequired;
	
	public ApplicationDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setApplicationId(int applicationId){
		this.applicationId=applicationId;
	}
	
	public int getApplicationId(){
		return applicationId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSizeInMb(String sizeInMb){
		this.sizeInMb=sizeInMb;
	}
	
	public String getSizeInMb(){
		return sizeInMb;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	public String getType(){
		return type;
	}
	
	public void isInternetRequired(boolean internetRequired){
		this.internetRequired=internetRequired;
	}
	
	public boolean getInternetRequired(){
		return internetRequired;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}