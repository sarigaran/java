package j6_part2;

import java.util.Scanner;

public class Second_large_small {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,9};
	int n=a.length;
	int temp = 0;
	int sum=0;
		for (int i = 0; i <a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.println(a[i]);
			
		}
		System.out.println(a[0]+" is small");
		System.out.println(a[n-1]+" is  largest number" );
		System.out.println(a[n-2]+" is 2 largest number" );
	}

}
