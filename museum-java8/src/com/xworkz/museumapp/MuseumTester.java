package com.xworkz.museumapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.xworkz.museumapp.comparator.SortArtifactsByInventedIn;
import com.xworkz.museumapp.comparator.SortArtifactsByName;
import com.xworkz.museumapp.dao.MuseumDAO;
import com.xworkz.museumapp.dao.MuseumDAOImpl;
import com.xworkz.museumapp.dto.ArtifactsDTO;

public class MuseumTester {
	
	public static void main(String[] args) {
		
		List<ArtifactsDTO> list = new ArrayList<ArtifactsDTO>();
		list.add(new ArtifactsDTO(145,"Gramaphone",1877));
		list.add(new ArtifactsDTO(148, "Steam Wagon", 1906));
		list.add(new ArtifactsDTO(124, "Vintage Microphone", 1877));
		
		System.out.println("Fetching list through Method reference");
		list.forEach(System.out::println);
		
		
		System.out.println("Fetching list  through Lambda Expression");
		Consumer<List<ArtifactsDTO>> consumer = (a) ->System.out.println(list);
		consumer.accept(list);
		
		System.out.println("Default Sorting technique");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("Customized Sorting technique");
		System.out.println("Sort by Artifacts By Name");
		Collections.sort(list, new SortArtifactsByName());
		list.forEach(System.out::println);
		
		System.out.println("Sort by Artifacts Invented In");
		Collections.sort(list, new SortArtifactsByInventedIn());
		list.forEach(System.out::println);
		
		System.out.println("Using method reference");
		MuseumDAO dao = MuseumDAOImpl :: gainKnowledge;
		dao.gainKnowledge();
		
		System.out.println("Using Lambda Expression");
		MuseumDAO dao1 = ()->System.out.println("By visiting museum we will gain knowledge about the unique artifacts");
		dao1.gainKnowledge();
		
		
		BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a-b);
		biConsumer.accept(10, 5);
		
	}

}
