import java.util.Scanner;

class WaterUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the liquid id");
int liquidId=sc.nextInt();
System.out.println("Enter the formula");
String formula=sc.next();
System.out.println("Enter the color");
String color=sc.next();
sc.close();
Water water =new Water();
water.liquidId=liquidId;
water.formula=formula;
water.color=color;
water.incompressibleFluid();
System.out.println(liquidId+" "+formula+" "+color);
}

}