package com.mobile.mobileapp;

import java.util.Scanner;

import com.mobile.mobileapp.dao.MobileDAO;
import com.mobile.mobileapp.dao.MobileDAOImpl;
import com.mobile.mobileapp.dto.ApplicationDTO;

public class MobileTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		MobileDAO mobileDAO = new MobileDAOImpl(size);
		
		for (int i = 0; i < size; i++) {
			
			ApplicationDTO app = new ApplicationDTO();
			app.setApplicationId(sc.nextInt());
			app.setApplicationName(sc.next());
			app.setSize(sc.next());
			app.setType(sc.next());
			app.setInternetRequired(sc.nextBoolean());
			
			mobileDAO.saveApplication(app);
			
		}
		
		ApplicationDTO[] applicationDTO = mobileDAO.getApplication();
			for (ApplicationDTO applicationDTO2 : applicationDTO) {
				System.out.println(applicationDTO2);
			}
			
			System.out.println("Enter the application size to be updated with application name");
			mobileDAO.updateSizeByApplicationName(sc.next(), sc.next());
			
			ApplicationDTO[] applicationDTO1 = mobileDAO.getApplication();
			for (ApplicationDTO applicationDTO2 : applicationDTO1) {
				System.out.println(applicationDTO2);
				
			}
			
			System.out.println("Enter the application id to delete application");
			mobileDAO.deleteAppByApplicationId(sc.nextInt());
			
			ApplicationDTO[] applicationDTO3 = mobileDAO.getApplication();
			for (ApplicationDTO applicationDTO2 : applicationDTO3) {
				System.out.println(applicationDTO2);
			}
			
			sc.close();
		}
		
	}


