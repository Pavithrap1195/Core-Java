class Novel{

String name;
String type;
String author;
String releasedOn;

public Novel(){
this("Life's amazing secret","non fictional","Gaur Gopal Das","17 September 2018");
}

public Novel(String name,String type,String author,String releasedOn){
this.name=name;
this.type=type;
this.author=author;
this.releasedOn=releasedOn;
novelDetails();
}

public void novelDetails(){
System.out.println(this.name+" "+this.type+" "+this.author+" "+this.releasedOn);
}

public void gainKnowledge(){
System.out.println("Reading novels is good habbit");
}

public void gainKnowledge(String relaxation){
System.out.println("Reading novels also give some "+ relaxation+" for mind");
}
}