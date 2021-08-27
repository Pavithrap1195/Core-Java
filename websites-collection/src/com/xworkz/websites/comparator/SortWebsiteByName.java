package com.xworkz.websites.comparator;

import java.util.Comparator;

import com.xworkz.websites.dto.WebsitesDTO;

public class SortWebsiteByName implements Comparator<WebsitesDTO> {

	@Override
	public int compare(WebsitesDTO o1, WebsitesDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());    //compareTo method is coming from String
	}
	
	

}
