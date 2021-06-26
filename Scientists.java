class Scientists{

String name;
String bornOn;
String knownFor;
String field;
String diedOn;

public void printScientistsDetails(){
	System.out.println(name+" "+bornOn+" "+knownFor+" "+field+" "+diedOn);
}

public Scientists(String nam,String born,String known,String fiel,String died){
name=nam;
bornOn=born;
knownFor=known;
field=fiel;
diedOn=died;
}

public static void inventions(){
	System.out.println("A scientist is a person who conducts scientific research");
}
}