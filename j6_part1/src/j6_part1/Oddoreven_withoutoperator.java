package j6_part1;

import java.util.Scanner;

public class Oddoreven_withoutoperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
				int n=sc.nextInt();
					if ((n/2)*2==n) {
						System.out.println(n+" even");
					
					}else {
						
						System.out.println("odd");
					}
	}

}



