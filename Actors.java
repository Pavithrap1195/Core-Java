class Actors{

String name;
String bornOn;
String industry;
String awards;

public void printActorsDetails(){
System.out.println(name+" "+bornOn+" "+industry+" "+awards);
}
public Actors(String na,String born,String indust,String award){
name=na;
bornOn=born;
industry=indust;
awards=award;
}
public static void entertainingFans(){
	System.out.println(" Respect all the Actors");
}
}