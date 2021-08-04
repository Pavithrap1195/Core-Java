package com.xworkz.inherit;

import java.util.Scanner;

import com.xworkz.inherit.example.CoviSheild;
import com.xworkz.inherit.example.Vaccine;

public class VaccineTester {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vaccine Id");
		int vaccineId=sc.nextInt();
		System.out.println("Enter that who founded vaccine");
		String foundBy=sc.next();
		System.out.println("Enter the no of doses required");
		int noOfDoses=sc.nextInt();
		sc.close();
		
		Vaccine vaccine=new Vaccine();
		vaccine.vaccineId=vaccineId;
		vaccine.foundBy=foundBy;
		vaccine.noOfDoses=noOfDoses;
		vaccine.printDetails();
		vaccine.immunity();
		
		CoviSheild covi=new CoviSheild();
		covi.activeImmunityPower();
	}

}
