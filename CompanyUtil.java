class CompanyUtil{
	
	public static void main(String a[]){
		
		Company company=new Company();
		company.provideJob();
		
		Google google =new Google();
		google.setFoundedIn(1998);
		google.setFoundedBy("Larry Page and Sergey Brin");
		google.setHeadquarters("US");
		google.setNoOfEmployees(139995);
		google.provideJob();
		google.multinationalCompany();
		
		Company comp =new Google();
		
		
		
	}
	
}