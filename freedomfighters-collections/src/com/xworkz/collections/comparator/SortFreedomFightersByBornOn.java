package com.xworkz.collections.comparator;

import java.util.Comparator;

import com.xworkz.collections.dto.FreedomFightersDTO;

public class SortFreedomFightersByBornOn implements Comparator<FreedomFightersDTO> {
	
	@Override
	public int compare(FreedomFightersDTO o1, FreedomFightersDTO o2) {
		// TODO Auto-generated method stub
		return o1.getBornOn().compareTo(o2.getBornOn());
	}

}
