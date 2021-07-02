import java.util.Scanner;

class FarmingTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Old farming details");
System.out.println("Enter the equipment used");
String equipmentUsed=sc.next();
System.out.println("Enter that it will give high yield ");
boolean isHighYield=sc.nextBoolean();
System.out.println("Enter that crops are organic");
boolean isOrganic=sc.nextBoolean();
System.out.println("Enter the Mid farming details");
System.out.println("Enter the equipment used");
String equipmentUsed1=sc.next();
System.out.println("Enter that it will give high yield ");
boolean isHighYield1=sc.nextBoolean();
System.out.println("Enter that crops are organic");
boolean isOrganic1=sc.nextBoolean();
System.out.println("Enter the New farming details");
System.out.println("Enter the equipment used");
String equipmentUsed2=sc.next();
System.out.println("Enter that it will give high yield ");
boolean isHighYield2=sc.nextBoolean();
System.out.println("Enter that crops are organic");
boolean isOrganic2=sc.nextBoolean();
sc.close();
NewFarming newf=new NewFarming();
newf.equipmentUsed=equipmentUsed2;
newf.isHighYield=isHighYield2;
newf.isOrganic=isOrganic2;
newf.growingCrops();
System.out.println(equipmentUsed+" "+isHighYield+" "+isOrganic);
System.out.println(equipmentUsed1+" "+isHighYield1+" "+isOrganic1);
System.out.println(equipmentUsed2+" "+isHighYield2+" "+isOrganic2);
}
}