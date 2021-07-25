class Bank{
	
	private BranchDTO[] branch;
	private int index;
	
	public Bank(int size){
		branch=new BranchDTO[size];
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public boolean saveMoney(BranchDTO branch){
		System.out.println("Invoked saveMoney method");
		boolean saved=false;
		if(branch!=null){
			if(branch.getName()!=null && branch.getIfscCode()!=null){
				this.branch[index++]=branch;
				saved=true;
			}else{
				System.out.println("Branch name and ifsc code is empty");
			}
		}else{
			System.out.println("BranchDTO is not found");
		}
		return saved;
	}
	
	public void getBranch(){
		System.out.println("Invoked getBranch()");
		for(BranchDTO branc : branch){
			if(branc!=null){
				System.out.println(branc.getBranchId()+" "+branc.getName()+" "+branc.getIfscCode()+" "+branc.getAddress()+" "+branc.getMobileNo());
			}else{
				System.out.println("BranchDTO not found");
			}
		}
	}
	
	public boolean updateMobileNoByBranchId(long mobileNo,int branchId){
		System.out.println("Invoked updateMobileNoByBranchId()");
		boolean updatedMobileNo=false;
		for(BranchDTO br : branch){
			if(branchId==br.getBranchId()){
				br.setMobileNo(mobileNo);
				updatedMobileNo=true;
			}else{
				System.out.println("Branch id is different");
				}
		}
		return updatedMobileNo;
	}
	
	public boolean deleteBranchByBranchId(int branchId){
		System.out.println("Invoked deleteBranchByBranchId()");
		boolean deleted=false;
		for(int i=0;i<branch.length;i++){
			if(branch[i]!=null){
				if(branchId==branch[i].getBranchId()){
					branch[i]=null;
					deleted=true;
				}else{
					System.out.println("Branch id not found");
				}
			}else{
				System.out.println("BranchDTO is not found");
			}
		}
		return deleted;
	}
		
	


























}