import java.util.Scanner;

class RajkumarUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First movie");
String firstMovie=sc.nextLine();
System.out.println("Enter the Actor Id");
int actorId=sc.nextInt();
System.out.println("Enter the Industry");
String industry=sc.next();
sc.close();
Rajkumar raj=new Rajkumar();
raj.actorId=actorId;
raj.industry=industry;
raj.firstMovie=firstMovie;
raj.entertainment();
System.out.println(actorId+" "+industry+" "+firstMovie);
}
}