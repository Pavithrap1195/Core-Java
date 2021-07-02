import java.util.Scanner;

class MonumentTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the TajMahal location");
String location=sc.next();
System.out.println("When was TajMahal built");
int builtOn=sc.nextInt();
System.out.println("Enter the Charminar location");
String location1=sc.next();
System.out.println("When was Charminar built");
int builtOn1=sc.nextInt();
sc.close();
TajMahal taj=new TajMahal();
taj.location=location;
taj.builtOn=builtOn;
Charminar charm=new Charminar();
charm.location=location1;
charm.builtOn=builtOn1;
charm.tourismSpot();
System.out.println(location+" "+builtOn);
System.out.println(location1+" "+builtOn1);
}
}