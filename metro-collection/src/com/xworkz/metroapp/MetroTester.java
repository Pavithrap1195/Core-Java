package com.xworkz.metroapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.metroapp.dto.MetroDTO;

public class MetroTester {
	
	public static void main(String[] args) {
		
		MetroDTO metro = new MetroDTO();
		metro.setMetroId(178);
		metro.setMetroName("GreenLine");
		metro.setStartingPoint("Yelachenahalli");
		metro.setEndingPoint("Nagasandra");
		
		MetroDTO metro1 = new MetroDTO();
		metro1.setMetroId(179);
		metro1.setMetroName("PurpleLine");
		metro1.setStartingPoint("Mysuru road");
		metro1.setEndingPoint("Baiyyappanahalli");
		
		List<MetroDTO> list = new ArrayList<MetroDTO>();
		list.add(metro);
		list.add(metro1);
		
		Collection<MetroDTO> collection = new ArrayList<MetroDTO>();
		collection.add(metro);
		collection.add(metro1);
		collection.addAll(collection);
		//collection.clear();
		System.out.println(collection.contains(metro1));
		System.out.println(collection.containsAll(list));
		System.out.println(collection.equals(metro1));
		System.out.println(collection.hashCode());
		System.out.println(collection.isEmpty());
		//System.out.println(collection.remove(metro1));
		//System.out.println(collection.removeAll(list));
		System.out.println(collection.retainAll(collection));
		System.out.println(collection.size());
		
		
		Iterator<MetroDTO> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Collection methods started");
		Iterator<MetroDTO> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Collection methods ended");
		
		
		
	}

}
