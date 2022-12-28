package j5_part2;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str =sc.nextLine();
		
		String s1[]=str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}
