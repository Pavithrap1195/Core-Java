package com.xworkz.pharmacyapp.comparator;

import java.util.Comparator;

import com.xworkz.pharmacyapp.dto.MedicinesDTO;

public class SortMedicineByPrice implements Comparator<MedicinesDTO> {
	
	@Override
	public int compare(MedicinesDTO o1, MedicinesDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
