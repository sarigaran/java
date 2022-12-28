package example.java;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		   System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.println("how many times");
	int m=sc.nextInt();
	System.out.println("table");
	for (int i = 0; i <=m; i++) {
		System.out.println(i+" * "+n+" = "+n*i);
	}

	}

}
