package com.xworkz.equals;

import com.xworkz.equals.example.Furniture;
import com.xworkz.equals.example.StudyTable;

public class FurnitureUtil {
	
	public static void main(String[] args) {
		try {
			System.out.println("Entered into furniture class");
		Furniture furni=new Furniture();
		furni.costlier();
		
		System.out.println("Entered into study table class");
		StudyTable table=new StudyTable();
		table.setType("Wooden");
		table.setPrice(27000);
		table.isPortable(true);
		System.out.println(table.getType());
		System.out.println(table.getPrice());
		System.out.println(table.getPortable());
		table.costlier();
		boolean type=table.equals(furni);
		System.out.println(type);
		
		System.out.println("Entering polymorphism");
		Furniture fur=new StudyTable();
		System.out.println("Executing downcasting");
		StudyTable tab=(StudyTable)fur;
		tab.costlier();
		boolean type1=fur.equals(table);
		System.out.println(type1);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
