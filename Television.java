class Television extends ElectronicDevice{
	
	public double price=80000.00;
	public String brand="MI TV";
	public String color ="Grey";
	
	@Override
	public Integer expensive(){
		return 90000;
	}
	
	public void printDetails(){
		System.out.println(price);
		System.out.println(brand);
		System.out.println(color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}