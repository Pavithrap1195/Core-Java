class Minerals{

String name;
String symbol;
int atomicNumber;
double densityIngpcm3;
String color;

public void printMineralsDetails(){
	System.out.println(name+" "+symbol+" "+atomicNumber+" "+densityIngpcm3+" "+color);
}

public Minerals(String nam,String symb,int atomic,double density,String col){
name=nam;
symbol=symb;
atomicNumber=atomic;
densityIngpcm3=density;
color=col;
}

public static void naturallyoccuring(){
	System.out.println("Mineral is a chemical compound");
}
}