import java.util.Scanner;

class TeachingUtil{

public static void main(String a[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Profession Id");
int professionId=sc.nextInt();
System.out.println("Enter the location");
String location=sc.next();
sc.close();
Teaching teach=new Teaching();
teach.professionId=professionId;
teach.location=location;
teach.learning();
System.out.println(professionId+" "+location);
}
}