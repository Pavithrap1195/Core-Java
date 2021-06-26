class Museums{

String name;
String established;
String location;
String type;
String director;

public void printMuseumsDetails(){
System.out.println(this.name+" "+this.established+" "+this.location+" "+this.type+" "+this.director);
}

public Museums(String name,String established,String location,String type,String director){
this.name=name;
this.established=established;
this.location=location;
this.type=type;
this.director=director;
}

public static void collection(){
System.out.println("A museum is an institution that cares for a collection of artifacts and other objects of artistic, cultural, historical, or scientific importance.");
}
}