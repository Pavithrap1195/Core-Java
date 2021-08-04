package com.xworkz.example.Social;

public class YouTube extends SocialMedia {
	
	@Override
	public String gainKnowledge(String vast) {
		System.out.println(super.getSocialMediaId());
		System.out.println(super.getFoundedOn());
		System.out.println(super.getHeadQuarter());
		System.out.println(super.getIndustry());
		System.out.println("Invoked gain knowledge method in youtube class");
		return vast;
	}
	
	public int noOfAccounts(int num) {
		System.out.println("Youtube is very vast media to explore");
		return num;
	}

}
