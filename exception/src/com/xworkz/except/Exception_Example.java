package com.xworkz.except;

import java.util.Scanner;

public class Exception_Example {
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		String apps[]=new String[4];
		try {
			System.out.println("Initialized array elements");
		apps[0]="Whattsapp";
		apps[1]="Youtube";
		apps[2]="Zoom";
		apps[3]="7 minutes";
		apps[4]="zomato";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot add ");
			e.printStackTrace();
		}
		for (String string : apps) {
			System.out.println(string);
			
		}
		
		try {
		int a=59;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide");
			e.printStackTrace();
		}
		try {
		Object str=Integer.valueOf(12);
		Exception_Example ex=(Exception_Example)str;
		}catch(Exception e) {
			System.out.println("Cannot find");
			e.printStackTrace();
		}
		try {
		String st=null;
		Object pre =new String(st);
		System.out.println(pre);
		}catch(Exception e) {
			System.out.println("Cannot find");
			e.printStackTrace();
		}
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of type of exception we have in java");
		int noOfException=Integer.parseInt(sc.next()); 
		
		}catch(Exception e) {
			System.out.println("Cannot find");
			e.printStackTrace();
		}
	
	

}
}
