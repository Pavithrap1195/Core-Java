class SbiBank extends Bank{
	
	public String address="JP Nagar";
	public String ifscCode="SBIN1253698";
	public int noOfBranches=75;
	
	@Override
	public String provideLoanOnRateOfInterest(){
		return "10%";
	}
	
	public void displayDetails(){
		System.out.println(address);
		System.out.println(ifscCode);
		System.out.println(noOfBranches);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}