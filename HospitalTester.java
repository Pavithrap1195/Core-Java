import java.util.Scanner;

class HospitalTester{
	
	public static void main(String a[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		Hospital hospital =new Hospital(size);
		
		PatientDTO dto=new PatientDTO();
		dto.setName("Hemanth");
		dto.setPatientId("1");
		dto.setAge(45);
		dto.setMobileNo(7897987858L);
		String addressDetails[]={"Hampinagar,Bangalore-56004","Hubbali,Karnataka-789788"};
		dto.setAddress(addressDetails);
		
		PatientDTO patient=new PatientDTO();
		patient.setName("Kishan");
		patient.setPatientId("2");
		patient.setAge(55);
		patient.setMobileNo(7897987868L);
		String addressDetails1[]={"Vijaynagar,Bangalore-56004","Bidar,Karnataka-789789"};
		patient.setAddress(addressDetails1);
		
		hospital.savePatients(dto);
		hospital.savePatients(patient);
		
		hospital.getPatients();
		hospital.updatePatientsMobileNoByPatientId(9856452635L,"1");
		hospital.getPatients();
		hospital.deletePatientById("1");
		hospital.getPatients();
		hospital.getPatientByName("Hemanth");
		hospital.getPatientByName("Kishan");
		hospital.getPatientAgeByName("Kishans");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}