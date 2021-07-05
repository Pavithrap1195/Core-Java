import java.util.Scanner;

class IPhoneUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Smart phone id");
int smartPhoneId=sc.nextInt();
System.out.println("Enter the Price");
double price=sc.nextDouble();
sc.close();
SmartPhone sp=new IPhone();
sp.smartPhoneId=smartPhoneId;
sp.price=price;
sp.easeOfWork();
System.out.println(smartPhoneId+" "+price);
}
}