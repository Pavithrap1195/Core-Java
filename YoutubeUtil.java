import java.util.Scanner;

class YoutubeUtil{
	
	public static void main(String a[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		Youtube youtube=new Youtube(size);
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the account id");
			int accountId=sc.nextInt();
			System.out.println("Enter the name of the account");
			String name=sc.next();
			System.out.println("Enter the subscribers");
			int subscribers=sc.nextInt();
			System.out.println("Enter the no of viewers");
			int noOfViews=sc.nextInt();
			
			AccountDTO account=new AccountDTO();
			account.setAccountId(accountId);
			account.setName(name);
			account.setSubscribers(subscribers);
			account.setNoOfViews(noOfViews);
			
			System.out.println(youtube.createAccount(account));
		}
		youtube.getAccount();
		
		System.out.println("Update no of viewers by account name");
		System.out.println("Enter the account name");
		String name1=sc.next();
		System.out.println("Enter the no of viewers");
		int noOfViews=sc.nextInt();
		System.out.println(youtube.updateNoOfViewsByName(noOfViews,name1));
	
		youtube.getAccount();
		
		System.out.println("Delete account by account Id");
		System.out.println("Enter the account Id");
		int accountId=sc.nextInt();
		youtube.deleteAcoountByAccountId(accountId);
		
		youtube.getAccount();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}