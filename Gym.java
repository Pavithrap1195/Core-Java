class Gym{

String name;
String location;
boolean isAerobicAvailable;
String timings;

public Gym(){
this("Silverstone Fitness","Bharatnagar",true,"6am to 8pm");
}

public Gym(String name,String location,boolean isAerobicAvailable,String timings){
this.name=name;
this.location=location;
this.isAerobicAvailable=isAerobicAvailable;
this.timings=timings;
gymDetails();
}

public void gymDetails(){
System.out.println(this.name+" "+this.location+" "+this.isAerobicAvailable+" "+this.timings);
}

public void exercise(){
System.out.println("Gym is a place with number of equipments and machines");
}

public void exercise(String athletics){
System.out.println("Gym is the more important for the "+ athletics);
}
}