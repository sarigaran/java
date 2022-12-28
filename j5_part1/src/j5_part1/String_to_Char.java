package j5_part1;

import java.util.Scanner;

public class String_to_Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			System.out.println(c);
		}
		
	}

}
