class Softwares{

String name;
String developer;
String type;
String initialRelease;

public void printSoftwaresDetails(){
	System.out.println(this.name+" "+this.developer+" "+this.type+" "+this.initialRelease);
}

public Softwares(String name,String developer,String type,String initialRelease){
	this.name=name;
	this.developer=developer;
	this.type=type;
	this.initialRelease=initialRelease;
}

public static void easeOfWork(){
	System.out.println(" Softwares makes works easy");
}
}