package j4_part2;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int sum=7;
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the element");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		
for (int i = 0; i < array.length; i++) {
	for (int j = i+1; j < array.length; j++) {
		if (array[i]+array[j]==sum) {
			System.out.println(array[i]+" + "+array[j]+" = 7");
		}
		
	}
}
	}

}
