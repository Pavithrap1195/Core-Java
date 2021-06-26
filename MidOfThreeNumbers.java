class MidOfThreeNumbers{
public static void main(String a[]){
int num1=56;
int num2=68;
int num3=28;

if(num1>num2){
	if(num2>num3){
	System.out.println(num2+"is a middle number");
	}
else if(num3>num1){
	System.out.println(num1+"is a middle number");
}
else{
	System.out.println(num3+"is a middle number");
}
}
else{
	if(num2<num3){
		System.out.println(num2+"is a middle number");
	}
	else if(num3<num1){
	System.out.println(num1+"is a middle number");
}
else{
	System.out.println(num3+"is a middle number");
}
}
}
}