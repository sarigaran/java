package j6_part1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, mul = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            mul = mul * i;
        }
        System.out.println("Factorial of "+n+" :"+mul);

	}

}


