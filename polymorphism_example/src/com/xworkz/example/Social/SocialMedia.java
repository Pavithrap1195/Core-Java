package com.xworkz.example.Social;

public class SocialMedia {
	
	int socialMediaId;
	String foundedOn;
	String headQuarter;
	String industry;
	
	public SocialMedia() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}
	
	public String gainKnowledge(String vast) {
		System.out.println("We can gain knowledge by using social media");
		return vast;
	}
	
	public void setSocialMediaId(int socialMediaId) {
		this.socialMediaId=socialMediaId;
		}
	
	public int getSocialMediaId() {
		return socialMediaId;
	}
	
	public void setFoundedOn(String foundedOn ) {
		this.foundedOn=foundedOn;
	}
	
	public String getFoundedOn() {
		return foundedOn;
	}
	
	public void setHeadQuarter(String headQuarter) {
		this.headQuarter=headQuarter;
	}
	
	public String getHeadQuarter() {
		return headQuarter;
	}
	
	public void setIndustry(String industry) {
		this.industry=industry;
	}
	
	public String getIndustry() {
		return industry;
	}
	

}
