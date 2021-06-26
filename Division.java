class Division{
public static void div(int a,int b){
int c=a/b;
System.out.println(c);
}
public static void div(int a,int b, int d){
int c=a/b/d;
System.out.println(c);
}
public static void main(String a[]){
div(96,8);
div(108,25,5);
}
}