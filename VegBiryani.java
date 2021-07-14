class VegBiryani extends Food{
	
	public boolean isSpicy=true;
	public boolean isSweet=false;
	public double price=210;
	
	@Override
	public String tastyAndSpicy(){
		return "spicy";
	}
	
	public void printDetails(){
		System.out.println(isSpicy);
		System.out.println(isSweet);
		System.out.println(price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}