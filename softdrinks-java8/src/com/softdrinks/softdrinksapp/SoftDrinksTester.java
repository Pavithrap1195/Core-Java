package com.softdrinks.softdrinksapp;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.softdrinks.softdrinksapp.dao.SoftDrinksDAO;
import com.softdrinks.softdrinksapp.dao.SoftDrinksDAOImpl;
import com.softdrinks.softdrinksapp.dto.SoftDrinksDTO;

public class SoftDrinksTester {
	
	public static void main(String[] args) {
		
		Set<SoftDrinksDTO> set = new LinkedHashSet<SoftDrinksDTO>();
		set.add(new SoftDrinksDTO(78, "Coco Cola", 25.00));
		set.add(new SoftDrinksDTO(45, "Fanta", 50.00));
		set.add(new SoftDrinksDTO(12, "Mazza", 55.00));
		
		System.out.println("Fetching set through method reference");
		set.forEach(System.out::println);
		
		System.out.println("Fetching set through Lambda Expression");
		Consumer<Set<SoftDrinksDTO>> consumer = (s)->System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using method reference");
		SoftDrinksDAO dao = SoftDrinksDAOImpl :: relaxation;
		dao.relaxation();
		
		System.out.println("Using lambda expression");
		SoftDrinksDAO dao1 = ()->System.out.println("Gives Relaxation");
		dao1.relaxation();
		
		//Comparator<String> comparator = (o1,o2) -> o1.compareTo(o2);
		
		
		
		
	}

}
