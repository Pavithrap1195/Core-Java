class BranchDTO{
	
	private int branchId;
	private String name;
	private String ifscCode;
	private String address;
	private long mobileNo;
	
	public BranchDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setBranchId(int branchId ){
		this.branchId=branchId;
	}
	
	public int getBranchId(){
		return branchId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setIfscCode(String ifscCode){
		this.ifscCode=ifscCode;
	}
	
	public String getIfscCode(){
		return ifscCode;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setMobileNo(long mobileNo){
		this.mobileNo=mobileNo;
	}
	
	public long getMobileNo(){
		return mobileNo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}