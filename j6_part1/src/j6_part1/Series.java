package j6_part1;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int n3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int count=sc.nextInt();
		for (int i = 0; i < count; i++) {
			n3=n3+i;
			System.out.println(n3);
			
		}
	}

}

