class WondersOfIndia{

String name;
String builtOn;
String location;
String height;
double areaInHectares;

public void printWondersOfIndiaDetails(){
	System.out.println(name+" "+builtOn+" "+location+" "+height+" "+areaInHectares);
}

public WondersOfIndia(String nam,String built,String locate,String heig,double area){
name=nam;
builtOn=built;
location=locate;
height=heig;
areaInHectares=area;
}

public static void touristplaces(){
	System.out.println("There are 7 wonders in India");
}
}