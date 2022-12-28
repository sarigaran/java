package org.java;
import java.util.Scanner;
public class Swap {
	int a;
	int b;
public void swapnumber() {
	int temp;
	temp=a;
	a=b;
	b=temp;
}
	public static void main(String[] args) {
		Swap obj=new Swap();
		Scanner sc=new Scanner(System.in);               
		System.out.print("Enter the first number: ");  
		obj.a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		obj.b = sc.nextInt();
		
		obj.swapnumber();

System.out.println("After swapping: a= " + obj.a + ", b= " + obj.b);
	}



}
