class Scientist{

String name;
String bornOn;
String knownFor;
String field;
String diedOn;

public Scientist(){
System.out.println("With zero parameter");
}

public Scientist(String name,String bornOn,String knownFor, String field,String diedOn){
this();
System.out.println("With parameters");
this.name=name;
this.bornOn=bornOn;
this.knownFor=knownFor;
this.field=field;
this.diedOn=diedOn;
System.out.println(this.name+" "+this.bornOn+" "+this.knownFor+" "+this.field+" "+this.diedOn);
}

public void inventions(){
System.out.println("A scientist is a person who conducts scientific research");
}

public void inventions(String sceince){
System.out.println("Invention of"+sceince);
}
}















