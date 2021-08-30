package com.xworkz.pharmacyapp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.xworkz.pharmacyapp.comparator.SortMedicineByName;
import com.xworkz.pharmacyapp.comparator.SortMedicineByPrice;
import com.xworkz.pharmacyapp.dao.PharmacyDAO;
import com.xworkz.pharmacyapp.dao.PharmacyDAOImpl;
import com.xworkz.pharmacyapp.dto.MedicinesDTO;

public class PharmacyTester {
	
	public static void main(String[] args) {
		
		
		List<MedicinesDTO> list = new LinkedList<MedicinesDTO>();
		list.add(new MedicinesDTO(12, "Dolo 650", 10.00));
		list.add(new MedicinesDTO(1, "Rantac", 25.00));
		list.add(new MedicinesDTO(78, "Saridon", 5.00));
		
		System.out.println("Fetching list by method reference");
		list.forEach(System.out::println);
		
		System.out.println("Fetching list by Lambda Expression");
		Consumer<List<MedicinesDTO>> consumer = (m)-> System.out.println(list);
		consumer.accept(list);
		
		System.out.println("Using method refernce");
		PharmacyDAO dao = PharmacyDAOImpl :: precautionaryMeasure;
		dao.precautionaryMeasure();
		
		System.out.println("Using Lambda Expression");
		PharmacyDAO dao1 = () -> System.out.println("Taking medicine helps us to recover fast from any illness");
		dao1.precautionaryMeasure();
		
		System.out.println("Default sorting technique");
		Collections.sort(list);
		Consumer<List<MedicinesDTO>> consumer2 =(l) ->System.out.println(list);
		consumer2.accept(list);
		
		System.out.println("Customized Sorting Technique");
		System.out.println("Sort By Name");
		Collections.sort(list, new SortMedicineByName());
		list.forEach(System.out::println);
		
		System.out.println("Sort by Price");
		Collections.sort(list, new SortMedicineByPrice());
		list.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
