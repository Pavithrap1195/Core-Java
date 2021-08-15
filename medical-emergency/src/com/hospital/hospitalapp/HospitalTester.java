package com.hospital.hospitalapp;

import java.util.Scanner;

import com.hospital.hospitalapp.dao.HospitalDAO;
import com.hospital.hospitalapp.dao.HospitalDAOImpl;
import com.hospital.hospitalapp.dto.PatientDTO;

public class HospitalTester {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		HospitalDAO hospitalDAO = new HospitalDAOImpl(size);
		
		for (int i = 0; i < size; i++) {
			
			PatientDTO dto = new PatientDTO();
			dto.setPatientId(sc.next());
			dto.setPatientName(sc.next());
			dto.setAddress(sc.next());
			dto.setMobileNo(sc.nextLong());
			dto.setAge(sc.nextInt());
			
			hospitalDAO.savePatient(dto);
			
			
		}
		
		PatientDTO[] patientDTO = hospitalDAO.getPatient();
		for (PatientDTO patientDTO2 : patientDTO) {
			System.out.println(patientDTO2);
		}
		
		System.out.println("Enter patient updated mobile number with patient id");
		hospitalDAO.updatePatientMobileNumberByPatientId(sc.nextLong(), sc.next());
		
		PatientDTO[] patientDTO1 = hospitalDAO.getPatient();
		for (PatientDTO patientDTO2 : patientDTO1) {
			System.out.println(patientDTO2);
		}
		
		System.out.println("Enter patient name to delete patient details");
		hospitalDAO.deletePatientByPatientName(sc.next());
		
		PatientDTO[] patientDTO3 = hospitalDAO.getPatient();
		for (PatientDTO patientDTO2 : patientDTO3) {
			System.out.println(patientDTO2);
		}
		
		/*System.out.println("Enter patient name to get patient age");
		hospitalDAO.getPatientAgeByName(sc.next());
		
		PatientDTO[] patientDTO4 = hospitalDAO.getPatient();
		for (PatientDTO patientDTO2 : patientDTO4) {
			System.out.println(patientDTO2);
		}*/
	}

}
