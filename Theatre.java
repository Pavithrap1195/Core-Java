class Theatre{
	
	public int theatreId;
	public String name;
	public String location;
	public int totalNoOfSeats;
	public int noOfScreens;
	
	public Theatre(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.theatreId;
	}
	
	@Override
	public boolean equals(Object thea){
		if(thea instanceof Theatre){
			Theatre thear=(Theatre)thea;
			if(this.hashCode()==thear.hashCode()){
				return true;
			}
			if(this.name.equals(thear.name)){
				return true;
			}else{
				System.out.println("Name is different");
			}
			if(this.location.equals(thear.location)){
				return true;
			}else{
				System.out.println("Location is different");
			}
			if(this.totalNoOfSeats==thear.totalNoOfSeats){
				return true;
			}else{
				System.out.println("No of seats are different");
			}
			if(this.noOfScreens==thear.noOfScreens){
				return true;
			}else{
				System.out.println("No of screens are different");
			}
		}else{
			System.out.println("Not same type");
			return false;
			}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}