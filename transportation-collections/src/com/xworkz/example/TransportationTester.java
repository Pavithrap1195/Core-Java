package com.xworkz.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.xworkz.example.comparator.SortTransportationByName;
import com.xworkz.example.comparator.SortTransportationByTypeOfMode;
import com.xworkz.example.dto.TransportationDTO;

public class TransportationTester {

	public static void main(String[] args) {

		ArrayList<TransportationDTO> list = new ArrayList<TransportationDTO>();
		list.add(new TransportationDTO(47, "Railways", "Land"));
		list.add(new TransportationDTO(87, "Aeroplane", "Airways"));
		list.add(new TransportationDTO(89, "Cruise Ship", "Waterways"));

		System.out.println("Default Sorting Technique");
		System.out.println("Before Sorting");
		Iterator<TransportationDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("After Sorting");
		Collections.sort(list);
		Iterator<TransportationDTO> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*****************************************");
		System.out.println("Customized Sorting technique");
		System.out.println("Sorting TransportationDTO By Name");
		System.out.println("Pre Sorting");
		Iterator<TransportationDTO> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("Post Sorting Technique");
		Collections.sort(list, new SortTransportationByName());
		Iterator<TransportationDTO> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("Sorting TransportationDTO By type of mode");
		System.out.println("Before Sorting");
		Iterator<TransportationDTO> itera = list.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		System.out.println("After Sorting");
		Collections.sort(list, new SortTransportationByTypeOfMode());
		Iterator<TransportationDTO> iterate = list.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		
		
		
		
		
		
		

	}

}
