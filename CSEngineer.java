class CSEngineer extends Engineer{
	
	Constants branch = Constants.CS;
	
	@Override
	public void problemSolving(){
		super.problemSolving();
		super.getUSN();
		//super.getCompanies();//*
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void coding(){
		System.out.println("Branch "+this.branch +" work is full of coding");
	}
	
	public Constants getBranch(){
		return branch;
	}
}