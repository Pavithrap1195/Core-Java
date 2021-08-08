package com.xworkz.abstractclass;

import com.xworkz.abstractclass.example.Gmail;
import com.xworkz.abstractclass.example.GoogleDrive;
import com.xworkz.abstractclass.example.Laptop;

public class GoogleUtil {
	
	public static void main(String[] args) {
		
		Laptop lap=new Laptop();
		Gmail gmail=new Gmail();
		GoogleDrive drive=new GoogleDrive();
		lap.browse(drive);
		lap.browse(gmail);
	}

}
