import java.util.Scanner;

class MaggiUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Food Id");
int foodId=sc.nextInt();
System.out.println("Enter the Price");
double price=sc.nextDouble();
System.out.println("Enter the Manufactured by");
String manufacturedBy=sc.next();
sc.close();
Maggi maggi =new Maggi();
maggi.foodId=foodId;
maggi.price=price;
maggi.manufacturedBy=manufacturedBy;
maggi.provideNutritionalSupport();
System.out.println(foodId+" "+price+" "+manufacturedBy);
}
}