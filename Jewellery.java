class Jewellery{

String name;
String symbol;
int pricePergm;
int atomicNumber;

public Jewellery(){
this("Gold","Au",4800);
System.out.println("With zero parameters");
}

public Jewellery(String name,String symbol,int pricePergm){
this(79);
System.out.println("With three parameters");
this.name=name;
this.symbol=symbol;
this.pricePergm=pricePergm;
jewelleryDetails();
}

public void jewelleryDetails(){
System.out.println(this.name+" "+this.symbol+" "+this.pricePergm+" "+this.atomicNumber);
}

public Jewellery(int atomicNumber){
System.out.println("With one parameter");
this.atomicNumber=atomicNumber;
}


public void fashion(){
System.out.println("Jewellery is precious ornament");
}

public void fashion(String earrings){
System.out.println(earrings+ " which is made up of gold is very nice");
}
}