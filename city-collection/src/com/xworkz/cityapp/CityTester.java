package com.xworkz.cityapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cityapp.dto.CityDTO;

public class CityTester {

	public static void main(String[] args) {

		CityDTO city = new CityDTO();
		city.setCityId(143);
		city.setCityName("Bengaluru");
		city.setEstablishedOn(1537);

		CityDTO city1 = new CityDTO();
		city1.setCityId(144);
		city1.setCityName("Mumbai");
		city1.setEstablishedOn(1950);

		CityDTO city2 = new CityDTO();
		city2.setCityId(145);
		city2.setCityName("Mysore");
		city2.setEstablishedOn(1399);

		List<CityDTO> cityDTO = new ArrayList<CityDTO>();
		cityDTO.add(city);
		cityDTO.add(city1);
		cityDTO.add(city2);
		
		

		Collection<CityDTO> collection = new ArrayList<CityDTO>();
		collection.add(city);
		collection.add(city1);
		collection.add(city2);
		collection.addAll(collection);
		System.out.println(collection.contains(city2));
		System.out.println(collection.containsAll(collection));
		System.out.println(collection.equals(city2));
		System.out.println(collection.hashCode());
		System.out.println(collection.isEmpty());
		//System.out.println(collection.remove(city1));
		//System.out.println(collection.removeAll(collection));
		System.out.println(collection.retainAll(collection));
		System.out.println(collection.size());
		//collection.clear();
		
		
		System.out.println("Collection methods started");
		
		Iterator<CityDTO> iter = collection.iterator();
		while (iter.hasNext()) {
			CityDTO dto = iter.next();
			System.out.println(dto);
		}
		System.out.println("Collection methods ended");
		
		Iterator<CityDTO> itera = cityDTO.iterator();
		while (itera.hasNext()) {
			CityDTO dto1 = itera.next();
			System.out.println(dto1);
		}

	}

}
