import java.util.Scanner;

class DoloUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Medicine ID");
int medicineId=sc.nextInt();
System.out.println("Enter the Price");
double price=sc.nextDouble();
System.out.println("Enter the Manufactured date");
String manufacturedDate=sc.next();
System.out.println("Enter the Expiry date");
String expiryDate=sc.next();
sc.close();
Medicine med=new Dolo();
med.medicineId=medicineId;
med.price=price;
med.manufacturedDate=manufacturedDate;
med.expiryDate=expiryDate;
med.recover();
System.out.println(medicineId+" "+price+" "+manufacturedDate+" "+expiryDate);
}
}