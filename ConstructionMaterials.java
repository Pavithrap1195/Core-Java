class ConstructionMaterials{

String name;
double densityIngpm3;
String purpose;
int unitWeightInKgpm3;

public void printConsMaterials(){
	System.out.println(name+" "+densityIngpm3+" "+purpose+" "+unitWeightInKgpm3);
}

public ConstructionMaterials(String nam,double densityIn,String purpos,int unitWeightIn){
name=nam;
densityIngpm3=densityIn;
purpose=purpos;
unitWeightInKgpm3=unitWeightIn;
}

public static void construction(){
System.out.println(" Civil Engineers");
}
}