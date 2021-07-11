class Chair extends Plastic{
	
	@Override
	public void deforms(){
	
		System.out.println(super.getId());
		System.out.println(super.getPrice());
		System.out.println(super.getBrandName());
		System.out.println(super.getIsDurable());
		System.out.println("Invoked deform method in chair");
		
	}
	
	public void seating(){
		System.out.println("Chair is used for seating purpose");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}