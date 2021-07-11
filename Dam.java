class Dam{
	
	String location;
	int heightInMeters;
	int opened;
	
	public Dam(){
		System.out.println("Dam object is created");
	}
	
	public void barrier(){
		System.out.println("A dam is a barrier that stops or restricts the flow of surface water or underground streams.");
	}
	
	public void setLocation(String location){
		this.location=location;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setHeightInMeters(int heightInMeters){
		this.heightInMeters=heightInMeters;
	}
	
	public int getHeightInMeters(){
		return heightInMeters;
	}
	
	public void setOpened(int opened){
		this.opened=opened;
	}
	
	public int getOpened(){
		return opened;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}