class Cafe{

String name;
String location;
String timings;

public Cafe(){
this("Dyu art cafe","Kormangala","10am to 10pm");
System.out.println("With zero parameter");
}

public Cafe(String name,String location,String timings){
System.out.println("With three parameters");
this.name=name;
this.location=location;
this.timings=timings;
cafeDetails();
}

public void cafeDetails(){
System.out.println(this.name+" "+this.location+" "+this.timings);
}

public void freshness(){
System.out.println("Visiting cafe gives us freshness and relaxation");
}

public void freshness(String beaverages){
System.out.println(beaverages+" gives relaxation for the mind");
}
}