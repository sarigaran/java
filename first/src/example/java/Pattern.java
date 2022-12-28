package example.java;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		int i,j;
for ( i= 0; i < row; i++) {
	for ( j = 0; j<i; j++) {
		System.out.print(i);
	}
	System.out.println();
}

	

	//Triangle Pattern 
			for(i=1;i<=3;i++) {
				for( j=1;j<=3;j++) {
					if(i>=j) {
					System.out.print("*"+" ");
					}
				}
				System.out.println();
			}
	System.out.println("-----------------------");
			//Triangle Pattern (Reverse) 
			for(i=1;i<=3;i++) {
				for( j=1;j<=3;j++) {
					if(i<=j) {
					System.out.print("*"+" ");
					}
				}
				System.out.println();
			}
	System.out.println("-----------------------");
	//Triangle Pattern 
			for(i=1;i<=3;i++) {
				for(j=3;j>=1;j--) {
					if(i>=j) {
					System.out.print("* "); //space for pyramid
					}else {
					System.out.print(" ");	
					}
				}
				System.out.println();
			}
			System.out.println("-----------------------");
			//Triangle Pattern (Reverse) 
			for(i=3;i>=1;i--) {
				for(j=3;j>=1;j--) {
					if(i>=j) {
					System.out.print("* ");
					}else {
					System.out.print(" ");	
					}
				}
				System.out.println();
			}
	System.out.println("-----------------------");
		}

	

}
