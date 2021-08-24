package com.xworkz.brandsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.brandsapp.dto.BrandsDTO;

public class BrandsTester {
	
	public static void main(String[] args) {
		
		BrandsDTO brands = new BrandsDTO();
		brands.setBrandId(175);
		brands.setBrandName("Raymond");
		brands.setEstablished(1925);
		brands.setIndustryType("Textile");
		brands.setHeadQuarter("Mumbai");
		
		BrandsDTO bran = new BrandsDTO();
		bran.setBrandId(189);
		bran.setBrandName("Maruthi");
		bran.setEstablished(1981);
		bran.setIndustryType("Automotive");
		bran.setHeadQuarter("New delhi");
		
		List<BrandsDTO> list = new ArrayList<BrandsDTO>();
		list.add(brands);
		list.add(bran);
		
		ListIterator<BrandsDTO> iter = list.listIterator();
		System.out.println("Forward direction");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Backward direction");
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		
		List list1 = new ArrayList();
		list1.add("life");
		list1.add("is");
		list1.add("all");
		list1.add("about");
		list1.add("our");
		list1.add("perspective");
		
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
