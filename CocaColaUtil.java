import java.util.Scanner;

class CocaColaUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the SoftDrink ID");
int softDrinkId=sc.nextInt();
System.out.println("Enter the Price");
double price=sc.nextDouble();
System.out.println("Enter the color");
String color=sc.next();
System.out.println("Enter the quantity in litres");
int qtyInLitres=sc.nextInt();
sc.close();
CocaCola coca=new CocaCola();
coca.softDrinkId=softDrinkId;
coca.price=price;
coca.color=color;
coca.qtyInLitres=qtyInLitres;
coca.relaxation();
System.out.println(softDrinkId+" "+price+" "+color+" "+qtyInLitres);
}
}