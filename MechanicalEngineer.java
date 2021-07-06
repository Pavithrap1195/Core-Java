class MechanicalEngineer extends Engineer{
	
	Constants branch = Constants.MECH;
	
	@Override
	public void problemSolving(){
		//super.problemSolving();
		//super.getUSN();//*
		System.out.println("Invoked problem solving method of "+this.branch);
	}
	
	public void designing(){
		System.out.println("Mechanical Engineer works with machines");
	}
	
	public Constants getBranch(){
		return branch;
	}
}