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
Food food =new Maggi();
food.foodId=foodId;
food.price=price;
food.manufacturedBy=manufacturedBy;
food.provideNutritionalSupport();
System.out.println(foodId+" "+price+" "+manufacturedBy);
}
}