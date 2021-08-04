package com.xworkz.inheritance;

import java.util.Scanner;

import com.xworkz.inheritance.brand.Brand;
import com.xworkz.inheritance.brand.Puma;

public class BrandUtil {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand Id");
		int brandId=sc.nextInt();
		System.out.println("Enter where the headquarter located");
		String headQuarter=sc.next();
		System.out.println("Enter when brand was founded");
		int foundedOn=sc.nextInt();
		System.out.println("Enter the type of brand");
		String type=sc.next();
		sc.close();
		
		Brand bran=new Brand();
		bran.brandId=brandId;
		bran.headQuarter=headQuarter;
		bran.foundedOn=foundedOn;
		bran.type=type;
		bran.printDetails();
		bran.popularity();
		
		Puma pu =new Puma();
		pu.manufactures();
		
	}

}
