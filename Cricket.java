class Cricket extends Sport{
	
	@Override
	public void activity(){
		System.out.println(super.getFirstPlayed());
		System.out.println(super.getTeamMembers());
		System.out.println(super.getEquipmentUsed());
		System.out.println("Invoked activity method in cricket");
	}
	
	public void  batting(){
		System.out.println("Cricket is batting between two teams");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}