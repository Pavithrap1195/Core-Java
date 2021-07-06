class EEEEngineer extends Engineer{
	
	Constants branch =Constants.EEE;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void designCircuits(){
		System.out.println(this.branch+" branch deals with designing circuits" );
	}
	
	public Constants getBranch(){
		return branch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}