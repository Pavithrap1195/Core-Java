class FurnitureUtil{
	
	public static void main(String a[]){
		
		Furniture furn =new StudyTable();
		StudyTable table =(StudyTable)furn;
		table.printDetails();
		System.out.println(table.studyPurpose());
		
		Furniture furni =new Furniture();
		boolean type =furni.equals(furn);
		System.out.println(type);
		
		StudyTable study =new StudyTable();
		boolean type1 =study.equals(furn);
		System.out.println(type1);
		
		
		
		
		
	}
	
	
	
	

}