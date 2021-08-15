package com.hospital.hospitalapp.dao;

import com.hospital.hospitalapp.dto.PatientDTO;

public class HospitalDAOImpl implements HospitalDAO {

	private PatientDTO[] patient;
	private int index;

	public HospitalDAOImpl(int size) {
		patient = new PatientDTO[size];
	}

	@Override
	public boolean savePatient(PatientDTO patient) {
		boolean savedPatient = false;
		if (patient != null && !patient.getPatientId().isEmpty()) {
			this.patient[index++] = patient;
			savedPatient = true;
		} else if (patient.getPatientId().isEmpty()) {
			System.out.println("Patient not found");
		}
		return savedPatient;
	}

	@Override
	public PatientDTO[] getPatient() {
		return patient;
	}

	@Override
	public boolean updatePatientMobileNumberByPatientId(long mobileNo, String patientId) {
		boolean updated = false;
		if (mobileNo > 0 && patientId != null) {
			for (PatientDTO patientDTO : patient) {
				if (patientDTO.getPatientId().equals(patientId)) {
					patientDTO.setMobileNo(mobileNo);
					updated = true;
				} else {
					System.out.println("Patient not found");
				}
			}
		}
		return updated;
	}

	@Override
	public boolean deletePatientByPatientName(String patientName) {
		boolean deleted = false;
		for (int i = 0; i < patient.length; i++) {
			if (patient[i] != null) {
				if (patient[i].getPatientName().equals(patientName)) {
					patient[i] = null;
					deleted = true;
				} else {
					System.out.println("Patient not found");
				}
			}
		}
		return deleted;
	}

	
}
