class Films{

String name;
String directedBy;
String hero;
String heroine;
String industry;

public void printFilmsDetails(){
	System.out.println(name+" "+directedBy+" "+hero+" "+heroine+""+industry);
}

public Films(String nam,String directed,String her,String heroi,String indus){
name=nam;
directedBy=directed;
hero=her;
heroine=heroi;
industry=indus;
}

public static void entertainment(){
	System.out.println("Films are there for entertainment");
}
}