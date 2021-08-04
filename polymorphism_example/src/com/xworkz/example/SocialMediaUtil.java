package com.xworkz.example;

import com.xworkz.example.Social.SocialMedia;
import com.xworkz.example.Social.YouTube;

public class SocialMediaUtil {
	
	public static void main(String[] args) {
		
		SocialMedia media=new SocialMedia();
		media.gainKnowledge("Vast");
		
		YouTube youtube = new YouTube();
		youtube.setSocialMediaId(124);
		youtube.setFoundedOn("2005 febrauary 14");
		youtube.setHeadQuarter("US");
		youtube.setIndustry("Internet-Video hosting service");
		youtube.gainKnowledge("Very vast");
		System.out.println(youtube.noOfAccounts(545)+" Accounts are there at present");
		
		SocialMedia socio=new YouTube();
		YouTube you=(YouTube)socio;
		System.out.println(you.noOfAccounts(489)+" Account was there in past");
		
		
	}

}
