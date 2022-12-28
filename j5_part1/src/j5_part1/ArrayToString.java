package j5_part1;

import java.util.Scanner;

public class ArrayToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		char ch= sc.next().charAt(2); 
		String str=" "+ch;
		System.out.println(str);
	}

}
