import java.util.Scanner;

class ArijitSinghUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Born on,singer id,no of filmfare awards");
String bornOn=sc.nextLine();
int singerId=sc.nextInt();
int noOfFilmfareAwards=sc.nextInt();
sc.close();
ArijitSingh arijit=new ArijitSingh();
arijit.singerId=singerId;
arijit.bornOn=bornOn;
arijit.noOfFilmfareAwards=noOfFilmfareAwards;
arijit.relaxation();
System.out.println(singerId+" "+bornOn+" "+noOfFilmfareAwards);
}
}