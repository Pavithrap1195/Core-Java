class Novels{

String name;
String type;
String author;
String releasedOn;

public void printNovelsDetails(){
	System.out.println(name+" "+type+" "+author+" "+releasedOn);
}

public Novels(String nam,String typ,String auth,String release){
name=nam;
type=typ;
author=auth;
releasedOn=release;
}

public static void gainKnowledge(){
	System.out.println("Reading novels is good habbit and also give satisfaction for mind");
}
}