package com.xworkz.examples.movies;

public class LoveMocktail extends Movies {
	
	@Override
	public double costlier(double num) {
		System.out.println(super.getMoviesId());
		System.out.println(super.getActorName());
		System.out.println(super.getActressName());
		System.out.println(super.getDirector());
		System.out.println(super.getReleasedOn());
		System.out.println(super.getIndustry());
		System.out.println("Invoked costlier method in lovemocktail class");
		return super.costlier(num);
	}
	
	public boolean content(boolean enjoyed) {
		System.out.println("Lovemocktail has very good content");
		return true;
	}
	
	
	


}
