class Google extends Company{
	
	@Override
	public void provideJob(){
		System.out.println(super.getFoundedIn());
		System.out.println(super.getFoundedBy());
		System.out.println(super.getHeadquarters());
		System.out.println(super.getNoOfEmployees());
		System.out.println("Invoked provide job method in google");
	}
	
	public void multinationalCompany(){
		System.out.println("Google is a American multinational company ");
	}
	
}