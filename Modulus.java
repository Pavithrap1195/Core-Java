class Modulus{
public static void mod(int a, int b){
int c=a%b;
System.out.println(c);
}
public static void mod(int a, int b, int d){
int c=a%b%d;
System.out.println(c);
}
public static void main(String a[]){
	mod(98,38);
	mod(98,86,62);
}
}