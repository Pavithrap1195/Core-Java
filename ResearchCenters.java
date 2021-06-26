class ResearchCenters{

String name;
String formedOn;
String type;
String chairman;
String headquarters;

public void printResearchCentersDetails(){
System.out.println(this.name+" "+this.formedOn+" "+this.type+" "+this.chairman+" "+this.headquarters);
}

public ResearchCenters(String name,String formedOn,String type,String chairman,String headquarters){
this.name=name;
this.formedOn=formedOn;
this.type=type;
this.chairman=chairman;
this.headquarters=headquarters;
}

public static void doingResearch(){
System.out.println("Research center is an establishment founded for doing research");
}
}