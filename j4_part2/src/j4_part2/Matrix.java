package j4_part2;

import java.util.Iterator;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		System.out.println("enter the coloum");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		
		System.out.println("enter the element");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j]=sc.nextInt();
			}		
		}
			
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
				
			
		

	}

}
