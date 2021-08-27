package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collections.comparator.SortFreedomFightersByBornOn;
import com.xworkz.collections.comparator.SortFreedomFightersByName;
import com.xworkz.collections.dto.FreedomFightersDTO;

public class FreedomFightersTester {
	
	public static void main(String[] args) {
		
		List<FreedomFightersDTO> list = new ArrayList<FreedomFightersDTO>();
		list.add(new FreedomFightersDTO(154,"Bhagat Singh","12 September 1907"));
		list.add(new FreedomFightersDTO(128, "Subhash Chandra Bose", "23 January 1897"));
		list.add(new FreedomFightersDTO(189, "Bal Ghangadhar Tilak", "23 July 1856"));
		
		System.out.println("Default Sorting Technique");
		System.out.println("Before Sorting");
		Iterator<FreedomFightersDTO> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("After Sorting");
		Collections.sort(list);
		Iterator<FreedomFightersDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**************************************************************");
		System.out.println("Customized Sorting Technique");
		
		System.out.println("Sorting FreedomFightersDTO By Name");
		System.out.println("Pre Sorting");
		Iterator<FreedomFightersDTO> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("Post Sorting");
		Collections.sort(list, new SortFreedomFightersByName());
		Iterator<FreedomFightersDTO> itera = list.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		
		System.out.println("Sorting FreedomFightersDTO By born on");
		System.out.println("Pre Soorting");
		Iterator<FreedomFightersDTO> iter1 = list.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println("Post Sorting");
		Collections.sort(list, new SortFreedomFightersByBornOn());
		Iterator<FreedomFightersDTO> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
	}

}
