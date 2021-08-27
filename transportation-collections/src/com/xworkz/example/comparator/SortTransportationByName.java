package com.xworkz.example.comparator;

import java.util.Comparator;

import com.xworkz.example.dto.TransportationDTO;

public class SortTransportationByName implements Comparator<TransportationDTO> {
	
	@Override
	public int compare(TransportationDTO o1, TransportationDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
