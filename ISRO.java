class ISRO extends ResearchCenter{
	
	@Override
	public void doingResearch(){
		System.out.println(super.getFormedOn());
		System.out.println(super.getType());
		System.out.println(super.getChairman());
		System.out.println("Invoked doing reasearch method in ISRO");
	}
	
	public void spaceAgency(){
		System.out.println("ISRO is a space agency");
	}
	
}