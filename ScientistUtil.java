class ScientistUtil{
	
	public static void main(String a[]){
		
		Scientist scientist =new Scientist();
		scientist.inventions();
		
		CV_Raman cv=new CV_Raman();
		cv.setBornOn(1888);
		cv.setKnownFor("Raman effect");
		cv.setDiedOn(1970);
		cv.inventions();
		cv.famousForPhysics();
		
		
		
		Scientist scein =new CV_Raman();
		CV_Raman cvr=(CV_Raman)scein;
		cvr.famousForPhysics();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}