package com.xworkz.example;

import java.util.Scanner;

import com.xworkz.example.exception.ATMException;
import com.xworkz.example.machine.Machine;

public class ATMUtil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		Machine machine = new Machine();
		try {
			machine.withDraw(sc.nextInt());
		} catch (ATMException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}

}
