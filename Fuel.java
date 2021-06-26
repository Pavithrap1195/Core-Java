class Fuel{

String name;
String composition;
String color;
String usedIn;

public void printFuelDetails(){
System.out.println(name+" "+composition+" "+color+" "+usedIn);
}

public Fuel(String na,String compos,String colo,String used){
	name=na;
	composition=compos;
	color=colo;
	usedIn=used;
}

public static void provideEnergy(){
	System.out.println("Fuel provides energy services");
}
	
}