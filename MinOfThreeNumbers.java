class MinOfThreeNumbers{

public static void main(String a[]){
int num1=68;
int num2=220;
int num3=25;

if(num1<num2){
if(num1<num3){
System.out.println(num1+" is minimum number");
}
else{
System.out.println(num3+" is minimum number");
}
}
else{
if(num2<num3){
System.out.println(num2+" is minimum number");
}
else{
System.out.println(num3+" is minimum number");
}
}
}
}