package j5_part2;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
			String name=sc.next();
			String rev="";
				for (int i = name.length()-1;i>=0 ;i--) {
					rev+=name.charAt(i);
			
	}
				System.out.println("reverse = "+rev);	
				if (rev.equals(name)) {
					System.out.println("palindrome");
				} else {
					System.out.println("not a palindrome");
				}
	}

}
