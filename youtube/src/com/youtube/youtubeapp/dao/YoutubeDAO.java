package com.youtube.youtubeapp.dao;

import com.youtube.youtubeapp.dto.AccountDTO;

public interface YoutubeDAO {
	
	public boolean createAccount(AccountDTO account);
	
	public AccountDTO[] getAccount();
	
	public boolean updateNoOfViewsByAccountId(int noOfViews,int accountId);
	
	public boolean deleteAccountByAccountName(String name);

}
