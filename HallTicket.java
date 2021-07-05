class HallTicket{

String ticketNo;
int noOfSubjects;
String candidateName;

public HallTicket(String ticketNo,int noOfSubjects,String candidateName){
	this.ticketNo=ticketNo;
	this.noOfSubjects=noOfSubjects;
	this.candidateName=candidateName;
}

public void displayHallTicketDetails(){
	System.out.println(this.ticketNo+" "+this.noOfSubjects+" "+this.candidateName);
}










}