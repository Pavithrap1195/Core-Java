import java.util.Scanner;

class VaccineUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the covaxin details");
System.out.println("Enter the vaccine id");
int vaccineId=sc.nextInt();
System.out.println("Enter the founded by");
String foundBy=sc.next();
System.out.println("Enter the no of doses");
int noOfDoses=sc.nextInt();
System.out.println("Enter the covishield details");
System.out.println("Enter the vaccine id");
int vaccineId1=sc.nextInt();
System.out.println("Enter the founded by");
String foundBy1=sc.next();
System.out.println("Enter the no of doses");
int noOfDoses1=sc.nextInt();
sc.close();

CoviShield shield =new CoviShield();
shield.vaccineId=vaccineId;
shield.foundBy=foundBy;
shield.noOfDoses=noOfDoses;
shield.activeImmunity();
System.out.println(vaccineId+" "+foundBy+" "+noOfDoses);
System.out.println(vaccineId1+" "+foundBy1+" "+noOfDoses1);
}
}