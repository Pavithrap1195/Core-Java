package com.films.filmsapp;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import com.films.filmsapp.dao.FilmsDAO;
import com.films.filmsapp.dao.FilmsDAOImpl;
import com.films.filmsapp.dto.FilmsDTO;

public class FilmsTester {
	
	public static void main(String[] args) {
		
		Set<FilmsDTO> set = new TreeSet<FilmsDTO>();
		set.add(new FilmsDTO(15, "Love Mocktail"));
		set.add(new FilmsDTO(85, "Evaru"));
		set.add(new FilmsDTO(78, "Rajakumara"));
		
		System.out.println("Fetching set through method reference");
		set.forEach(System.out::println);
		
		System.out.println("Fetching set through lambda expression ");
		Consumer<Set<FilmsDTO>> consumer =(f) -> System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using method reference");
		FilmsDAO dao = FilmsDAOImpl :: entertainment;
		dao.entertainment();
		
		System.out.println("Using Lalbda Expression");
		FilmsDAO film = () -> System.out.println("Watching films gives us entertainment");
		film.entertainment();
		
	}

}
