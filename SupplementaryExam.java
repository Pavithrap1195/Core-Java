class SupplementaryExam extends Exam{
	public SupplementaryExam(){
		System.out.println("SupplementaryExam object is created");
	}
	
	public boolean allow(HallTicket hallTicket){
		System.out.println("Invoked allow from Supplementary Exam");
		super.code="1JB13CV075";
		super.fees=2000;
		return super.allow(hallTicket);
	}
}