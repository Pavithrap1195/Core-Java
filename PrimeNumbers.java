class PrimeNumbers{
public static void main(String a[]){
int num= 54;
boolean isPrime=false;
for(int i=2;i<=num/2;i++){
//condition for non prime
if(num%i==0){
isPrime=true;
}
}
if(!isPrime){
System.out.println(num+" is a Prime Number");
}
else{
System.out.println(num+" not a Prime Number");
}
}
}
