package com.xworkz.examples;

import com.xworkz.examples.movies.LoveMocktail;
import com.xworkz.examples.movies.Movies;

public class MoviesUtil {
	
	public static void main(String[] args) {
		
		Movies movie=new Movies();
		movie.costlier(500);
		
		LoveMocktail love=new LoveMocktail();
		love.content(true);
		love.setMoviesId(145);
		love.setActorName("Krishna");
		love.setActressName("Milana Nagraj");
		love.setDirector("Krishna");
		love.setReleasedOn("2020");
		love.setIndustry("Sandalwood");
		love.costlier(620);
		
		Movies mov=new LoveMocktail();
		LoveMocktail lo=(LoveMocktail)mov;
		lo.content(true);
	
	}

}
