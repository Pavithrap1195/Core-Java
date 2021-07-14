class FoodUtil{
	
	public static void main(String a[]){
		Food food=new VegBiryani();
		VegBiryani veg=(VegBiryani)food;
		veg.printDetails();
		System.out.println(veg.tastyAndSpicy());
		
		Food foo =new Food();
		boolean tp=foo.equals(food);
		System.out.println(tp);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}