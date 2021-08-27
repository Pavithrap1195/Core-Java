package com.xworkz.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.xworkz.example.comparator.SortBeachByLocation;
import com.xworkz.example.comparator.SortBeachByName;
import com.xworkz.example.dto.BeachDTO;

public class BeachTester {
	
	public static void main(String[] args) {
		
		ArrayList<BeachDTO> array = new ArrayList<BeachDTO>();
		array.add(new BeachDTO(78, "Kaup beach", "Udupi"));
		array.add(new BeachDTO(23, "Murudeshwara beach", "Murudeshwara"));
		array.add(new BeachDTO(55, "Maravante Beach", "Udupi"));
		
		System.out.println("Default Sorting Technique");
		System.out.println("Before Sorting");
		Iterator<BeachDTO> iter = array.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("After Sorting");
		Collections.sort(array);
		Iterator<BeachDTO> beach = array.iterator();
		while(beach.hasNext()) {
			System.out.println(beach.next());
		}
		
		System.out.println("*************************************************************************");
		System.out.println("Customized Sorting Technique");
		System.out.println("Sorting BeachDTO by Name");
		System.out.println("Before Sorting");
		Iterator<BeachDTO> it = array.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("After Sorting");
		Collections.sort(array, new SortBeachByName());
		Iterator<BeachDTO> dto = array.iterator();
		while(dto.hasNext()) {
			System.out.println(dto.next());
		}
		System.out.println("Sorting BeachDTO By Location");
		System.out.println("Before Sorting");
		Iterator<BeachDTO> ite = array.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("After Sorting");
		Collections.sort(array, new SortBeachByLocation());
		Iterator<BeachDTO> dtos = array.iterator();
		while(dtos.hasNext()) {
			System.out.println(dtos.next());
		}
		
		
		
		
		
		
		
	}

}
