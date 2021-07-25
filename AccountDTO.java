class AccountDTO{
	
	private int accountId;
	private String name;
	private int subscribers;
	private int noOfViews;
	
	public AccountDTO(){
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void setAccountId(int accountId){
		this.accountId=accountId;
	}
	
	public int getAccountId(){
		return accountId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSubscribers(int subscribers){
		this.subscribers=subscribers;
	}
	
	public int getSubscribers(){
		return subscribers;
	}
	
	public void setNoOfViews(int noOfViews){
		this.noOfViews=noOfViews;
	}
	
	public int getNoOfViews(){
		return noOfViews;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}