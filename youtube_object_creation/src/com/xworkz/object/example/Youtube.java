package com.xworkz.object.example;

public class Youtube implements Cloneable {
	
	private int noOfAccounts;
	private int noOfLikedVideos;
	
	public int getNoOfAccounts() {
		return noOfAccounts;
	}
	public void setNoOfAccounts(int noOfAccounts) {
		this.noOfAccounts = noOfAccounts;
	}
	public int getNoOfLikedVideos() {
		return noOfLikedVideos;
	}
	public void setNoOfLikedVideos(int noOfLikedVideos) {
		this.noOfLikedVideos = noOfLikedVideos;
	}
	
	public void gainKnowledge() {
		System.out.println("Youtube is one of the social media widely used nowadays");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
