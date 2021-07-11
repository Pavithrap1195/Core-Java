class Company{
	
	int foundedIn;
	String foundedBy;
	String headquarters;
	int noOfEmployees;
	
	public Company(){
		System.out.println("Company object is created");
	}
	
	public void provideJob(){
		System.out.println("Company provide us job opportunities");
	}
	
	public void setFoundedIn(int foundedIn){
		this.foundedIn=foundedIn;
	}
	
	public int getFoundedIn(){
		return foundedIn;
	}
	
	public void setFoundedBy(String foundedBy){
		this.foundedBy=foundedBy;
	}
	
	public String getFoundedBy(){
		return foundedBy;
	}
	
	public void setHeadquarters(String headquarters){
		this.foundedBy=foundedBy;
	}
	
	public String getHeadquarters(){
		return headquarters;
	}
	
	public void setNoOfEmployees(int noOfEmployees){
		this.noOfEmployees=noOfEmployees;
	}
	
	public int getNoOfEmployees(){
		return noOfEmployees;
	}
	
}