package org.java;

public class armstrong {

	public static void main(String[] args) {
		int num=154,rem=0,arm=0;
		while(num!=0)
		{
			
		rem=num%10;
		arm=arm+(rem*rem*rem);
		num=num/10;		
							
	}System.out.println("armstrong"+arm);

}}
