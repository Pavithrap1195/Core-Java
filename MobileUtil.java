import java.util.Scanner;

class MobileUtil{
	
	public static void main(String a[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		Mobile mobile=new Mobile(size);
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the application Id");
			int applicationId=sc.nextInt();
			System.out.println("Enter application name");
			String name=sc.next();
			System.out.println("Enter the application type");
			String type=sc.next();
			System.out.println("Enter the application size in Mb");
			String sizeInMb=sc.next();
			System.out.println("Is application internet required");
			String internetRequired=sc.next();
			
			ApplicationDTO apps=new ApplicationDTO();
			apps.setApplicationId(applicationId);
			apps.setName(name);
			apps.setType(type);
			apps.setSizeInMb(sizeInMb);
			apps.isInternetRequired(Boolean.parseBoolean(internetRequired));
			
		System.out.println(mobile.createApps(apps));
		}
		mobile.getApps();
		
		System.out.println("Update size in Mb by name of application");
		System.out.println("Enter the name of application");
		String name1=sc.next();
		System.out.println("Enter the size of application");
		String sizeInMb=sc.next();
		System.out.println(mobile.updateAppSizeByName(sizeInMb,name1));
		
		mobile.getApps();
		
		System.out.println("Delete app by application Id");
		System.out.println("Enter the application Id");
		int applicationId1=sc.nextInt();
		System.out.println(mobile.deleteAppByApplicationId(applicationId1));
		
		mobile.getApps();
		
		System.out.println("Get app by application Id");
		System.out.println("Enter the application Id");
		int applicationId2=sc.nextInt();
		mobile.getAppsByApplicationId(applicationId2);
		
		System.out.println("Get app by type");
		System.out.println("Enter the application type");
		String type1=sc.next();
		mobile.getApplicationByType(type1);
		
		System.out.println("Get app by internet Required");
		System.out.println("Is application internet required");
		Boolean internetRequired1=sc.nextBoolean();
		mobile.getApplicationByInternetRequired(internetRequired1);
		
		
		
		
		
	}
	/*getAppsById();
	getAppsByInternetrequired();
	getAppsByType();*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}