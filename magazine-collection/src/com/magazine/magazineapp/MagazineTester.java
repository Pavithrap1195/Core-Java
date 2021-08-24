package com.magazine.magazineapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.magazine.magazineapp.dto.MagazineDTO;

public class MagazineTester {
	
	public static void main(String[] args) {
		
		MagazineDTO magazine = new MagazineDTO();
		magazine.setMagazineId(141);
		magazine.setMagazineName("Spardha Vijetha");
		magazine.setPrice(80);
		magazine.setNoOfPages(60);
		magazine.setType("Competative");
		
		MagazineDTO dto = new MagazineDTO();
		dto.setMagazineId(142);
		dto.setMagazineName("Cini Loka");
		dto.setPrice(50);
		dto.setNoOfPages(20);
		dto.setType("Entertainment");
		
		MagazineDTO dto1 = new MagazineDTO();
		dto1.setMagazineId(146);
		dto1.setMagazineName("Enterpreneur");
		dto1.setPrice(130);
		dto1.setNoOfPages(100);
		dto1.setType("Business");
		
		
		List<MagazineDTO> list = new ArrayList<MagazineDTO>();
		list.add(dto);
		list.add(magazine);
		list.add(1, dto1);
		
		ListIterator iterator = list.listIterator();
		System.out.println("Forward moving");
		while(iterator.hasNext()) {
			MagazineDTO magazine1 = (MagazineDTO) iterator.next();
			System.out.println(magazine1);
		}
		System.out.println("Backward moving");
		while(iterator.hasPrevious()) {
			MagazineDTO magazine1 = (MagazineDTO) iterator.previous();
			System.out.println(magazine1);
		}
		

		
		//Collections class Sort method
		
		List list1 = new ArrayList();
		list1.add(11);
		list1.add(05);
		list1.add(22);
		list1.add(10);
		list1.add(20);
		list1.add(02);
		System.out.println("Before sorting");
		System.out.println(list1);
		
		System.out.println("After sorting");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("Descending order");
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		
		
	}

}
