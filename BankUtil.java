import java.util.Scanner;

class BankUtil{
	
	public static void main(String a[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		Bank bank =new Bank(size);
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the branch Id");
			int branchId=sc.nextInt();
			System.out.println("Enter the branch name");
			String name=sc.next();
			System.out.println("Enter the ifsc code");
			String ifscCode=sc.next();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the mobile no");
			long mobileNo=sc.nextLong();
			
			BranchDTO branch=new BranchDTO();
			branch.setBranchId(branchId);
			branch.setName(name);
			branch.setIfscCode(ifscCode);
			branch.setAddress(address);
			branch.setMobileNo(mobileNo);
			
			System.out.println(bank.saveMoney(branch));
		}
		
		bank.getBranch();
		
		System.out.println("Update mobile no by branch Id");
		System.out.println("Enter the branch Id");
		int branchId1=sc.nextInt();
		System.out.println("Enter the mobile No");
		long mobileNo=sc.nextLong();
		System.out.println(bank.updateMobileNoByBranchId(mobileNo,branchId1));
		
		bank.getBranch();
		
		System.out.println("Delete branch by branch Id");
		System.out.println("Enter the branch Id");
		int branchId2=sc.nextInt();
		System.out.println(bank.deleteBranchByBranchId(branchId2));
		
		bank.getBranch();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}