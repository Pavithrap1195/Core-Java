package com.xworkz.example.comparator;

import java.util.Comparator;

import com.xworkz.example.dto.BeachDTO;

public class SortBeachByLocation implements Comparator<BeachDTO> {
	
	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		// TODO Auto-generated method stub
		return o1.getLocation().compareTo(o2.getLocation());
	}

}
