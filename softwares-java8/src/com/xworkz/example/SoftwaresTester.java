package com.xworkz.example;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import com.xworkz.example.dao.SoftwaresDAO;
import com.xworkz.example.dao.SoftwaresDAOImpl;
import com.xworkz.example.dto.SoftwaresDTO;

public class SoftwaresTester {
	
	public static void main(String[] args) {
		
		Set<SoftwaresDTO> set = new TreeSet<SoftwaresDTO>();
		set.add(new SoftwaresDTO(45, "Auto cadd"));
		set.add(new SoftwaresDTO(12, "Adobe Reader"));
		set.add(new SoftwaresDTO(89, "VLC Media Player"));
		
		System.out.println("Fetching set by method reference");
		set.forEach(System.out::println);
		
		
		System.out.println("Fetching set by Lambda Expression");
		Consumer<Set<SoftwaresDTO>> consumer = (s)->System.out.println(set);
		consumer.accept(set);
		
		System.out.println("Using Method reference");
		SoftwaresDAO dao = SoftwaresDAOImpl :: easeOfWork;
		dao.easeOfWork();
		
		System.out.println("Using Lambda Expression");
		SoftwaresDAO dao1 = ()-> System.out.println("It makes us ease of work");
		dao1.easeOfWork();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
