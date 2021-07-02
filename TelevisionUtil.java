import java.util.Scanner;

class TelevisionUtil{

public static void main(String a[]){ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the details of old television");
System.out.println("Enter the television is coloured");
boolean isColoured=sc.nextBoolean();
System.out.println("Enter the model");
int model=sc.nextInt();
System.out.println("Enter the price");
double price=sc.nextDouble();
System.out.println("Enter the television is bluetooth available");
boolean isBluetoothAvailable=sc.nextBoolean();
System.out.println("Enter the details of mid television");
System.out.println("Enter the television is coloured");
boolean isColoured1=sc.nextBoolean();
System.out.println("Enter the model");
int model1=sc.nextInt();
System.out.println("Enter the price");
double price1=sc.nextDouble();
System.out.println("Enter the television is bluetooth available");
boolean isBluetoothAvailable1=sc.nextBoolean();
System.out.println("Enter the details of new television");
System.out.println("Enter the television is coloured");
boolean isColoured2=sc.nextBoolean();
System.out.println("Enter the model");
int model2=sc.nextInt();
System.out.println("Enter the price");
double price2=sc.nextDouble();
System.out.println("Enter the television is bluetooth available");
boolean isBluetoothAvailable2=sc.nextBoolean();
sc.close();

NewTelevision tele=new NewTelevision();
tele.isColoured=isColoured;
tele.model=model;
tele.price=price;
tele.isBluetoothAvailable=isBluetoothAvailable;
tele.entertainment();
System.out.println(isColoured+" "+model+" "+price+" "+isBluetoothAvailable);
System.out.println(isColoured1+" "+model1+" "+price1+" "+isBluetoothAvailable1);
System.out.println(isColoured2+" "+model2+" "+price2+" "+isBluetoothAvailable2);


}










}