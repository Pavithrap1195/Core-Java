package com.harddisk.harddiskapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.harddisk.harddiskapp.dto.HardDiskDTO;

public class HardDiskTester {
	
	public static void main(String[] args) {
		
		HardDiskDTO hardDisk = new HardDiskDTO();
		hardDisk.setHardDiskId("HI145");
		hardDisk.setHardDiskName("Toshibha");
		hardDisk.setPrice("5000Rs");
		hardDisk.setStorage("2TB");
		
		HardDiskDTO hard = new HardDiskDTO();
		hard.setHardDiskId("SE185");
		hard.setHardDiskName("Seagate");
		hard.setPrice("3000Rs");
		hard.setStorage("1.5TB");
		
		HardDiskDTO disk = new HardDiskDTO();
		disk.setHardDiskId("WD178");
		disk.setHardDiskName("WD Elements");
		disk.setPrice("3869Rs");
		disk.setStorage("1TB");
		
		List<HardDiskDTO> list = new ArrayList<HardDiskDTO>();
		list.add(hardDisk);
		list.add(hard);
		list.add(1, disk);
		
		ListIterator<HardDiskDTO> iterator = list.listIterator();
		System.out.println("Forwarding direction");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Backward direction");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		List list1 = new ArrayList();
		list1.add("Pavi");
		list1.add("Akash");
		list1.add("Zombie");
		list1.add("Rajini");
		list1.add("Life");
		list1.add("Death");
		list1.add(5, "and");
		
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
