class Companies{

String name;
String founded;
String industry;
String founder;
String headquarter;

public void printCompaniesDetails(){
	System.out.println(name+" "+founded+" "+industry+" "+founder+" "+headquarter);
}

public Companies(String nam,String found,String indust,String founde,String head){
	name=nam;
	founded=found;
	industry=indust;
	founder=founde;
	headquarter=head;
}

public static void jobOpportunity(){
	System.out.println("Companies provide job opportunity");
}
}