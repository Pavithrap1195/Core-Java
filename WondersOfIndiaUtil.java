class WondersOfIndiaUtil{
	
	public static void main(String a[]){
		WondersOfIndia wonders =new WondersOfIndia();
		wonders.wondersOfIndiaId=758;
		wonders.name="Taj Mahal";
		wonders.location="Agra,UttarPradesh";
		wonders.height=73;
		wonders.areaInHectares=17;
		System.out.println(wonders.name);
		System.out.println(wonders.hashCode());
		
		WondersOfIndia india =new WondersOfIndia();
		india.wondersOfIndiaId=758;
		india.name="Taj Mahal";
		india.location="Agra,UttarPradesh";
		india.height=73;
		india.areaInHectares=17;
		System.out.println(india.name);
		System.out.println(india.hashCode());
		
		boolean type=india.equals(wonders);
		System.out.println(type);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}