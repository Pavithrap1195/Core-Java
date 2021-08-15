package com.youtube.youtubeapp.dao;

import com.youtube.youtubeapp.dto.AccountDTO;

public class YoutubeDAOImpl implements YoutubeDAO {
	
	private AccountDTO[] account;
	private int index;
	
	public YoutubeDAOImpl(int size) {
		account = new AccountDTO[size];
	}
	
	@Override
	public boolean createAccount(AccountDTO account) {
		boolean createdAccount=false;
		try {
		if(account!=null && !account.getName().isEmpty()) {
			this.account[index++]=account;
			createdAccount=true;
		}else if(account.getName().isEmpty()) {
			System.out.println("Cannot add account as account is empty");
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return createdAccount;
	}
	
	@Override
	public AccountDTO[] getAccount() {
		
		return account;
	}
	
	@Override
	public boolean updateNoOfViewsByAccountId(int noOfViews, int accountId) {
		boolean updated=false;
		if(noOfViews > 0 && accountId != 0) {
			for (AccountDTO accountDTO2 : account) {
				if(accountDTO2.getAccountId()==accountId) {
					accountDTO2.setNoOfViews(noOfViews);
					updated=true;
				}else {
					System.out.println("No account found");
				}
			}
		}
		return updated;
	}
	
	@Override
	public boolean deleteAccountByAccountName(String name) {
		boolean deleted = false;
		for (int i = 0; i < account.length; i++) {
			if(account[i] != null) {
				if(account[i].getName().equals(name)) {
					account[i]=null;
					deleted = true;
				}else {
					System.out.println("Account is not found");
				}
			}
		}
		return deleted;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
