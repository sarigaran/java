package j5_part2;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
	String dbuser="admin";
	String dppassword="admin@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String U=sc.nextLine();
		System.out.println("Enter the password");
		String P=sc.nextLine();
	if (U.equalsIgnoreCase(dbuser)&&P.equals(dppassword)) {
		System.out.println("login successfully");
	} else {
System.out.println("login failed please enter the correct password");
	}	
	}

}
