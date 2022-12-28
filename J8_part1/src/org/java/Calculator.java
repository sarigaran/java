package org.java;

public class Calculator {
	int sum(int a,int b) {
		int sum=a+b;
		System.out.println("sum = "+sum);
		return sum;	
	}
	int diff(int a,int b) {
		int dif=a/b;
		System.out.println("diff = "+dif);
		return dif;
	}
	int porduct(int a,int b) {
		int pro=a*b;  
		System.out.println("product = "+pro);
		return pro;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("output :");
		cal.sum(5, 7);
		cal.diff(23, 5);
		cal.porduct(4, 5);
	}
}
