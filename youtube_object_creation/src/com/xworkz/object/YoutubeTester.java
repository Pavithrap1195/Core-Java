package com.xworkz.object;

import com.xworkz.object.example.Youtube;

public class YoutubeTester {
	
	public static void main(String[] args){
		
		
		Youtube youtube=new Youtube();
		
		youtube.setNoOfAccounts(200);
		youtube.setNoOfLikedVideos(15);
		
		System.out.println(youtube.getNoOfAccounts()+" "+youtube.getNoOfLikedVideos());
		try {
		Youtube you=(Youtube)youtube.clone();
		you.setNoOfLikedVideos(20);
		
		System.out.println(you.getNoOfAccounts()+" "+you.getNoOfLikedVideos());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
