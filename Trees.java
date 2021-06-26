class Trees{

String name;
String kingdom;
String family;
String order;

public Trees(String name,String kingdom,String family,String order){
	this.name=name;
	this.kingdom=kingdom;
	this.family=family;
	this.order=order;
}


public static void getHealth(){
System.out.println("Save trees");
}
public void printTreesDetails(){
System.out.println(this.name+" belongs to "+this.kingdom+" kingdom , "+this.family+" family , "+this.order+" order ");
}

}