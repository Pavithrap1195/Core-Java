package com.xworkz.methods;

import com.xworkz.methods.example.Monument;
import com.xworkz.methods.example.TajMahal;

public class MonumentUtil {
	
	public static void main(String[] args) {
		
		Monument monu=new TajMahal();
		TajMahal taj=(TajMahal)monu;
		taj.printDetails();
		System.out.println(taj.commemorate());
		
		Monument monum=new Monument();
		boolean ty=monum.equals(monu);
		System.out.println(ty);
		
		TajMahal tajm=new TajMahal();
		boolean typ=tajm.equals(monum);
		System.out.println(typ);
	}

}
