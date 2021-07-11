class PlasticUtil{
	
	public static void main(String a[]){
		Plastic plastic =new Plastic();
		plastic.deforms();
		
		Chair chair =new Chair();
		chair.setId(125);
		chair.setPrice(450);
		chair.setBrandName("Nilkamal");
		chair.setIsDurable(true);
		/*System.out.println(chair.getId());
		System.out.println(chair.getPrice());
		System.out.println(chair.getBrandName());
		System.out.println(chair.getIsDurable());*/
		
		/*We can print the values using super keyword in child class or we can call getter method in tester file*/
		chair.deforms();
		chair.seating();
		
		Plastic plast=new Chair();
		plast.setId(128);
		plast.setPrice(580);
		plast.setBrandName("cereo");
		plast.setIsDurable(true);
		Chair ref=(Chair)plast;
		ref.seating();
		System.out.println(plast.getId());
		System.out.println(plast.getPrice());
		System.out.println(plast.getBrandName());
		System.out.println(plast.getIsDurable());
	
	
	}
}