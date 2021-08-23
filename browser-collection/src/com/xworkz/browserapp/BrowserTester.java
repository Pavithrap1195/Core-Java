package com.xworkz.browserapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.browserapp.dto.BrowserDTO;

public class BrowserTester {
	
	public static void main(String[] args) {
		
		BrowserDTO browse = new BrowserDTO();
		browse.setBrowserId(12);
		browse.setBrowserName("Google chrome");
		browse.setDeveloper("Google");
		
		BrowserDTO dto = new BrowserDTO();
		dto.setBrowserId(13);
		dto.setBrowserName("Mozilla");
		dto.setDeveloper("Mozilla corporation");
		
		
		List<BrowserDTO> browserDTO = new ArrayList<BrowserDTO>();
		browserDTO.add(dto);
		browserDTO.add(browse);
		
		Collection<BrowserDTO> collection = new ArrayList<BrowserDTO>();
		collection.add(browse);
		collection.add(dto);
		collection.addAll(collection);
		//collection.clear();
		System.out.println(collection.contains(dto));
		System.out.println(collection.containsAll(collection));
		System.out.println(collection.equals(dto));
		System.out.println(collection.hashCode());
		System.out.println(collection.isEmpty());
		//System.out.println(collection.remove(dto));
		//System.out.println(collection.removeAll(collection));
		System.out.println(collection.retainAll(collection));
		System.out.println(collection.size());
		
		
		Iterator<BrowserDTO> iterator = browserDTO.iterator();
		while(iterator.hasNext()) {
			BrowserDTO br = iterator.next();
			System.out.println(br);
		}
		
		System.out.println("Collection methods started");
		Iterator<BrowserDTO> iter = collection.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Collection methods ended");
		
		
		
		
		
	}

}
