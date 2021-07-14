class ApartmentTester{
	
	public static void main(String a[]){
		Apartment apart=new Apartment();
		
		apart.apartmentId=62;
		apart.name="Rohan Akriti";
		apart.location="Gubbalala";
		apart.noOfFlats=540;
		apart.noOfBlocks=6;
		apart.isAmenitiesAvailable=true;
		System.out.println(apart.name);
		System.out.println(apart.hashCode());
		
		Apartment apartment =new Apartment();
		
		apartment.apartmentId=62;
		apartment.name="Rohan Avriti";
		apartment.location="Sarjapur";
		apartment.noOfFlats=240;
		apartment.noOfBlocks=3;
		apartment.isAmenitiesAvailable=true;
		System.out.println(apartment.name);
		System.out.println(apartment.hashCode());
		
		boolean type=apartment.equals(apart);
		System.out.println(type);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}