package com.mobile.mobileapp.dao;

import com.mobile.mobileapp.dto.ApplicationDTO;

public class MobileDAOImpl implements MobileDAO {
	
	private ApplicationDTO[] apps;
	private int index;
	
	public MobileDAOImpl(int size) {
		apps = new ApplicationDTO[size]; 
	}
	
	@Override
	public boolean saveApplication(ApplicationDTO apps) {
		boolean savedApplication = false;
		if(apps != null && !apps.getApplicationName().isEmpty()) {
			this.apps[index++]=apps;
			savedApplication = true;
		}else if(apps.getApplicationName().isEmpty()) {
			System.out.println("No Application found");
		}
		return savedApplication;
	}
	
	@Override
	public ApplicationDTO[] getApplication() {
		return apps;
	}
	
	@Override
	public boolean updateSizeByApplicationName(String size, String applicationName) {
		boolean updatedSize = false;
		if(size != null && applicationName != null) {
			for (ApplicationDTO applicationDTO : apps) {
				if(applicationDTO.getApplicationName().equals(applicationName)) {
					applicationDTO.setSize(size);
					updatedSize = true;
				}else {
					System.out.println("Application not found");
				}
			}
		}
		return updatedSize;
	}
	
	@Override
	public boolean deleteAppByApplicationId(int applicationId) {
		boolean deleted = false;
		for (int i = 0; i < apps.length; i++) {
			if(apps[i] != null) {
				if(apps[i].getApplicationId()==applicationId) {
					apps[i] = null;
					deleted = true;
				}else {
					System.out.println("Application not found");
				}
			}
		}
		return deleted;
	}
	
	
	
	
	
	
	

}
