package com.xworkz.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.example.dto.LaptopDTO;

//Example for fail-fast iterator
public class LaptopTester {
	
	public static void main(String[] args) {
		
		ArrayList<LaptopDTO> arrayList = new ArrayList<LaptopDTO>();
		arrayList.add(new LaptopDTO(12,"Dell",45000.00));
		arrayList.add(new LaptopDTO(11,"HP",55000.00));
		arrayList.add(new LaptopDTO(14,"Asus",35000.00));
		
		
		/*List<String> list = new ArrayList<String>();
		list.add("Pavi");
		list.add("Akash");
		list.add("Rajini");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			if(name=="Rajini") {
				list.remove(name);
			}
		}
		
		System.out.println(list);*/
		
		
		Iterator<LaptopDTO> itr = arrayList.iterator();
		while(itr.hasNext()) {
			LaptopDTO lap = itr.next();
			System.out.println(lap);
			if(lap.getLaptopId()==14) {
				arrayList.remove(lap);
			}
		}
		
		System.out.println(arrayList);
	
	}

}
