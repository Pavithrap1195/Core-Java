import java.util.Scanner;

class DeathUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Novel Id");
int novelId= sc.nextInt();
System.out.println("Enter the Author");
String author= sc.next();
System.out.println("Enter the No of pages");
int noOfPages= sc.nextInt();
System.out.println("Enter the Price");
double price= sc.nextDouble();
sc.close();
Novel novel=new Death();
novel.novelId=novelId;
novel.author=author;
novel.noOfPages=noOfPages;
novel.price=price;
System.out.println(novelId+" "+author+" "+noOfPages+" "+price);
novel.gainingKnowledge(58);
}
}