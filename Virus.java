class Virus{

String name;
String symptoms;
String causes;
int durationInDays;

public void printVirusDetails(){
System.out.println(this.name+" "+this.symptoms+ " "+this.causes+" "+this.durationInDays);
}

public Virus(String name,String symptoms,String causes,int durationInDays){
this.name=name;
this.symptoms=symptoms;
this.causes=causes;
this.durationInDays=durationInDays;
}

public static void infectiousAgent(){
System.out.println("A virus is a submicroscopic infectious agent that replicates only inside the living cells of an organism.");
}
}