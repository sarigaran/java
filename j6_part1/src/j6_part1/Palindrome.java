package j6_part1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum = 0;
		int m=n;
		int rev=0;
		
		
		while(n>0) {
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		if (m==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
