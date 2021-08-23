package com.xworkz.libraryapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xworkz.libraryapp.dto.LibraryDTO;

public class LibraryTester {

	public static void main(String[] args) {

		LibraryDTO libraryDTO = new LibraryDTO();
		libraryDTO.setLibraryId(1);
		libraryDTO.setLibraryName("Central library");
		libraryDTO.setType("Government");
		libraryDTO.setLocation("MG road");

		LibraryDTO dto = new LibraryDTO();
		dto.setLibraryId(2);
		dto.setLibraryName("State library");
		dto.setType("Private");
		dto.setLocation("Rajajinagar");

		LibraryDTO dto1 = new LibraryDTO();
		dto1.setLibraryId(2);
		dto1.setLibraryName("State library");
		dto1.setType("Private");
		dto1.setLocation("Rajajinagar");

		List<LibraryDTO> list = new ArrayList<LibraryDTO>();
		list.add(dto);
		list.add(libraryDTO);
		list.add(dto1);

		Collection<LibraryDTO> collection = new ArrayList<LibraryDTO>();
		collection.add(dto);
		collection.add(libraryDTO);
		collection.addAll(collection);
		// collection.clear();
		System.out.println(collection.contains(dto));
		System.out.println(collection.containsAll(collection));
		System.out.println(collection.equals(dto1));
		System.out.println(collection.hashCode());
		System.out.println(collection.isEmpty());
		// collection.remove(dto);
		// collection.removeAll(collection);
		// collection.retainAll(collection);
		System.out.println(collection.size());

		Set<LibraryDTO> set = new HashSet<LibraryDTO>();
		set.add(dto);
		set.add(libraryDTO);
		set.add(dto1);

		/*
		 * Set<String> set1 = new HashSet<String>(); set1.add("1"); set1.add("Pavi");
		 * set1.add("Pavi");
		 */

		Iterator<LibraryDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			LibraryDTO library = iterator.next();
			System.out.println(library);
		}

		/*
		 * Iterator<String> iter = set1.iterator(); while(iter.hasNext()) { String
		 * strin=iter.next(); System.out.println(strin); }
		 */

	}

}
