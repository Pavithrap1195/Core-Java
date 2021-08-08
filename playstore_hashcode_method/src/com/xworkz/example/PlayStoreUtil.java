package com.xworkz.example;

import com.xworkz.example.hashcode.PlayStore;

public class PlayStoreUtil {
	
	public static void main(String[] args) {
		
		PlayStore play = new PlayStore();
		play.playStoreId=147;
		play.applicationName="Voot";
		play.type="Apps";
		play.sizeInMb=25;
		play.ratedInStar=4;
		System.out.println(play.applicationName);
		System.out.println(play.hashCode());
		
		PlayStore store = new PlayStore();
		store.playStoreId=471;
		store.applicationName="Temple run";
		store.type="Apps";
		store.sizeInMb=45;
		store.ratedInStar=5;
		System.out.println(store.applicationName);
		System.out.println(store.hashCode());
		
		boolean type=store.equals(play);
		System.out.println(type);
	}

}
