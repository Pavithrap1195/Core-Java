package com.mobile.mobileapp.dao;

import com.mobile.mobileapp.dto.ApplicationDTO;

public interface MobileDAO {
	
	public boolean saveApplication(ApplicationDTO apps);
	
	public ApplicationDTO[] getApplication();
	
	public boolean updateSizeByApplicationName(String size, String applicationName);
	
	public boolean deleteAppByApplicationId(int applicationId);

}
