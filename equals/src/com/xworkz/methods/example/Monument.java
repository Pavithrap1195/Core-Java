package com.xworkz.methods.example;

public class Monument {
	
	public String located="Location";
	public int heightInMeters=00;
	public int areaInHectares=00;
	
	public Monument() {
		try {
			System.out.println(Class.forName("com.xworkz.methods.example.Monument"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String commemorate(){
		System.out.println("A monument is a type of structure that was explicitly created to commemorate a person or event");
		return "fantastic";
	}
	
	@Override
	public boolean equals(Object monu) {
		if(monu instanceof Monument) {
			return true;
		}
		return false;
	
	}
	
	
	

}
