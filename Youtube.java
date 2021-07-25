class Youtube{
	
	private AccountDTO[] account;
	private int index;
	
	public Youtube(int size){
		account=new AccountDTO[size];
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public boolean createAccount(AccountDTO account){
		boolean createdaccount=false;
		System.out.println("Invoked createAccount()");
		if(account!=null){
			this.account[index++]=account;
			createdaccount=true;
		}else{
			System.out.println("AccountDTO not found");
		}
		return createdaccount;
	}
	
	public void getAccount(){
		System.out.println("Invoked getAccount()");
		for(AccountDTO acc : account){
			if(acc!=null){
				System.out.println(acc.getAccountId()+" "+acc.getName()+" "+acc.getSubscribers()+" "+acc.getNoOfViews());
			}else{
				System.out.println("AccountDTO not found");
			}
		}
	}
	
	public boolean updateNoOfViewsByName(int noOfViews,String name){
		System.out.println("Invoked updateNoOfViewsByName()");
		boolean updated=false;
		for(AccountDTO dto : account){
			if(dto!=null){
				if(name.equals(dto.getName())){
					dto.setNoOfViews(noOfViews);
					updated=true;
				}else{
					System.out.println(name+" not found");
				}
			}else{
				System.out.println("AccountDTO not found");
			}
		}
		return updated;
	}
	
	public boolean deleteAcoountByAccountId(int accountId){
		System.out.println("Invoked deleteAcoountByAccountId()");
		boolean deleted=false;
		for(int i=0;i<account.length;i++){
			if(account[i]!=null){
				if(accountId==account[i].getAccountId()){
				account[i]=null;
				deleted =true;
				}else{
				System.out.println(accountId+" not found");
				}
			}else{
				System.out.println("AccountDTO not found");
			}
		}
		return deleted;
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}