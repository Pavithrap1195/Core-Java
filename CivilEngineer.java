class CivilEngineer extends Engineer{
	
	Constants branch =Constants.CIVIL;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void construction(){
		System.out.println("Constructing any buildings is the work of"+this.branch);
	}
	
	public Constants getBranch(){
		return branch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}