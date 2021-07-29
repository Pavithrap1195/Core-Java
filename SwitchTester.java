import java.util.*;

class SwitchTester{
	
	public static void main(String a[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the light");
		String input=sc.next();
		//Consumer logic or user defined logic
		Switch light=LightFactory.getLight(input);
		if(light!=null){
		light.sOn();
		light.sOff();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}