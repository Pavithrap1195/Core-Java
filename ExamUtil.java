class ExamUtil{
	public static void main(String a[]){
		Exam exam=new Exam();
		exam.code="SJB2017";
		exam.fees=2000;
		
		HallTicket hallTicket=new HallTicket("1JB13CV075",8,"Pavithra");
		boolean allowed =exam.allow(hallTicket);
		if(allowed){
			System.out.println("Can write exam");
		}
		else{
			System.out.println("Cannot write exam");
		}
		
		System.out.println("***********************");
		Exam exam1=new SupplementaryExam();
		boolean allowedForSupplementary=exam.allow(hallTicket);
		if(allowedForSupplementary){
			System.out.println("Can write Supplementary Exam");
		}
		else{
			System.out.println("Cannot write Supplementary Exam");
		}
	}
}