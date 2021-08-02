package com.xworkz.findncr;

public class FindNcr {
	public static int ncr(int n,int r) {
		return myFact(n)/(myFact(r)*myFact(n-r));
		}
	public static int myFact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
		}
	public static void main(String a[]) {
		int n=6,r=5;
		System.out.println("The entered value of n is "+n);
		System.out.println("The entered value of r is "+r);
		if(n>=r) {
			System.out.println("The value of"+n+"C"+r+"="+ncr(n,r));
		}
		else {
			System.out.println("n value should be greater than or equals to r value");
		}
		
		
		
	}

}
