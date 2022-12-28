package j6_part1;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the count");
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);
				for (int i = 0; i < count; i++) {
					n3=n1+n2;
					System.out.print(" "+n3);
					n1=n2;
					n2=n3;
				}

	}

}
