class MonumentUtil{
	
	public static void main(String a[]){
		
		Monument monument =new Monument();
		monument.commemorate();
		
		TajMahal taj =new TajMahal();
		taj.setLocated("Agra,UttarPradesh");
		taj.setHeightInMeter(73);
		taj.setAreaInHectares(17);
		taj.commemorate();
		taj.tomb();
		
		Monument monu =new TajMahal();
		TajMahal tajm=(TajMahal)monu;
		tajm.tomb();
		
	}
	
}