package com.java;

public class Reverse_word {

	public static void main(String[] args) {
		String s= "java program";
		String rev=" ";
		String r=" ";
		String res[]=s.split(" ");
		for (int i = 0; i < res.length; i++) {
		
			for (int j = res[i].length()-1;j >= 0; j--) {
				r=r+res[i].charAt(j);
				
			}
			rev=rev+r+"";
		}
		System.out.println(rev);
	}

}
