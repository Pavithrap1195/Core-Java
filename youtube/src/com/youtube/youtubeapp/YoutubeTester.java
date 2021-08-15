package com.youtube.youtubeapp;

import java.util.Scanner;

import com.youtube.youtubeapp.dao.YoutubeDAO;
import com.youtube.youtubeapp.dao.YoutubeDAOImpl;
import com.youtube.youtubeapp.dto.AccountDTO;

public class YoutubeTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		YoutubeDAO youtubeDAO = new YoutubeDAOImpl(size);

		for (int i = 0; i < size; i++) {

			AccountDTO dto = new AccountDTO();
			dto.setAccountId(sc.nextInt());
			dto.setName(sc.next());
			dto.setSubscribers(sc.nextInt());
			dto.setNoOfViews(sc.nextInt());

			youtubeDAO.createAccount(dto);

		}

		AccountDTO[] accountDTO = youtubeDAO.getAccount();
		for (AccountDTO accountDTO2 : accountDTO) {
			System.out.println(accountDTO2);
		}
		
		System.out.println("Enter the no of views to update from account id ");
		youtubeDAO.updateNoOfViewsByAccountId(sc.nextInt(), sc.nextInt());
		
		AccountDTO[] accountDTO1 = youtubeDAO.getAccount();
		for (AccountDTO accountDTO2 : accountDTO1) {
			System.out.println(accountDTO2);
		}
		
		System.out.println("Enter the account name to delete the account");
		youtubeDAO.deleteAccountByAccountName(sc.next());
		
		AccountDTO[] accountDTO3 = youtubeDAO.getAccount();
		for (AccountDTO accountDTO2 : accountDTO3) {
			System.out.println(accountDTO2);
		}

	}

}
