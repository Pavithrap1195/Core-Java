package com.youtube.youtubeapp.dto;

import java.io.Serializable;

public class AccountDTO implements Serializable {
	
	private int accountId;
	private String name;
	private int subscribers;
	private int noOfViews;
	
	public AccountDTO() {
		System.out.println(this.getClass().getSimpleName()+" Objects are created");
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	public int getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(int noOfViews) {
		this.noOfViews = noOfViews;
	}
	
	@Override
	public String toString() {
		return "AccountDTO [accountId="+accountId+",name="+name+",subscribers="+subscribers+",noOfViews="+noOfViews+"]";
	}
	


}
