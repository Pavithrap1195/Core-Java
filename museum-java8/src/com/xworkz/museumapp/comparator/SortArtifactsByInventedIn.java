package com.xworkz.museumapp.comparator;

import java.util.Comparator;

import com.xworkz.museumapp.dto.ArtifactsDTO;

public class SortArtifactsByInventedIn implements Comparator<ArtifactsDTO> {
	
	@Override
	public int compare(ArtifactsDTO o1, ArtifactsDTO o2) {
		// TODO Auto-generated method stub
		return o1.getInventedIn().compareTo(o2.getInventedIn());
	}

}
