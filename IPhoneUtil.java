import java.util.Scanner;

class IPhoneUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Smart phone id");
int smartPhoneId=sc.nextInt();
System.out.println("Enter the Price");
double price=sc.nextDouble();
sc.close();
IPhone iphone=new IPhone();
iphone.smartPhoneId=smartPhoneId;
iphone.price=price;
iphone.easeOfWork();
System.out.println(smartPhoneId+" "+price);
}
}