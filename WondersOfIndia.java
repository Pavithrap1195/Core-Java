class WondersOfIndia{
	
	public int wondersOfIndiaId;
	public String name;
	public String location;
	public int height;
	public double areaInHectares;
	
	public WondersOfIndia(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.wondersOfIndiaId;
	}
	
	@Override
	public boolean equals(Object wonders){
		if(wonders instanceof WondersOfIndia){
			WondersOfIndia won =(WondersOfIndia)wonders;
			if(this.hashCode()==won.hashCode()){
				return true;
			}
			if(this.name.equals(won.name)){
				return true;
			}else{
				System.out.println("Name is different");
			}
			if(this.location.equals(won.location)){
				return true;
			}else{
				System.out.println("Location is different");
			}
			if(this.height==won.height){
				return true;
			}else{
				System.out.println("Height is different");
			}
			if(this.areaInHectares==won.areaInHectares){
				return true;
			}else{
				System.out.println("Area is different");
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}