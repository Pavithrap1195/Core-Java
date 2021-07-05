class Exam{

String code;
HallTicket hallTicket;
static String universityName="VTU";
double fees;

public Exam(){
System.out.println("Exam object is created");
}

public boolean allow(HallTicket hallTicket){
	System.out.println("Invoked allow");
	boolean there=false;
	if(this.fees>=1000){
		System.out.println("Fees is paid");
		if(hallTicket!=null){
			there=true;
			this.hallTicket=hallTicket;
			this.hallTicket.displayHallTicketDetails();
			System.out.println("EXAM CODE:"+this.code);
		}
		else{
			System.out.println("No hall ticket");
		}
	}
	else{
		System.out.println("Fees paid is less");
	}
	return there;
}
}