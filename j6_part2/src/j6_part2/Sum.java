package j6_part2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		 int n, sum = 0;
	        double average;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements :");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum:"+sum);
	        average = sum / n;
	        System.out.println("Average:"+average);


	}

}
