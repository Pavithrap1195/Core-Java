package com.xworkz.electronics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.electronics.dto.ElectronicShopDTO;

public class ElectronicShopTester {
	
	public static void main(String[] args) {
		
		ElectronicShopDTO elec = new ElectronicShopDTO();
		elec.setElectronicShopId(14);
		elec.setShopName("SLV");
		elec.setLocation("Rajajinagar");
		
		ElectronicShopDTO electronic = new ElectronicShopDTO();
		electronic.setElectronicShopId(15);
		electronic.setShopName("BGD");
		electronic.setLocation("Magadi road");
		
		List<ElectronicShopDTO> list = new ArrayList<ElectronicShopDTO>();
		list.add(elec);
		list.add(electronic);
		
		Collection<ElectronicShopDTO> collection = new ArrayList<ElectronicShopDTO>();
		collection.add(elec);
		collection.add(electronic);
		collection.addAll(list);
		System.out.println(collection.contains(list));
		System.out.println(collection.containsAll(collection));
		System.out.println(collection.equals(elec));
		System.out.println(collection.hashCode());
		System.out.println(collection.isEmpty());
		//System.out.println(collection.remove(elec));
		//System.out.println(collection.removeAll(collection));
		System.out.println(collection.retainAll(collection));
		System.out.println(collection.size());
		//collection.clear();
		
		Iterator<ElectronicShopDTO> iter = list.iterator();
		while(iter.hasNext()) {
			ElectronicShopDTO dto = iter.next();
			System.out.println(dto);
		}
		
		System.out.println("Collection methods started");
		Iterator<ElectronicShopDTO> itera = collection.iterator();
		while(itera.hasNext()) {
			ElectronicShopDTO dto1 = itera.next();
			System.out.println(dto1);
		}
		System.out.println("Collection methods ended");
		
		
		
		
		
		
		
	}

}
