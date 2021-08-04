package com.xworkz.examples.movies;

public class Movies {
	
	int moviesId;
	String actorName;
	String actressName;
	String releasedOn;
	String director;
	String industry;
	
	public Movies() {
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}
	
	public double costlier(double num) {
		System.out.println("Nowadays watching movies are bit costlier");
		return num;
	}
	
	public void setMoviesId(int moviesId) {
		this.moviesId=moviesId;
	}
	
	public int getMoviesId() {
		return moviesId;
	}
	
	public void setActorName(String actorName) {
		this.actorName=actorName;
	}
	
	public String getActorName() {
		return actorName;
	}
	
	public void setActressName(String actressName) {
		this.actressName=actressName;
	}
	
	public String getActressName() {
		return actressName;
	}
	
	public void setReleasedOn(String releasedOn) {
		this.releasedOn=releasedOn;
	}
	
	public String getReleasedOn() {
		return releasedOn;
	}
	
	public void setDirector(String director) {
		this.director=director;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setIndustry(String industry) {
		this.industry=industry;
	}
	
	public String getIndustry() {
		return industry;
	}

}
