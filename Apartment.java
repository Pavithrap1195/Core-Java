class Apartment{
	
	public int apartmentId;
	public String name;
    public String location;
    public int noOfFlats;
    public int noOfBlocks;
	public boolean isAmenitiesAvailable;
	
	public Apartment(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.apartmentId;
	}
	
	@Override
	public boolean equals(Object apartment){
		if(apartment instanceof Apartment){
			Apartment apart1 =(Apartment)apartment;
			if(this.hashCode()==apart1.hashCode()){
				return true;
			}
				if(this.name.equals(apart1.name)){
					return true;
				}else{
					System.out.println("Names are different");
				}
				if(this.location.equals(apart1.location)){
					return true;
				}else{
					System.out.println("Location are different");
				}
				if(this.noOfFlats==apart1.noOfFlats){
					return true;
				}else{
					System.out.println("No of flats are different");
				}
				if(this.noOfBlocks==apart1.noOfBlocks){
					return true;
				}else{
					System.out.println("No of Blocks are different");
				}
				if(this.isAmenitiesAvailable==apart1.isAmenitiesAvailable){
					return true;
				}else{
					System.out.println("Amanities are not available");
				}
			}else{
				System.out.println("Not a same type");
				return false;
			}
			return false;
	}
	
}