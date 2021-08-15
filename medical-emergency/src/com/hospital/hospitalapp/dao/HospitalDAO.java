package com.hospital.hospitalapp.dao;

import com.hospital.hospitalapp.dto.PatientDTO;

public interface HospitalDAO {
	
	public boolean savePatient(PatientDTO patient);
	
	public PatientDTO[] getPatient();
	
	public boolean updatePatientMobileNumberByPatientId(long mobileNo, String patientId);
	
	public boolean deletePatientByPatientName(String patientName);
	


}
