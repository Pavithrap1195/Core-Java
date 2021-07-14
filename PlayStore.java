class PlayStore{
	
	public int playStoreId;
	public String applicationName;
	public String type;
	public int sizeInMb;
	public double ratedInStar;
	
	public PlayStore(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.playStoreId;
	}
	
	@Override
	public boolean equals(Object playstore){
		if(playstore instanceof PlayStore){
			PlayStore plays =(PlayStore)playstore;
			if(this.hashCode()==plays.hashCode()){
				return true;
			}
			if(this.applicationName.equals(plays.applicationName)){
				return true;
			}else{
				System.out.println("Name is different");
			}
			if(this.type.equals(plays.type)){
				return true;
			}else{
				System.out.println("Type is different");
			}
			if(this.sizeInMb==plays.sizeInMb){
				return true;
			}else{
				System.out.println("Size is different");
			}
			if(this.ratedInStar==plays.ratedInStar){
				return true;
			}else{
				System.out.println("Rating is different");
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}