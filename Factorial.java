class Factorial{

public static void main(String a[]){
 int factorial =myFact(5);
 System.out.println(factorial);
int value =myFact(6);
 System.out.println(value);
int output =myFact(7);
 System.out.println(output);
 }
 public static int myFact(int num){
 int f=1;
 for(int i=1;i<=num;i++){
 f=f*i;
 
 }
 return f;
 }
}