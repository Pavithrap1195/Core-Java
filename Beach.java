class Beach{

String name;
String location;

public Beach(){
this("Kaup beach","Udupi");
}

public Beach(String name,String location){
this.name=name;
this.location=location;
beachDetails();
}

public void beachDetails(){
System.out.println(this.name+" "+this.location);
}

public void recreation(){
System.out.println("All love beaches");
}

public void recreation(String shells){
System.out.println("In all beaches we can see types of "+ shells + " available");
}
}