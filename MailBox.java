class MailBox{
	
	public static String sentBy;
    public static String received;
	public static boolean isThereAttachment;
	
	public MailBox(){
		System.out.println("MailBox object is created");
	}
	
	{
		System.out.println("MailBox init block is started");
		sentBy="Pavithra";
		received="16 07 2021";
		isThereAttachment=true;
		System.out.println(sentBy+" "+received+" "+isThereAttachment);
		System.out.println("MailBox init block is ended");
	}
	
	static{
		System.out.println("MailBox static block is started");
		sentBy="Pavithra";
		received="16 07 2021";
		isThereAttachment=true;
		System.out.println(sentBy+" "+received+" "+isThereAttachment);
		System.out.println("MailBox static block is ended");
	}
	
	public static void communication(){
		System.out.println("MailBox is used for communication purpose");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}