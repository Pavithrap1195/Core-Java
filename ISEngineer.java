class ISEngineer extends Engineer{
	
	Constants branch=Constants.IS;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void programming(){
		System.out.println(this.branch+" does programming work ");
	}
	
	public Constants getBranch(){
		return branch;
	}
}